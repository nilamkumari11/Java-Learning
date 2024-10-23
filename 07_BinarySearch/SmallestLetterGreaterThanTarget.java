package nilam;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
        char ans2 = nextGreatestLetter2(letters, target); //more efficient
        System.out.println(ans2);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        if(target > letters[letters.length - 1]){
            return letters[0];
        }else if(target == letters[letters.length - 1]){
            return letters[0];
        }
        int start = 0 ;
        int end = letters.length -1 ;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(target >= letters[mid]){
                start = mid + 1 ;
            }else if(target < letters[mid]){
                end = mid - 1;
            }
        }
        return letters[start];
    }

    static char nextGreatestLetter2(char[] letters, char target){
        int start = 0 ;
        int end = letters.length -1 ;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1 ;
            }
        }
        return letters[start % letters.length];
    }
}
