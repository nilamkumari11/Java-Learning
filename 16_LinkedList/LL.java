import java.util.List;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    //cunstructor
    public LL() {
        this.size = size;
    }

    public void insetFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail == null) {
            insetFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insetFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
//    private Node insertRec(int val, int index, Node node) {
//        if(index == 0) {
//            Node temp = new Node(val, node);
//            size++;
//            return temp;
//        }
//        node.next = insertRec(val, index--, node.next);
//        return node;
//    }

    private Node insertRec(int val, int index, Node node) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }

        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        if (node == null) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node != null) {
            if(node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if(head == null) {
            tail=null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.val+ "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node {

        private int val;
        private Node next;
        //private because no one else should access

        //constructor
        public Node(int value) {
            this.val = value;
        }

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }
    }


    // Questions
    public void Duplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.val == node.next.val ) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merge
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null) {
            if(f.val <= s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }

        while(s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;
    }

    public void bubbleSort(){
        bubbleSort(size -1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0) {
            return ;
        }

        if(col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if(first.val > second.val) {
                // swap
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next =first;
                } else if (second == tail ){
                    Node prev = get(col -1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col -1);
                    prev.next = second;
                    first.next = second.next;
                    second.next =first;
                }
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    //recursion reverse
    private void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list
    public void reverse() {
        if(size<2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//
//        list.display();
//
//        list.Duplicates();
//
//        list.display();

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);

        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();

        LL list = new LL();
        for(int i = 7; i> 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
