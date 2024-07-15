import java.util.*;
public class PairSwapElements{

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

                    public void display(){
                            if (head == null){
                                    System.out.println("List is empty");
                            }
                            else{
                                    Node cur = head;

                                    while (cur != null){
                                            System.out.print(cur.data + " ");
                                            cur = cur.next;
                                    }
                            }
                    }

                    public void pairSwap(){
                        Node cur = head;

                        if(cur == null || cur.next == null){
                            return;
                        }
                        else{
                            while(cur.next.next != null){
                                int temp = cur.data;
                                cur.data = cur.next.data;
                                cur.next.data = temp;

                                cur = cur.next;
                            }
                        }
                    }
            }
    
    public static void main(String[] args){
            LinkedList list = new LinkedList();
			
      		Scanner sc = new Scanner(System.in);
      
      		while(true){
            	int temp = sc.nextInt();
              	if(temp<0){break;}
              	list.insert(temp);
            }
            
            list.pairSwap();
            list.display();
            sc.close();
    }
}
