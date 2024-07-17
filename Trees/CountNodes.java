package Trees;

import java.util.*;

public class CountNodes {

    static Queue<Node> que = new LinkedList<>();

    static class Node{
        int data;
        Node left, right;

        Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    static class BinaryTree{
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int node_count = 0;

        void insert_values(){
            int val = sc.nextInt();
            this.root = new Node(val);

            que.add(this.root);

            while(que.isEmpty() == false){
                Node cur = que.poll();

                int left = sc.nextInt();

                if (left != -1){
                    Node left_node = new Node(left);

                    cur.left = left_node;

                    que.add(left_node);
                }

                int right = sc.nextInt();

                if(right != -1){
                    Node right_node = new Node(right);

                    cur.right = right_node;

                    que.add(right_node);
                }
            }
        }

        void count_nodes(Node root){
            if (root == null){return;}

            if(root.left != null){

                count_nodes(root.left);
            }

            this.node_count += 1;

            if (root.right != null){
                count_nodes(root.right);
           }
    }


    }
    
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.insert_values();
        tree.count_nodes(tree.root);

        System.out.println(tree.node_count);
    }
}
