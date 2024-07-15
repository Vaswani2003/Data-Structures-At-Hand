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

                            System.out.println("Element inserted successfully");
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

                    public void findNthNodefromEnd(int n){
                        Node cur = head;
                        int len = 1;

                        while(cur != null){
                            cur = cur.next;
                            len++;
                        }

                        int cnt = 1;
                        cur = head;

                        while(cur != null){
                            if(cnt == len-n){
                                System.out.println(cur.data);
                                break;
                            }
                            cur = cur.next;
                            cnt++;
                        }
                    }
            }
    
    public static void main(String[] args){
            System.out.println("Insert an element in a linked list");

            LinkedList list = new LinkedList();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);

            list.display();

            list.findNthNodefromEnd(0);

            
    }
}
