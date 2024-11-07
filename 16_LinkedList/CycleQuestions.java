

public class CycleQuestions {

    private Node head;
    private Node tail;

    private int size;

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

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                } while(slow != temp);
                return length;
            }
        }

        return 0;
    }

    public Node detectCycle(Node head) {
        int length = 0;

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0) {
            return null;
        }

        // find the start node
        Node f = head;
        Node s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while(f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int num) {
        int ans=0;
        while(num > 0) {
            int rem = num % 10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
