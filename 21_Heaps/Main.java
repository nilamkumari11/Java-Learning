//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // inserts in O(log n)
        // finds in O(1)
        // heap is stored in form of array but represented as tree
        // 1.complete binary tree
        // for maximum item in maximum time -> max heap
        // then it will return root element O(1)
        // 2. every node value >= all of its children (max heap)
        // parent of index i = i/2
        // node i -> left child i*2;
        // node i -> right child i*2+1
        // direct formula -> no pointers required (for index start from 1)
        // height -> log(n)

        // insert in heap -> up heap method
        // to insert we check just upr parent in heap, so log n


        // generic
        Heap<Integer> heap = new Heap<>();
    }
}