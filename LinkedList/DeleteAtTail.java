public class DeleteAtTail {

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

                        public void deleteAtTail(){

                            Node cur = head;

                            if(cur == null){
                                System.out.println("List is empty");
                            }
                            else{
                                while(cur.next.next != null){
                                    cur = cur.next;
                                }
                                cur.next = null;
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
                }
        
        public static void main(String[] args){
                System.out.println("Insert an element in a linked list");

                LinkedList list = new LinkedList();

                list.insert(10);
                list.insert(20);
                list.insert(30);

                list.display();

                list.deleteAtTail();

                list.display();       
        }
}

