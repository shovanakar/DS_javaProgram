public class LinearSearch {

    
    public static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        int key = 30; 
        int n = arr.length;

        int index = findElement(arr, n, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}