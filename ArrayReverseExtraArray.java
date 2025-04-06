import java.util.Arrays;

public class ArrayReverseExtraArray {

    public static void reverseArrayExtraArray(int[] originalArray) {
        int size = originalArray.length;
        int[] reversedArray = new int[size];

        
        for (int i = 0; i < size; i++) {
            reversedArray[i] = originalArray[size - i - 1];
        }

        
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5}; 
        reverseArrayExtraArray(originalArray);
    }
}