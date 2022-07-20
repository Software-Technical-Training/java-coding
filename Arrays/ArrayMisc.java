package Arrays;

public class ArrayMisc {
    
    public static void main(String[] args) {
        System.out.println("-----------------------reverseArray");
        reverseArray();
        System.out.println("-----------------------rotateArray");
        rotateArray();
        System.out.println("-----------------------largestNum");
        largestNum();
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
        
    }

    private static void rotateArray() {
        int[] a = {4,8,33,45,17,2,6,88};
        // rotate this array counter clockwise by 4 elements and print
        
    }

    private static void largestNum() {
        int[] a = {4,8,33,45,17,2,6,88};
        // arrange the elements in descending order and print
        
    }

    private static void findMissingNum() {
        int a = {1,2,3,4,6};
        // print the missing num in the sequence 
        // ex 5 in the above array
        
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
