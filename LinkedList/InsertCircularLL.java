import java.util.Scanner;

public class InsertCircularLL {
    static class CLL{
        class Node{
            int data;
            Node next;

            Node(int val){
                this.data = val;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        public void insert(int val){
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
                tail = head;
                return;
            }

            tail.next = newNode;
            tail = newNode;
            tail.next = head;

        }

        public void display(){
            Node cur = head;

            while(cur != head){
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }
    }

    public static void main(String[] args){
        CLL circular = new CLL();
        Scanner sc = new Scanner(System.in);

        while(true){
            int signal = sc.nextInt();

            if(signal == 1){
                int val = sc.nextInt();
                circular.insert(val);
            }
            else{
                circular.display();
                break;
            }
        }

        sc.close();
    }

}
