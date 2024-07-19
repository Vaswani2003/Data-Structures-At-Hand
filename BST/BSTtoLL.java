package BST;    
import java.util.*;

class BSTtoLL{

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
        Node root = null;
        Node head = null;
        Node tail = null;

        Node insert(Node root, int val){
            if (root == null){
                root = new Node(val);
            }

            else if( val < root.data){
                root.left = insert(root.left, val);
            }

            else if( val > root.data){
                root.right = insert(root.right, val);
            }

            return root;
        }

        void toLL(Node cur){
            if(cur == null){
                return;
            }

            toLL(cur.left);

            if(head == null){
                head = cur;
            }
            else{
                cur.right = tail;
                tail.left = cur;
            }
        }

        void inorder(Node root){
            if (root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++){
            int data = sc.nextInt();
            tree.root = tree.insert(tree.root, data);
        }

        tree.inorder(tree.root);

        sc.close();

    }
}