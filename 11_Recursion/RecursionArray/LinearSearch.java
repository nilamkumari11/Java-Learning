import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {2, 4,3, 7,3, 1, 9, 3, 6};
        System.out.println(linearSearch(arr, 3, 0));
        findAllIndex(arr, 3, 0);
        System.out.println(list);
        ArrayList<Integer> ans = findAllIndex2(arr, 3, 0, new ArrayList<>());
        System.out.println(ans);
        ArrayList<Integer> ans2 = findAllIndex3(arr, 3, 0);
        System.out.println(ans2);
    }

    static int linearSearch(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return linearSearch(arr, target, index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
