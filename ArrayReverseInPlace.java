import java.util.Arrays;

public class ArrayReverseInPlace {

    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; 
        System.out.println("Original Array:");
        printArray(arr);

        reverseArray(arr, 0, arr.length - 1); 

        System.out.println("Reversed Array:");
        printArray(arr);
    }
}