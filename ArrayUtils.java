import java.util.Arrays;

/**
 * ArrayUtils
 */

public class ArrayUtils {

    // default constructor
    public ArrayUtils() {

    }

    // print array elements to the screen
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.print("\n");

    }

    // return the array integers sum
    static int sumArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    // return the highest value of the given array
    static int maxArray(int[] array) {

        int maxValue = array[0]; // assigning the first value of the array as the max one

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue)
                maxValue = array[i];

        }

        return maxValue;
    }

    // return the smallest value of the array
    static int minArray(int[] array) {

        int minValue = array[0]; // assigning the first value of the array as the min one

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue)
                minValue = array[i];

        }

        return minValue;
    }

    // Bubble sort of the array
    static void bubbleSort(int[] array) {

        if (array.length == 0)
            return;

        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    sorted = false;
                    int swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;

                }

            }
        }

    }

    static void selectionSort(int[] array) {
        if (array.length == 0)
            return;

        int minValue;
        int minValueIndex;
        int swap;

        for (int i = 0; i < array.length - 1; i++) {
            minValue = array[i];
            minValueIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValueIndex = j;
                    minValue = array[j];

                }

            }

            swap = array[i];
            array[i] = minValue;
            array[minValueIndex] = swap;
        }

    }

    static int[] mergeSort(int[] left, int[] right) {

        assert (left.length > 0 && right.length > 0);

        int[] sortedArray = new int[left.length + right.length];

        int leftCounter = 0;
        int rightCounter = 0;
        int mainIndex = 0;

        while (leftCounter < left.length && rightCounter < right.length) {
            if (left[leftCounter] < right[rightCounter]) {
                sortedArray[mainIndex] = left[leftCounter];
                leftCounter++;
                mainIndex++;
            } else {
                sortedArray[mainIndex] = right[rightCounter];
                rightCounter++;
                mainIndex++;
            }
        }

        while (leftCounter < left.length) {
            sortedArray[mainIndex] = left[leftCounter];
            leftCounter++;
            mainIndex++;
        }

        while (rightCounter < right.length) {
            sortedArray[mainIndex] = right[rightCounter];
            rightCounter++;
            mainIndex++;
        }

        return sortedArray;
    }

    static int[] binaryMergeSort(int[] array) {
        if (array.length <= 1)
            return array;

        int half = array.length / 2;
        int[] left = binaryMergeSort(Arrays.copyOfRange(array, 0, half));
        int[] right = binaryMergeSort(Arrays.copyOfRange(array, half, array.length));

        return mergeSort(left, right);

    }

    static boolean binarySearch(int[] array, int value) {
        assert (array.length >= 1);

        if (array.length == 1) {
            return array[0] == value;
        }

        int half = array.length / 2;

        if (array[half] == value)
            return true;

        int[] left = Arrays.copyOfRange(array, 0, half);
        int[] right = Arrays.copyOfRange(array, half, array.length);

       
        return binarySearch(left, value) || binarySearch(right, value);
        

        

    }

}