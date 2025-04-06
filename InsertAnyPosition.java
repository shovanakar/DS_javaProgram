public class InsertAnyPosition {

    static void insertElement(int[] arr, int n, int x, int pos) {
        
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        
        arr[pos] = x;
    }

    public static void main(String[] args) {
    
        int[] arr = new int[15]; 
        int[] initialElements = {2, 4, 1, 8, 5}; 
        int n = initialElements.length; 

        
        for (int i = 0; i < n; i++) {
            arr[i] = initialElements[i];
        }

        System.out.println("Before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        int x = 10; 
        int pos = 2; 

        
        insertElement(arr, n, x, pos);
        n++; 

        System.out.println("After insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}