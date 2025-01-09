import java.util.concurrent.*;
import java.util.*;

public class NarcissisticNumberMultiThreaded {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Define the range for the numbers
        long start = 1;
        long end = 9999999999999L;
        
        // Create a fixed thread pool
        int numThreads = 10; // Adjust the number of threads based on your system's capabilities
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        
        // List to hold Future objects for checking narcissistic numbers
        List<Future<Void>> futures = new ArrayList<>();
        
        // Divide the task into smaller ranges for each thread
        long rangeSize = (end - start + 1) / numThreads;
        
        for (int i = 0; i < numThreads; i++) {
            final long rangeStart = start + i * rangeSize;
            final long rangeEnd = (i == numThreads - 1) ? end : rangeStart + rangeSize - 1;
            
            // Submit the task to the executor
            futures.add(executorService.submit(new NarcissisticNumberTask(rangeStart, rangeEnd)));
        }
        
        // Wait for all tasks to complete
        for (Future<Void> future : futures) {
            future.get();
        }
        
        // Shutdown the executor service
        executorService.shutdown();
        
        System.out.println("All tasks completed.");
    }
    
    // Task to check narcissistic numbers in a range
    static class NarcissisticNumberTask implements Callable<Void> {
        long start;
        long end;

        NarcissisticNumberTask(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Void call() {
            for (long number = start; number <= end; number++) {
                if (isNarcissistic(number)) {
                    System.out.println(number + " is a Narcissistic Number.");
                }
            }
            return null;
        }

        // Function to check if a number is Narcissistic
        private boolean isNarcissistic(long number) {
            // Convert the number to string to get the count of digits
            long temp = number;
            int numDigits = String.valueOf(number).length();
            long sum = 0;

            // Calculate the sum of digits raised to the power of the number of digits
            while (temp != 0) {
                int digit = (int) (temp % 10);
                sum += Math.pow(digit, numDigits);
                temp /= 10;
            }

            // Check if the sum is equal to the original number
            return sum == number;
        }
    }
}

