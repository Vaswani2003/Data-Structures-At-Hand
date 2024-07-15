import java.util.*;

class AppendWithoutDuplicates{

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
            
            if(head == null){
                head = new Node(value);
                System.out.println("List is empty");
                return;
            }

            Node cur = head;
            Node prev = null;

            while(cur != null){
                if(cur.data == value){
                    return;
                }
                else{
                    prev = cur;
                    cur = cur.next;
                }
            }

            prev.next = new Node(value);
        }

        public void display(){
            Node cur = head;

            while(cur != null){
                System.out.print(cur.data + "\n");
                cur = cur.next;
            }
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

        list.display();
        sc.close();
    }
}