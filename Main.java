import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println("Enter integers to fill the array:\n");
        
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();

        }

        // System.out.println("Sum:"+ ArrayUtils.sumArray(array));

        // System.out.println("Max:"+ArrayUtils.maxArray(array));

        // System.out.println("Min:"+ArrayUtils.minArray(array));

        // System.out.println("Sorted Array:");
        // ArrayUtils.bubbleSort(array);
        // ArrayUtils.printArray(array);
 
        int[] sortedArray=ArrayUtils.binaryMergeSort(array);

        ArrayUtils.printArray(sortedArray);

        

        sc.close();
    }

   
}