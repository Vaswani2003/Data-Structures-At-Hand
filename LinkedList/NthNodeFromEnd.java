import java.util.*;
public class NthNodeFromEnd{

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

                    public void findNthNodefromEnd(int n){
                       Node delimiter = head;

                       for(int i=0; i < n; i++){
                        if(delimiter == null){
                            System.out.println("There is no nth node in the list");
                            return;
                        }
                        delimiter = delimiter.next;
                       }

                       Node res = head;

                       while(delimiter != null){
                        res = res.next;
                        delimiter = delimiter.next;
                       }

                          System.out.println("The nth node from the end is: " + res.data);
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
      		System.out.println("Enter the nth node:");
      		int n = sc.nextInt();
      	
      		list.findNthNodefromEnd(n);

            sc.close();
    }
}
