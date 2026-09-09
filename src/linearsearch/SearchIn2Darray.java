package linearsearch;

import java.util.Arrays;



public class SearchIn2Darray {
    static void main(String[] args) {
        int [][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 34, 23, 11},
                {18, 12}
        };
        int target = 34;
        int[] ans = search(arr,target);// format of return value {row,columns}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));// printing statement of maximum of 2d array
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] ==  target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
//------------------------MAXIMUM IN A 2D ARRAY ----------------------------


    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }



}
