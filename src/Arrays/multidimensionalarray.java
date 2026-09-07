package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        -----------2D array --------------

        /*
            1 2 3
            4 5 6
            7 8 9

         */
        //int[][] arr = new int[3][3];//no. of rows are mandatory not the columns
//        we can imagine multidimensional array as it is an array of array
//        int [][] arr = {
//                {1, 2, 3},// 0 th index
//                {4, 5, 6},// 1st index
//                {7, 9, 9}// 2nd index--> arr[2] = {6, 7, 8, 9}
//        };


        int[][] arr = new int[3][4];
        System.out.println(arr.length); // it will print the no. of rows

            // input

        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }

        }
        // output

        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }

    }
}
