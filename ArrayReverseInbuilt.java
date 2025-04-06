import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverseInbuilt {
    public static void main(String[] args) {
    
        Integer[] originalArray = {1, 2, 3, 4, 5}; 
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        List<Integer> list = Arrays.asList(originalArray);

        Collections.reverse(list);

        Integer[] reversedArray = list.toArray(new Integer[0]);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}