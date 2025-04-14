package com.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindJudge {

    public static void main(String[] args){
        FindJudge fi = new FindJudge();
        fi.findJudge(2, new int[][]{{1,2}});
    }
    public int findJudge(int n, int[][] trust) {

        final List[] adj = new List[n+1];
       for( int i= 1 ;i<n+1;i++){
           adj[i]= (new ArrayList<>());
       }

        for(int[] t:trust){
           final List<Integer> list= adj[t[0]];
           list.add(t[1]);
        }
        for(int i=1;i<adj.length;i++){
            if(adj[i].isEmpty()) return i;
        }

        return -1;

    }
}
