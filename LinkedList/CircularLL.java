import java.util.*;

class CircularLL{

    static class CircularLinkedList{
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;

        void insert(int data){
            if (head == null){
                head = new Node(data);
                head.next = head;
                return;
            }

            Node cur = head;

            while(cur.next != head){
                cur = cur.next;
            }

            Node temp = new Node(data);

            cur.next = temp;
            temp.next = head;

        }

        void display(){
            Node cur = head;

            while(cur.next != head){
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
            System.out.println(cur.data);
        }
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(sc.nextInt());

        while(sc.hasNextInt()){
            int temp = sc.nextInt();
            if(temp == 1){
                cll.insert(sc.nextInt());
            }
            else if(temp == 0){
                cll.display();
            }
        }

        sc.close();
    }
}