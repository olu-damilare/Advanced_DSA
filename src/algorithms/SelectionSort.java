package algorithms;


import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]){
                   minimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
        return  array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{9, 8, 3, 13, 87, 12, 1})));
    }
}
