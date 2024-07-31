import java.util.*;

public class MergeSortedLL {
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

        public void display() {
            Node cur = head;

            while (cur != null) {
                System.out.print(cur.data);
                if (cur.next != null) {
                    System.out.print("->");
                }
                cur = cur.next;
            }
            System.out.println();
        }

        public void merge(LinkedList list) {
            Node h1 = this.head;
            Node h2 = list.head;

            Node dummy = new Node(0);
            Node tail = dummy;

            while (h1 != null && h2 != null) {
                if (h1.data < h2.data) {
                    tail.next = h1;
                    h1 = h1.next;
                } else {
                    tail.next = h2;
                    h2 = h2.next;
                }
                tail = tail.next;
            }

            if (h1 != null) {
                tail.next = h1;
            } else {
                tail.next = h2;
            }

            this.head = dummy.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        LinkedList list1 = new LinkedList();

        for (int i = 0; i < l1; i++) {
            list1.insert(sc.nextInt());
        }

        int l2 = sc.nextInt();
        LinkedList list2 = new LinkedList();

        for (int i = 0; i < l2; i++) {
            list2.insert(sc.nextInt());
        }

        list1.merge(list2);
        list1.display();

        sc.close();
    }
}
