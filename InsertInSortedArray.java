public class InsertInSortedArray {


    static int insertSorted(int[] arr, int n, int key, int capacity) {
        
        if (n >= capacity) {
            System.out.println("Insertion failed: Array capacity exceeded.");
            return n; 
        }

        int i;

        
        for (i = n - 1; i >= 0 && arr[i] > key; i--) {
            arr[i + 1] = arr[i];
        }

        
        arr[i + 1] = key;

        return n + 1; 
    }

    
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        int[] arr = new int[20];
        int[] initialElements = {12, 16, 20, 40, 50, 70};
        int capacity = arr.length; 
        int n = initialElements.length; 

        
        for (int i = 0; i < n; i++) {
            arr[i] = initialElements[i];
        }

        System.out.println("Before insertion:");
        printArray(arr, n);

        int key = 26; 

    
        n = insertSorted(arr, n, key, capacity);

        System.out.println("After insertion:");
        printArray(arr, n);
    }
}