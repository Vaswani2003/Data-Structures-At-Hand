import java.util.*;

public class BFS {
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

        void bfs(){
            boolean[] visited = new boolean[V];
            
            Queue<Integer> q = new LinkedList<>();

            q.add(0);
            visited[0] = true;
            System.out.print("BFS: ");

            while(q.isEmpty() == false){
                int cur = q.poll();

                System.out.print(cur + " ");

                for(int j = 0; j < adjList.get(cur).size(); j++){
                    int element = adjList.get(cur).get(j);

                    if(!visited[element]){
                        q.add(element);
                        visited[element] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();

        if(V == 0){
            System.out.print("Graph doesn't exist");
        }
        else{
            Graph g = new Graph(V);

            while(true){
                int s = sc.nextInt();
                int d = sc.nextInt();
    
                if (s == -1 && d == -1){
                    break;
                }

                g.addEdge(s,d, false);
            }

            g.bfs();
        }

    

        sc.close();
    }
}
