public class DeletionAtSecondLast {

    static class LinkedList {
        class Node {
            int data;
            Node next;

            Node(int val) {
                this.data = val;
                this.next = null;
            }
        }

        Node head = null;

        public void insert(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                Node cur = head;

                while (cur.next != null) {
                    cur = cur.next;
                }

                cur.next = newNode;
            }

        }

        public void deleteAtSecondLast(){
            Node cur = head;
            Node prev = null;

            if(cur == null){
                System.out.println("List is empty");
            }
            else if (head.next == null){
                System.out.println("List has only one element");
            }
            else{
                while(cur.next.next != null){
                    prev = cur;
                    cur = cur.next;
                }
                if(prev == null){
                    cur.next = null;
                }
                else{
                prev.next = cur.next;
                }
            }
            
        }

        public void display() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                Node cur = head;

                while (cur != null) {
                    System.out.print(cur.data + " ");
                    cur = cur.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Insert an element in a linked list");

        LinkedList list = new LinkedList();

        list.insert(10);

        list.insert(40);

        list.display();

        list.deleteAtSecondLast();

        list.display();
    }
}

