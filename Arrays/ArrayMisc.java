package Arrays;
import java.util.List;
import java.util.ArrayList;

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
        System.out.println("-----------------------numGoodPairs");
        int[] nums = {1,2,3,1,1,3};
        numGoodPairs(nums);
        nums = new int[]{1,1,1,1};
        numGoodPairs(nums);
        nums = new int[]{1,2,3};
        numGoodPairs(nums);
        System.out.println("-----------------------extraCandies");
        System.out.println("[2,3,5,1,3], extra : 3");
        greatestNumCandies(new int[]{2,3,5,1,3}, 3);
        System.out.println("[4,2,1,1,2], extra : 1");
        greatestNumCandies(new int[]{4,2,1,1,2}, 1);
        System.out.println("-----------------------smallerNumbersThanCurrent");
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        smallerNumbersThanCurrent(new int[]{6,5,4,8});
        smallerNumbersThanCurrent(new int[]{7,7,7,7});
        System.out.println("-----------------------decodeArr");
        System.out.println("[1,2,3,]");
        decodeArr(new int[]{1,2,3});
        System.out.println("[6,2,7,3]");
        decodeArr(new int[]{6,2,7,3});
        System.out.println("-----------------------createTargetArr");
        System.out.println("{0,1,2,3,4},{0,1,2,2,1}");
        createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
        System.out.println("{1,2,3,4,0},{0,1,2,3,0}");
        createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0});
        System.out.println("-----------------------restoreString");
        restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        restoreString("abc", new int[]{0,1,2});
        System.out.println("-----------------------countMatches");
        countMatches(new String[][]{{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}}, "color", "silver");
        countMatches(new String[][]{{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}}, "type", "phone");
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
        // arrange the elements in descending order and print
        // check if 1st element is bigger than next.
        // if it is, swap
        // if it isn't keep going until the biggest element is in the front
        // keep doing this with each element until it is sorted
        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                int temp = 0;
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } 
            }
        }
        printArray(a);
    }

    private static void findMissingNum() {
        int[] a = {1,2,3,4,6};
        // print the missing num in the sequence 
        // ex 5 in the above array
        for(int i = 0; i < a.length-1; i++){
            if(a[i]+1 != a[i+1]){
                System.out.println(a[i]+1);
            } 
        }
    }

    private static void arrayPermute() {
        int[] nums = {0,2,1,5,3,4};
        int[] newArray = new int[nums.length];
    /* Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows: 
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]
        - new array
        - each element in the og array becomes an index */        
         
        for(int i = 0; i < nums.length; i++){
            // check if its valid index
            newArray[i] = nums[nums[i]];
        }
        printArray(newArray);
    }

    private static void concatArr() {
        int[] nums = {1,2,1};
        /*
         * Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
         */
        int[] newArr = new int[(nums.length)*2];
        for (int j=0; j < newArr.length; j++) {
            int temp = j;
            if(temp >= nums.length){
                temp = j - nums.length;
            }
            newArr[j] = nums[temp];
        }

        printArray(newArr);
    }

    private static void runningSums() {
        /*
         * Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        int[] nums = {1,2,3,4};
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += nums[j];
            }
            newArr[i] = sum;
        }
        printArray(newArr);
    }

    private static void maxWealth() {
        /*
         * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
            Output: Richest customer is 1 with a wealth of 17
         */

        int[][] accounts = {{7,1,3},{2,8,7},{1,9,5},};
        int [] sums = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            int arraySum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                // sums up each individual customer
                arraySum += accounts[i][j];
                sums[i] = arraySum;
            }
        }
        int max = sums[0];
        for(int i = 1; i < sums.length; i++){
            if(max < sums[i]){
                max = sums[i];
            } 
        }
        System.out.println("Richest customer has a wealth of " + max);
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
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int[] wordCounts = new int[sentences.length];
        for(int i = 0; i < sentences.length; i++){
            int wordCount = 0;
            String sentence = sentences[i];
            for(int j = 0; j < sentence.length(); j++){
                if(sentence.charAt(j) == ' '){
                    wordCount++;
                }
            }
            wordCounts[i] = wordCount + 1;
        }
        int max = wordCounts[0];
        for(int i = 1; i < wordCounts.length; i++){
            if(max < wordCounts[i]){
                max = wordCounts[i];
            }
        }
        System.out.println("The max number of words is " + max);
    }

    private static void numGoodPairs(int[] nums) {
        /*
         * Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Input: nums = [1,2,3]
Output: 0
         */
        int count = 0;
        for(int j = 0; j < nums.length; j++){
            for(int i = 0; i < j; i++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void greatestNumCandies(int[] candies,int extraCandies) {
        /*int temp = 0;
        
        for(int candy : candies){
            temp = candy += extraCandies;
            for(int i = 1; i < candies.length; i++){
                if(temp <= candies[i]){
                    isMax = false;
                }
            }
        } */
        Boolean[] isGreatest = new Boolean[candies.length];
        int max = candies[0];
        for(int i = 1; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            Boolean isMax = true;
            if(candies[i]+extraCandies < max){
                isMax = false;
            }
            isGreatest[i] = isMax;
        }
        for(Boolean value : isGreatest){
            System.out.print(value + " ");
        }
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

        
    }

    private static void smallerNumbersThanCurrent(int[] nums) {
        // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
        // Do all three examples
        int[] smallerNumCounts = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int smallerNumCount = 0;
            for(int j = 0; j < nums.length; j++){
                if(j!=i){
                    if(nums[j]<nums[i]){
                        smallerNumCount++;
                    }
                }
            }
            smallerNumCounts[i] = smallerNumCount;
        }
        printArray(smallerNumCounts);
    }

    private static void decodeArr(int[] arr) {
        // https://leetcode.com/problems/decode-xored-array/

        
    }

    private static void createTargetArray(int[] nums, int[] index) {
        // https://leetcode.com/problems/create-target-array-in-the-given-order/
        int[] target = new int[nums.length];
        for(int i = 0; i < index.length; i++){
            if(index[i] < i){
                for(int j = target.length-2; j >= index[i]; j--){
                    target[j+1] = target[j];
                }
                target[index[i]] = nums[i];
            } else {
                target[index[i]] = nums[i];
            }
        }
        printArray(target);
    }

    private static void restoreString(String s, int[] indices) {
        /**
         * You are given a string s and an integer array indices of the same length. 
         * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
         * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
         */
        
    }

    private static void countMatches(String[][] items, String ruleKey, String ruleValue) {
        /**
         * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.

         */
        
    }
}
