package algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {9, 7, 3, 1, 6, 3, 2, 6, 8, 19, 2, 3, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int start, int end){
        if(start >= end) return;
        int mid = (start + end) / 2;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] newArray = new int[end - start + 1];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int k = 0;

        while(leftIndex <= mid && rightIndex <= end){
            if(array[leftIndex] < array[rightIndex]){
                newArray[k] = array[leftIndex];
                leftIndex++;
            }else {
                newArray[k] = array[rightIndex];
                rightIndex++;
            }
            k++;
        }

        if(leftIndex <= mid){
            while (leftIndex <= mid){
                newArray[k] = array[leftIndex];
                leftIndex++;
                k++;
            }
        } else if (rightIndex <= end) {
            while (rightIndex <= end){
                newArray[k] = array[rightIndex];
                rightIndex++;
                k++;
            }
        }

        System.arraycopy(newArray, 0, array, start, newArray.length);
    }

}
