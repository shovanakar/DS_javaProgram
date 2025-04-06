import java.io.*;

class Juggling {


    void leftRotate(int arr[], int d, int n) {
        
        d = d % n;
        int i, j, k, temp;
        int gcd = gcd(d, n); 

        for (i = 0; i < gcd; i++) {
            
            temp = arr[i];
            j = i;

            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }


    void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }


    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Juggling obj = new Juggling();

        int arr[] = {1, 2, 3, 4, 5, 6}; 
        int n = arr.length; 
        int d = 2; 

        System.out.println("Original Array:");
        obj.printArray(arr, n);

        obj.leftRotate(arr, d, n); 

        System.out.println("Rotated Array:");
        obj.printArray(arr, n);
    }
}