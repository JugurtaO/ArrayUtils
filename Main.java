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
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);

        // System.out.println("Enter integers to fill the array:\n");
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = sc.nextInt();

        // }

        // System.out.println("Sorted Array (selection sort):");
        // ArrayUtils.selectionSort(array);
        // ArrayUtils.printArray(array);

        // System.out.println("Enter integers to fill the array:\n");
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = sc.nextInt();

        // }
        // System.out.println("Sorted Array (binary merge sort):");
        // int[] sortedArray = ArrayUtils.binaryMergeSort(array);
        // ArrayUtils.printArray(sortedArray);

        System.out.println("Enter the value to search:");
        int value = sc.nextInt();
        System.out.println("Value exists:" + ArrayUtils.binarySearch(array, value));

        sc.close();
    }

}