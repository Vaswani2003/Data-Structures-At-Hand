public class InsertAtPosition {
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

                        public void insertAtPosition(int val,int position){
                            Node cur = head;
                            Node newNode = new Node(val);

                            if (cur == null){
                                head = newNode;
                            }
                            else{
                                int cnt = 1;
                                while (cur != null){
                                    if(cnt == position-1){
                                        newNode.next = cur.next;
                                        cur.next = newNode;
                                        break;
                                    }
                                    cur = cur.next;
                                    cnt++;
                                }
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

                list.insertAtPosition(15,3);
                list.display();
                
        }
}

