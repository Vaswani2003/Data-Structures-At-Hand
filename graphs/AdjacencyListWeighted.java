import java.util.*;

class AdjacencyListWrighted{
    static class Node{
        int weight, source, destination;

        Node(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph{
        ArrayList<ArrayList<Node>> adjList;
        int V;

        Graph(int V){
            this.V = V;

            for(int i =0;i<V;i++){
                adjList.add(new ArrayList<Node>());
            }
        }

        void addEdge(int source, int destination, int weight, boolean isDirected){

            adjList.get(source).add(new Node(source, destination, weight));

            if(isDirected == false){
                adjList.get(destination).add(new Node(destination, source, weight));
            }
        }

        void printAdjList(){
            int i, j;

            for(i=0; i < V; i++){
                System.out.println(i + "-> ");
                int temp = adjList.get(i).size();
                for(j = 0; j < temp; j++){
                    System.out.print(adjList.get(i).get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println();
    }
}