package BST;

import java.util.Scanner;

public class ImplementBST{

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

        void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }

        void preorder(Node root){
            if(root==null){
                return;
            }

            System.out.print(root.data + " ");

            preorder(root.left);
            preorder(root.right);

        }

        void postorder(Node root){
            if(root==null){
                return;
            }

            postorder(root.left);
            postorder(root.right);

            System.out.print(root.data + " ");
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

        bst.inorder(bst.root);
        bst.preorder(bst.root);
        bst.postorder(bst.root);

        sc.close();

    }

}

