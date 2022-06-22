package algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 19, 2, 3, 0};
        quickSort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void quickSort(int[] inputArray, int start, int end) {
        if(start < end){
            int partition = partition(inputArray, start, end);
            quickSort(inputArray, start, partition - 1);
            quickSort(inputArray, partition + 1, end);

        }
    }

    private static int partition(int[] inputArray, int start, int end) {
        int index = start - 1;
        while(start <= end){
            if(inputArray[start] <= inputArray[end]){
                index++;
                int temp = inputArray[start];
                inputArray[start] = inputArray[index];
                inputArray[index] = temp;
            }
            start++;
        }
        return index;
    }

}
