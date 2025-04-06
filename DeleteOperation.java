public class DeleteOperation {

    
    static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    
    static int deleteElement(int[] arr, int n, int key) {
        int pos = findElement(arr, n, key); 
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
        int[] arr = {12, 16, 20, 40, 50, 70}; 
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