import java.util.Stack;
import java.util.Arrays;

public class ArrayReverseStack {

    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        
        for (int num : arr) {
            stack.push(num);
        }

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArrayUsingStack(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}