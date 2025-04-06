public class SumNaturalNumbersOptimized {


    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10000000; 


        long startTime = System.nanoTime();
        findSum(n);
        long endTime = System.nanoTime();

        double timeTaken = (endTime - startTime) / 1e9; 
        System.out.printf("findSum(int n) took %.6f seconds to execute%n", timeTaken);
    }
}