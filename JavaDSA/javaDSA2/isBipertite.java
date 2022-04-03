package javaDSA2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//is graph birpertite DFS?

public class isBipertite {
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the number of Vertex:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		for (int i=0; i<n; i++) {
		adj.add(new ArrayList<Integer>());
		}
		
		adj.get(0).add(1);
		adj.get(1).add(0);
		
		adj.get(1).add(2);
		adj.get(2).add(1);
		
		adj.get(2).add(3);
		adj.get(3).add(2);
		
		adj.get(3).add(4);
		adj.get(4).add(3);
		
		adj.get(4).add(5);
		adj.get(5).add(4);

		adj.get(4).add(6);
		adj.get(6).add(4);

		adj.get(1).add(6);
		adj.get(6).add(1);
		
		
		solutionBp bp= new solutionBp();
		//BipertiteGraph bp= new BipertiteGraph();
		
		if(bp.checkBipertite(adj, n)== true) {
			System.out.println("the graph is bipertite");
		}
		else {
			System.out.println("the graph is not bipertite");
		}
			
	
	}
	static class solutionBp{

		public boolean checkBipertite(ArrayList<ArrayList<Integer>>adj,int n) {
			//creating color array
			int color[]= new int[n];
			for(int i=0 ; i<n; i++) {
				color[i]=-1;
			}
			
			for(int i=0;i<n; i++) {
				if(color[i]==-1) {
					if(!dfscheck(adj,i, color)) {
						return false;
					}
				}
			}
			return true;
		}
		
		
		public boolean dfscheck(ArrayList<ArrayList<Integer>>adj, int node, int color[]) {
			if(color[node]==-1) color[node]=1;
//iterating and changing the color as well as doing a dfs check
			for(Integer it: adj.get(node)) {
				if (color[it] ==-1) {
					color[it]=1- color[node];
					if(!dfscheck(adj, it, color)) {
						return false;
					}
				}	
				else if(color[it]==color[node]) {
				 return false;
				}
			
			}
			return true;	
		}
		
			
		}
	}



