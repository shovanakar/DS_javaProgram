public class InsertAtEnd {

    
    static int insert(int[] arr, int n, int key, int capacity) {
        
        if (n >= capacity) {
            System.out.println("Insertion failed: Array capacity exceeded.");
            return n; 
        }

        arr[n] = key; 
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
        int key = 26; 

        
        for (int i = 0; i < n; i++) {
            arr[i] = initialElements[i];
        }

        System.out.println("Before Insertion:");
        printArray(arr, n);

        
        n = insert(arr, n, key, capacity);

        System.out.println("After Insertion:");
        printArray(arr, n);
    }
}