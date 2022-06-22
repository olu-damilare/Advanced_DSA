package algorithms;

public class Recursion {

    public static void reduceByOne(int n){
        if(n > 0) reduceByOne(n - 1);
        System.out.println(n);
    }

    public static int recursiveLinearSearch(int[] array, int index, int val){
        if(index < 0) return -1;
        else if(array[index] == val) return index;
        return recursiveLinearSearch(array, index - 1, val);
    }

    public static int recursiveBinarySearch(int[] array, int startIndex, int endIndex, int val){
        if(startIndex > endIndex) return -1;
        int midIndex = (startIndex + endIndex) / 2;
        if(array[midIndex] == val) return midIndex;
        if(array[midIndex] > val) return recursiveBinarySearch(array, startIndex, midIndex - 1, val);
        return recursiveBinarySearch(array, midIndex + 1, endIndex, val);
    }

    public static void main(String[] args) {
       int val = 1000000;
       int count = 0;
       while(val > 0){
           count++;
           val /= 2;
       }
        System.out.println( count);

//        int[] array = {2,5,7,8,12,56,78,99};
//        int val = 99;
//        System.out.println(recursiveBinarySearch(array, 0,array.length - 1, val));
    }
}
