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
        String n = in.next();
        System.out.println("nth index = " + n);

        // check if array index is valid
        if(validateArrayIndex(n, a.length)){
            // print the value at the array index
            int idx = Integer.parseInt(n);
            if(idx == 0){
                System.out.println(a[idx]);
            } else {
                System.out.println(a[idx-1]);
            }
        }else{
            // print error message
            System.out.println("Enter a valid index");
        }

    }

    private static boolean validateInt(String input) {
        boolean ret = false;
        try { 
			Integer.parseInt(input); 
			System.out.println(input + " is a valid integer"); 
            ret = true;
		} catch (NumberFormatException e)  { 
			System.out.println(input + " is not a valid integer"); 
		} 
        return ret;
    }

    private static boolean validateArrayIndex(String input, int length) {
        boolean isValid = false;
        if(validateInt(input)){
            int idx = Integer.parseInt(input);
            if((idx <= length) & (idx >= 0)){
                isValid = true;
            }
        }
        return isValid;
    }

    private static void findFirstOdd(){
        System.out.println("###findFirstOdd");
        int[] a = {4,8,33,45,17,2,6,88};
        for(int i = 0; i < a.length; i++){
            if((a[i]%2)==1){
                System.out.println(a[i]);
                System.out.println(i+1);
                break;
            }
        }
        // print the first odd number and its index
    }


}
