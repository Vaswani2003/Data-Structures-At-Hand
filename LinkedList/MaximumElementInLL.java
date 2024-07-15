import java.util.*;

public class MaximumElementInLL {
    static class LinkedList{
        class Node{
            int data;
            Node next;

            Node(int val){
                this.data = val;
                this.next = null;
            }
        }

        Node head = null;

        public void insert(int value){
            Node newNode = new Node(value);

            if (head == null){
                    head = newNode;
            }
            else{
                    Node cur = head;

                    while (cur.next != null){
                            cur = cur.next;
                    }

                    cur.next = newNode;
            }
    }
        public void printMaximum(){
            int maxu = Integer.MIN_VALUE;

            Node cur = head;

            while(cur != null){
                if(cur.data > maxu){
                    maxu = cur.data;
                }
                cur = cur.next;
            }

            System.out.println(maxu);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        while(true){

            int temp = sc.nextInt();

            if (temp < 0){
                break;
            }

            list.insert(temp);
        }

        list.printMaximum();
        sc.close();
    }
}
