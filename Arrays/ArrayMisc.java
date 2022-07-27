package Arrays;

public class ArrayMisc {
    
    public static void main(String[] args) {
        System.out.println("-----------------------reverseArray");
        reverseArray();
        System.out.println("-----------------------rotateArray");
        rotateArray();
        System.out.println("-----------------------largestNum");
        largestNum();
        System.out.println("-----------------------findMissingNum");
        findMissingNum();
        System.out.println("-----------------------arrayPermute");
        arrayPermute();
        System.out.println("-----------------------concatArr");
        concatArr();
        System.out.println("-----------------------runningSums");
        runningSums();
        System.out.println("-----------------------maxWealth");
        maxWealth();
        System.out.println("-----------------------mostWordsFound");
        mostWordsFound();
        
    }

    private static void reverseArray() {
        int[] a = {4,8,33,45,17,2,6,88};
        // reverse the elements of the array and print it out
        
        // empty array
        int[] reverse = new int[a.length];
        // for loop starting at the end and going backwards
        int counter = 0;
        for(int i = a.length-1; i >= 0; i--){
            //add each element one by one to the empty array
            reverse[counter] = a[i];
            counter++;
        }
        printArray(reverse);
    }

    private static void printArray(int[] arr){
        System.out.print("[");
        for(int val : arr){
            System.out.print(val);
            System.out.print(", ");
        }
        System.out.println("]");
    }

    private static void rotateArray() {
        int[] a = {4,8,33,45,17,2,6,88};
        // rotate this array counter clockwise by 4 elements and print
        //new array with 4 elements
        // add the first four elements to the new array
        // add them back to the end of the original array.

        int[] newArray = new int[4];
        for(int i = 0; i < 4; i++){
            newArray[i] = a[i];
        }
        printArray(newArray);
        // a = {4,8,33,45,17,2,6,88}
        for(int i = 4; i < a.length; i++){
            a[i-4] = a[i];
        }
        printArray(a);
        // a = {17,2,6,88,17,2,6,88}
        for(int i = 4; i < a.length; i++){
            a[i] = newArray[i-4];
        }
        // a = {17,2,6,88,4,8,33,45}
        printArray(a);
    }

    private static void largestNum() {
        int[] a = {4,8,33,45,17,2,6,88};
        int[] newArray = new int[a.length];
        // arrange the elements in descending order and print
        for(int i = 0; i < a.length-1; i++){
            if(a[i] <= a[i+1]){
                newArray[0] = a[i+1];
                newArray[newArray.length-1] = a[i];
            } else {
                newArray[0] = a[i];
                newArray[newArray.length-1] = a[i+1];
            }
        }
        printArray(newArray);
    }

    private static void findMissingNum() {
        int[] a = {1,2,3,4,6};
        // print the missing num in the sequence 
        // ex 5 in the above array
        for(int i = 0; i < a.length-1; i++){
            if(a[i]+1 != a[i+1]){
                System.out.println(a[i]+1);
            } else {
                continue;
            }
        }
        
    }

    private static void arrayPermute() {
        /*
         * Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
         */
        
    }

    private static void concatArr() {
        /*
         * Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
         */
        
    }

    private static void runningSums() {
        /*
         * Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        
    }

    private static void maxWealth() {
        /*
         * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
            Output: Richest customer is 3 with a wealth of 17
         */
    }

    private static void mostWordsFound() {
        /*
         * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
         */

    }



}
