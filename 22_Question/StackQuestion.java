import java.util.Stack;

public class StackQuestion {
    public static void main(String[] args) {
        int pulse = pulseCount(new int[]{3,1,4,2,5,1});
        System.out.println(pulse);
    }

    public static int pulseCount(int[] arr){
        Stack<Integer> s = new Stack<>();
        int c=0;
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[i]>s.peek()){
                s.pop();
                c++;
            }
            s.push(arr[i]);
        }
        return c;
    }
}
