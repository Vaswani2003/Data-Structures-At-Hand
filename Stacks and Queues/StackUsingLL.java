import java.util.Scanner;

public class StackUsingLL {

    static class Stack{

        class Node{
            int data;
            Node next;
            Node prev;

            Node(int val){
                this.data = val;
                this.next = null;
                this.prev = null;
            }
        }

            Node head = null;
            Node tail = null;

            void push(int val){

                Node newNode = new Node(val);

                if(head == null){
                    head = newNode;
                    tail = newNode;
                    return;
                }

                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;

            }

            void display(){
                Node cur = tail;

                if(cur==null){
                    System.out.println("Stack underflow");
                    return;
                }

                while(cur!=null){
                    System.out.println(cur.data);
                    cur = cur.prev;
                }
            }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();

        while(true){

            int temp = sc.nextInt();

            if(temp < 0){
                break;
            }

            stack.push(temp);
        }

        stack.display();
    }
}
