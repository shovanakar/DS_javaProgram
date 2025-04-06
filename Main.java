import java.util.Scanner;

public class Main {

    
    public static void fun() {
        System.out.println("fun() starts");
        System.out.println("Press enter to stop fun");

    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("fun() ends");
    }

    public static void main(String[] args) {
    
        long startTime = System.nanoTime();

        
        fun();

        
        long endTime = System.nanoTime();

    
        double timeTaken = (endTime - startTime) / 1e9;  


        System.out.println("fun() took " + timeTaken + " seconds to execute");
    }
}
