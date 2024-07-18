package BST;

import java.util.Scanner;

public class searchBST{

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

        boolean search(Node root, int target){

            if (root == null){
                return false;
            }
            else if(root.data == target){
                return true;
            }

            return search(root.left , target) || search(root.right, target);

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

        int target = sc.nextInt();

        boolean found = bst.search(bst.root, target);

        System.out.println(found);

        sc.close();

    }

}

