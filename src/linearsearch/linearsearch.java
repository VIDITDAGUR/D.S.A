package linearsearch;

public class linearsearch {

    static void main(String[] args) {

        int[] nums = {23,43,23,4,2,4,2553,2,3434,2342,24};
        int target = 4;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found
//    otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;


    }



}
