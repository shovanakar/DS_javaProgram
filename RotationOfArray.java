import java.io.*;

class RotationOfArray {

    public static void rotate(int arr[], int d, int n) {
        int p = 1; 
        while (p <= d) {
            int first = arr[0]; 
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1]; 
            }
            arr[n - 1] = first; 
            p++;
        }

        
        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int d = 2; 
        int n = arr.length; 

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotate(arr, d, n); 
    }
}