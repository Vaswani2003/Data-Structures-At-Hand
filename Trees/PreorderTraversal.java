package Trees;

import java.util.*;

class PreorderTraversal{

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
        Scanner val_scan = new Scanner(System.in);

        void insert_values(){

            int val = val_scan.nextInt();
            this.root = new Node(val);

            que.add(this.root);

            while(que.isEmpty() == false){
                Node cur = que.poll();

                int left = val_scan.nextInt();
                
                if(left != -1){
                    Node left_node = new Node(left);

                    cur.left = left_node;

                    que.add(left_node);
                }

                int right = val_scan.nextInt();

                if(right != -1){
                    Node right_node = new Node(right);

                    cur.right = right_node;

                    que.add(right_node);
                }
            }
        }

        void preorder_traversal(Node root){
            if (root == null){
                return;
            }

            System.out.println(root.data);

            if(root.left != null){
                preorder_traversal(root.left);
            }

            if (root.right != null){
                preorder_traversal(root.right);
            }

        }

    }

    public static void main(String[] args){
    
        BinaryTree tree = new BinaryTree();
        
        tree.insert_values();

        tree.preorder_traversal(tree.root);

    }
}