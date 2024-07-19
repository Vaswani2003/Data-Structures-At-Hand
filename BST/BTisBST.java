package BST;

import java.util.*;

class BTisBST{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BT{
        Node root = null;
        ArrayList<Integer> ascending = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        int i = 0;
        void insert_elements(int[] nums, int n){
            
            if(root == null){
                root = new Node(nums[i++]);
            }

            queue.add(root);



            while(i<n){
                Node cur = queue.poll();

                if(2*i + 1 < n){
                    cur.left = new Node(arr[2*i + 1]);
                    queue.add(cur.left);
                }

                if(2*i + 2 < n){
                    cur.right = new Node(arr[2*i+2]);
                    queue.add(cur.right);
                }
                i++;
            }

        }

        void inorder(Node root){
            if(root  == null){
                return;
            }
            inorder(root.left);

            ascending.add(root.data);

            inorder(root.right);
            }
        }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;

        for(i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean same = true;

        if (same){
            System.out.print("Tree");
        }
        else{
            System.out.print("False");
        }

        sc.close();
    }
}
