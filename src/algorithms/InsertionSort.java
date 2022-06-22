package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > element){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{9, 8, 3, 13, 87, 12, 4})));
    }
}
