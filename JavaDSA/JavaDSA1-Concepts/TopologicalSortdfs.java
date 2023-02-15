package JavaDSA1;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDfs{
	static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
    vis[node]=1;
	for(Integer it: adj.get(node)) {
		if(vis[it]==0) {
			findTopoSort(it, vis, adj, st);
		}
	
}
		 st.push(node);
}
	
	static int[] topoSortdfs(int N, ArrayList<ArrayList<Integer>> adj) {
		Stack<Integer> st= new Stack<>();
		int[] vis= new int[N];
		
		for(int i=0;i<N;i++) {
			if(vis[i]==0) {
				findTopoSort(i, vis, adj, st);
			}
		}
		
		int topo[]= new int [N];
		int ind=0;
		while (!st.isEmpty()) {
			topo[ind++]=st.pop();
		}
		//for(int i=0; i<N; i++) System.out.printLn(topo[i]+ " ");
		return topo;
	}
}

