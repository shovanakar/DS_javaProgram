public class DeleteFromSortedArray {


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

    
    static int deleteElement(int[] arr, int n, int key) {
        
        int pos = binarySearch(arr, 0, n - 1, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60}; 
        int n = arr.length; 
        int key = 40; 

        System.out.println("Before Deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        n = deleteElement(arr, n, key);

        System.out.println("After Deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}