package BST;

import java.util.*;

public class BST_Elements_In_A_Range{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BST{

        Node root;
        Queue<Integer> q = new LinkedList<Integer>();

        Node insert(Node root, int data){
            if (root == null){
                root = new Node(data);
            }
            else if(data < root.data){
                root.left = insert(root.left, data);
            }
            else if(data > root.data){
                root.right = insert(root.right, data);
            }
            return root;
        }

        void search(Node root, int low, int high){

            if(root == null){
                return;
            }

            search(root.left, low, high);

            if (low <= root.data && root.data <= high){
                q.add(root.data);
            }

            search(root.right, low, high);
            
        }

       
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BST bst = new BST();

        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            bst.root = bst.insert(bst.root, data);
        }

        int low = sc.nextInt();
        int high = sc.nextInt();

        bst.search(bst.root, low, high);

        for(int each: bst.q){
            System.out.print(each + " ");
        }

        sc.close();

    }

}

