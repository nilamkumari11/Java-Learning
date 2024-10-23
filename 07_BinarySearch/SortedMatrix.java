package nilam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }

    //search n row provided between columns provided
    static int[] binarySearch(int[][] mat, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2 ;
            if(mat[row][mid] == target){
                return new int[]{row, mid};
            }
            if(mat[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search (int[][] matrix, int target){
            int rows = matrix.length;
            int cols = matrix[0].length;//matrix may be empty

        if(rows == 1){
            binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        //run this loop untill 2 rows are remaining
        while(rStart < rEnd - 1){ //while this is true there are more than 2 rows
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }

        //now we have two rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        //check in 1st half
        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0,cMid-1, target);
        }
        //check in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid+ 1, cols-1, target);
        }
        //check in 3rd half
        if(target <= matrix[rStart+1][cMid - 1] ){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        //check in 4th half
        else {
            return binarySearch(matrix, rStart+1, cMid +1, cols-1, target);
        }
    }
}
