package javaDSA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int first;
    int second;
    public Node(int first, int second){
         this.first=first;
         this.second=second;
    }
}

public class CycleDetectionBFS {
    static boolean checkforCycle(ArrayList<ArrayList<Integer>> adj , int i, boolean vis[]){
        Queue <Node> q= new LinkedList<>();
        q.add(new Node(i, -1));
        vis[i]= true;
    while(!q.isEmpty())
    {
        int node= q.peek().first;
        int par=   q.peek().second;
        q.remove();

        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                q.add(new Node(it, node));
                vis[it]=true;
            }

            else if (par == it) return true;
        }
    } 
return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[]= new boolean[V+1];
        Arrays.fill(vis, false);

        for(int i=1;i<=V; i++){
            if(vis[i]=false)
            if(checkforCycle(adj, i, vis))
            return true;
        }
            return false;
        
        }      
    }

    
