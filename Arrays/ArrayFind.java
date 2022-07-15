package Arrays;

import java.util.Scanner;

public class ArrayFind {
    
    public static void main(String[] args) {
        findNthElement();
        findFirstOdd();
        
    }

    private static void findNthElement(){
        System.out.println("###findNthElement. Enter n:");
        int[] a = {4,8,33,45,17,2,6,88};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("nth index = " + n);

        // check if n is a valid value before picking the "n"th element 
        // from array and printing it out
    }

    private static void findFirstOdd(){
        System.out.println("###findFirstOdd");
        int[] a = {4,8,33,45,17,2,6,88};
        // print the first odd number and its index
    }


}
