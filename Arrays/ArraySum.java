package Arrays;

public class ArraySum{

    public static void main(String[] args) {
        arraySum();
        arraySumOddAndEven();
        addArrays();
    }

    private static void arraySum(){
        System.out.println("###arraySum");
        int[] a = {3,5,2,7,88,12,6,99};
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum of the array = " + sum);
    }

    private static void arraySumOddAndEven(){
        System.out.println("###arraySumOddAndEven");
        int[] a = {3,5,2,7,88,12,6,99};
        // add the values of odd numbers separately and even numbers separately
        // and print both the sums in 2 separate lines
        int evenSum = 0;
        int oddSum = 0;
        for(int i : a){
            if((i%2) == 0){
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println(evenSum);
        System.out.println(oddSum);
    }

    private static void addArrays(){
        System.out.println("###addArrays");
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10};
        // add the elements in same position in each array and print the new array
        int[] sums = new int[a1.length];
        for(int i = 0; i < a1.length; i++){
            int sum = a1[i] + a2[i];
            sums[i] = sum;
        }

        for(int j : sums){
            System.out.print(j + " ");
        }

    }

}