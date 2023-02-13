package JavaDSA1;
import java.util.ArrayList;
import java.util.List;


public class cycleDetectionalgo {
    	
	public static void main(String[] args) {
        System.out.println("cycle detection");
        
        Vertex v0= new Vertex("A");
        Vertex v1= new Vertex("B");
        Vertex v2= new Vertex("C");
        Vertex v3= new Vertex("D");
        Vertex v4= new Vertex("E");
        Vertex v5= new Vertex("F");
        
        //we have to handle this connection 
        v5.addNeighbor(v0);
        v0.addNeighbor(v4);
        v0.addNeighbor(v2);
        v4.addNeighbor(v5);
        v2.addNeighbor(v1);
        v2.addNeighbor(v3);
        List<Vertex> graph= new ArrayList<>();
        graph.add(v0);
        graph.add(v1);
        graph.add(v2);
        graph.add(v3);
        graph.add(v4);
        graph.add(v5);	
        
        cycleDetection algorithm= new cycleDetection();
        algorithm.detectCycles(graph);
            }

            static class cycleDetection {
                public void detectCycles(List<Vertex> graph) {
                    for(Vertex v:graph) {
                        if(!v.isVisited())
                            dfs(v);
                    }
                           }
               
               private void dfs(Vertex vertex) {
                   vertex.setBeingVisted(true);
                   
                   for(Vertex v: vertex.getNeighbours()) {
                       if(v.isBeingVisted()) {
                           System.out.println("Backward Edge.. there is a cycle ");
                           return;
                       }
                       if(v.isVisited()) {
                           v.setVisited(true);
                           dfs(v);
                       }
                       
                   }
                   
                   vertex.setBeingVisted(false);
                   vertex.setVisited(true);
               }	
                       }

                       static class Vertex {
                        private String name;
                        private boolean visited;
                        private boolean BeingVisted;
                        private List <Vertex> adjacenciesList;
                        
                        
                        
                        public Vertex(String name) {
                            this.name=name;
                            this.adjacenciesList= new ArrayList<>();;
                            
                        }
                        
                        
                        public boolean isVisited() {
                            return visited;
                        }
                    
                    
                        public void setVisited(boolean visited) {
                            this.visited = visited;
                        }
                    
                    
                        public boolean isBeingVisted() {
                            return BeingVisted;
                        }
                    
                    
                        public void setBeingVisted(boolean isBeingVisted) {
                            this.BeingVisted = isBeingVisted;
                        }
                    
                    
                        public List<Vertex> getNeighbours() {
                            return adjacenciesList;
                        }
                    
                    
                        public void addNeighbor(Vertex vertex) {
                            this.adjacenciesList.add(vertex);
                        }
                    
                    
                    
                    
                    
                        @Override
                        public String toString() {
                            return "name";
                        }
                    }



    
}
