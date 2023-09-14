import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println("Enter integers to fill the array:\n");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }

        System.out.println("Sum:" + ArrayUtils.sumArray(array));

        System.out.println("Max:" + ArrayUtils.maxArray(array));

        System.out.println("Min:" + ArrayUtils.minArray(array));

        System.out.println("Sorted Array (bubble sort):");
        long start1 = System.currentTimeMillis();
        ArrayUtils.bubbleSort(array);
        long end1 = System.currentTimeMillis();
        ArrayUtils.printArray(array);

        System.out.println("Enter integers to fill the array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }

        System.out.println("Sorted Array (selection sort):");
        long start2 = System.currentTimeMillis();
        ArrayUtils.selectionSort(array);
        long end2 = System.currentTimeMillis();
        ArrayUtils.printArray(array);

        System.out.println("Enter integers to fill the array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("Sorted Array (binary merge sort):");
        long start3 = System.currentTimeMillis();
        int[] sortedArray = ArrayUtils.binaryMergeSort(array);
        long end3 = System.currentTimeMillis();
        ArrayUtils.printArray(sortedArray);

        System.out.println("Enter the value to search:");
        int value = sc.nextInt();
        System.out.println("Value exists:" + ArrayUtils.binarySearch(array, value));


        System.out.println("");
        System.out.println("Some statistics about execution time of sorting algorithmes:");
        System.out.println("-------------------------------------------");
        System.out.println("Bubble sort:"+ (end1-start1)+ " ms.");
        System.out.println("Selection sort:"+ (end2-start2)+ " ms.");
        System.out.println("Binary merge sort:"+ (end3-start3)+ " ms.");



        sc.close();
    }

}