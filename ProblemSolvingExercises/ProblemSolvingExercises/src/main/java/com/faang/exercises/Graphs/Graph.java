package com.faang.exercises.Graphs;

import java.util.*;

public class Graph<T> {
    Map<T, List<T>> adjacenyMap = new HashMap<>();

    public void addVertex(T source) {
        adjacenyMap.put(source, new LinkedList<>());

    }


    public void addEdge(T source, T destination, boolean bidirectional) {
        if (!adjacenyMap.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacenyMap.containsKey(destination)) {
            addVertex(destination);
        }
        adjacenyMap.get(source).add(destination);
        if (bidirectional) {
            adjacenyMap.get(destination).add(source);
        }
    }

    public int countNodes() {
        return adjacenyMap.size();
    }

    public int getEdgesCount(boolean bidirectional) {
        int size = 0;
        for (List<T> list : adjacenyMap.values())
            size += list.size();
        if (bidirectional) size = size / 2;
        return size;

    }

    public boolean hasNode(T node) {
        return adjacenyMap.containsKey(node);
    }

    public boolean hasEdge(T source, T destination) {
        if (adjacenyMap.containsKey(source) && adjacenyMap.containsKey(destination)) {
            List<T> list = adjacenyMap.get(source);
            return list.contains(destination);
        } else {
            return false;
        }
    }

    void bfs() {
        Queue<T> queue = new LinkedList<>();
        Map<T, Boolean> visited = new HashMap<>();

        T key = adjacenyMap.keySet().stream().findFirst().get();
        queue.add(key);
        visited.put(key, true);
        while (!queue.isEmpty()) {
            T node = queue.poll();
            System.out.println(node);
            List<T> list = adjacenyMap.get(node);
            int i = 0;
            while (i < list.size()) {
                if (!visited.containsKey(list.get(i))) {
                    queue.add(list.get(i));
                }
                i++;
            }
        }
    }

    void dfs() {

        List<T> visted = new LinkedList<>();
        T key = adjacenyMap.keySet().stream().findFirst().get();
        dfsUtil(visted, key);
    }

    void dfsUtil(List<T> visited, T key) {

        visited.add(key);
        System.out.println(key);
        Iterator<T> itr= adjacenyMap.get(key).listIterator();
        while (itr.hasNext()){
            dfsUtil(visited, itr.next());
        }

    }
   public  int shortestPath(T source, T destination, int depth){
        int parent[]= new int[adjacenyMap.size()];
        if(!adjacenyMap.containsKey(source) || !adjacenyMap.containsKey(destination)) return depth;
        else{
            List<T> list= adjacenyMap.get(source);
            if(list.contains(destination)) return depth+1;
            else{
                Iterator itr= list.listIterator();
              while(itr.hasNext()){
                 return shortestPath((T)itr.next(),destination,depth+1);
              }
            }
        }


    }

}

