
import java.util.*;

class AdjacencyMatrix{

    static class Graph{
        int V; // vertex count;
        int E; // edge count;
        boolean isDirected;

        int[][] adjMatrix;

        Graph(int V, int E, boolean isDirected){
            this.V = V;
            this.E = E;
            this.isDirected = isDirected;
          
          	this.adjMatrix = new int[V][E];
        }

        void addEdge(int source, int destination, int weight){
            int i, j;

            for(i = 0; i < V; i++){
                for(j = 0; j < E; j++){
                    if(i == source && j == destination){
                        adjMatrix[i][j] = weight;
                        if(isDirected == false){
                            adjMatrix[j][i] = weight;
                        }
                    }
                }
            }
        }

        void printAdjacencyMatrix(){
            int i, j;
            System.out.println("Adjacency Matrix Representation:");
            for(i=0; i < V; i++){
                for(j=0; j < E; j++){
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        
    }

    public static void main(String[] a){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the number of nodes in the graph");
            int V = sc.nextInt();

            System.out.println("Please enter the number of edges in the graph");
            int E = sc.nextInt();

            System.out.println("Is the graph directed");
            String directed = sc.next();

            boolean isDirected = directed.equals("yes") ? true : false;

            Graph graph = new Graph(V, E, isDirected);
            graph.printAdjacencyMatrix();

            int i;

            for(i=0; i < E; i++){
                System.out.println("Enter the start node, end node and weight of edge no "+(i+1));
                int source = sc.nextInt();
                int desti = sc.nextInt();
                int weight = sc.nextInt();

                graph.addEdge(source-1, desti-1, weight);
            }

            graph.printAdjacencyMatrix();
            sc.close();
        }
    }
}