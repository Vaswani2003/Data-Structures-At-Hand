import java.util.*;

public class AdjacencyList{
    static class Graph{
        int V;

        ArrayList< ArrayList<Integer>> adjList = new ArrayList<>();

        Graph(int V){
            this.V = V;

            for(int i=0; i<V; i++){
                adjList.add(new ArrayList<>());
            }
        }

        void addEdge(int source, int destination, boolean isDirected){
            adjList.get(source).add(destination);

            if(isDirected == false){
                adjList.get(destination).add(source);
            }
        }

        void printGraph(){
            int i, j;
            for(i=0; i < V; i++){
                System.out.print(i+"-> ");
				int temp = adjList.get(i).size();
                for(j=0; j<temp; j++){
                  	if (j == temp-1){
                    	System.out.println(adjList.get(i).get(j));
                    }
                  else{
                    System.out.print(adjList.get(i).get(j) + "-> ");
                  }
                }
       
            }
        }
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
      
      	for(int k = 0; k < T; k++){
        	int V = sc.nextInt();
          	int E = sc.nextInt();
          
          Graph graph = new Graph(V);
          
          int i;
          
          for(i = 0; i < E; i++){
          	int source = sc.nextInt();
            int desti = sc.nextInt();
            
            graph.addEdge(source, desti, false);
          }
          
          graph.printGraph();

          sc.close();
        }

    }
}
