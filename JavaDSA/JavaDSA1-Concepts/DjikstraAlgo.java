package JavaDSA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.PriorityQueue;


//Vertex.java, Edge.java, DijkstraAlgo.java, App.java
public class DjikstraAlgo {
static class Vertex implements Comparable<Vertex> {

	private String name;
	private boolean visited;
	private List<Edge> adjacencyList;
	// distance from the starting vertex (source)
	private double distance;
	// the previous vertex on the shortest path
	private Vertex predecessor;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<>();
		this.distance = Double.MAX_VALUE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	public void addNeighbor(Edge edge) {
		this.adjacencyList.add(edge);
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		// v1 < v2 if v1.distance < v2.distance
		// v2 < v1 if v2.distance < v1.distance
		return Double.compare(this.distance, otherVertex.getDistance());
	}

	@Override
	public String toString() {
		return name + "-" + distance;
	}	
}

 static class Edge {

	private double weight;
	private Vertex startVertex;
	private Vertex targetVertex;
	
	public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public double getWeight() {
		return weight;
	}
 
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
}

static class DijkstraAlgorithm {

	public void computePath(Vertex source) {
		
		source.setDistance(0);
		
		// heap 
		PriorityQueue<Vertex> queue = new PriorityQueue<>();
		queue.add(source);
		
		while(!queue.isEmpty()) {
			
			Vertex actualVertex = queue.poll();
			
			for(Edge edge : actualVertex.getAdjacencyList()) {
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double d = actualVertex.getDistance() + edge.getWeight();
				
				if(d < v.getDistance()) {
					// there is a shorter path to vertex v
					// IS IT WORKING FINE?
					// O(N) and of course O(logN) would be better
					queue.remove(v);
					v.setDistance(d);
					v.setPredecessor(actualVertex);
					queue.add(v);
				}
			}
		}
	}
	
	public List<Vertex> getShortestPathTo(Vertex targetVertex) {
		
		List<Vertex> path = new ArrayList<>();
		
		for(Vertex vertex=targetVertex;vertex!=null;vertex=vertex.getPredecessor())
			path.add(vertex);
		
		Collections.reverse(path);
		
		return path;
	}
}



	public static void main(String[] args) {
		
			Vertex vertex0 = new Vertex("A"	);	
			Vertex vertex1 = new Vertex("B"	);	
			Vertex vertex2 = new Vertex("C"	);	
			Vertex vertex3 = new Vertex("D"	);	
			Vertex vertex4 = new Vertex("E"	);	
			Vertex vertex5 = new Vertex("F"	);	
			Vertex vertex6 = new Vertex("G"	);
			Vertex vertex7 = new Vertex("H"	);
			
			vertex0.addNeighbor(new Edge(5, vertex0, vertex1));
			vertex0.addNeighbor(new Edge(9, vertex0, vertex4));
			vertex0.addNeighbor(new Edge(8, vertex0, vertex7));
			
			vertex1.addNeighbor(new Edge(12, vertex1, vertex2));
			vertex1.addNeighbor(new Edge(15, vertex1, vertex3));
			vertex1.addNeighbor(new Edge(4, vertex1, vertex7));
			
			vertex2.addNeighbor(new Edge(3, vertex2, vertex3));
			vertex2.addNeighbor(new Edge(11, vertex2, vertex6));
			
			vertex3.addNeighbor(new Edge(9, vertex3, vertex6));
			
			vertex4.addNeighbor(new Edge(4, vertex4, vertex5));
			vertex4.addNeighbor(new Edge(20, vertex4, vertex6));
			vertex4.addNeighbor(new Edge(5, vertex4, vertex7));
			
			vertex5.addNeighbor(new Edge(1, vertex5, vertex2));
			vertex5.addNeighbor(new Edge(13, vertex5, vertex7));
			
			vertex7.addNeighbor(new Edge(7, vertex7, vertex2));
			vertex7.addNeighbor(new Edge(6, vertex7, vertex5));
			
			DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
			algorithm.computePath(vertex0);
			
			System.out.println(algorithm.getShortestPathTo(vertex3));
	}
}
