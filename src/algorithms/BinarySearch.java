package algorithms;

public class BinarySearch {

    public static int binarySearch(int[] array, int x){
        int startIndex = 0;
        int endIndex = array.length - 1;
        while(startIndex <= endIndex){
            int midIndex = (startIndex + endIndex) / 2;
            if(array[midIndex] == x){
                return midIndex;
            }
            if(array[midIndex] > x){
                endIndex = midIndex - 1;
            }else{
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,5,7,8,12,56,78,99};
        int val = 12;
        System.out.println(binarySearch(array,val));
    }
}
