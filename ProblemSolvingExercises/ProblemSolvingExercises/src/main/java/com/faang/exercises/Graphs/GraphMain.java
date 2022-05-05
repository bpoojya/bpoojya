package com.faang.exercises.Graphs;

public class GraphMain {
    public static void main(String args[]){
        //populate graph
        Graph<Integer> graph= new Graph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(2,3,false);
        graph.addEdge(1,2,false);
        graph.addEdge(1,4,false);
        graph.addEdge(3,6,false);
        graph.addEdge(2,5,false);
        System.out.println(graph.shortestPath(1,3,0));


    }
}
