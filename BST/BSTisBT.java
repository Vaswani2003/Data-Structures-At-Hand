package BST;

public class BSTisBT {
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

        boolean isBST(Node root, int min, int max){
            if (root == null){
                return true;
            }
            if (root.data < min || root.data > max){
                return false;
            }
            return isBST(root.left, min, root.data-1) && isBST(root.right, root.data+1, max);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Node root = null;
        root = bst.insert(root, 50);
        bst.insert(root, 30);
        bst.insert(root, 20);
        bst.insert(root, 40);
        bst.insert(root, 70);
        bst.insert(root, 60);
        bst.insert(root, 80);

        System.out.println("Inorder Traversal: ");
        bst.inorder(root);
        System.out.println("\nPreorder Traversal: ");
        bst.preorder(root);
        System.out.println("\nPostorder Traversal: ");
        bst.postorder(root);

        if (bst.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
            System.out.println("\nIt is a Binary Search Tree");
        }
        else{
            System.out.println("\nIt is not a Binary Search Tree"); 
}
    }
}