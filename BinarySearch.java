public class BinarySearch {


    static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1; 
        }

        int mid = (low + high) / 2; 

        if (key == arr[mid]) {
            return mid; 
        }

        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, high, key);
        }

        return binarySearch(arr, low, mid - 1, key); 
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70}; 
        int n = arr.length; 
        int key = 40; 

        int result = binarySearch(arr, 0, n - 1, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}