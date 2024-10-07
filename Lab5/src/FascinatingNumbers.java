import java.util.Scanner;
/**
 * finds of the number is Fibonacci or prime
 * @author Mia
 */
public class FascinatingNumbers {
    /**
     * main method
     */
    public static void main(String[] args) {
        int[] numbers = new int[10]; // to store the numbers in an array
        int count = inputNumbers(numbers); // count the numbers entered

        System.out.println(); // the space in between input and output

        for (int i = 0; i < count; i++) { // loop through the entered numbers
            int num = numbers[i];
            boolean isFibonacci = isFibonacci(num);  // check for Fibonacci
            boolean isPrime = isPrime(num); //and prime numbers

            // output the results
            System.out.print(num + " is ");
            System.out.print(isFibonacci ? "" : "not ");
            System.out.print("Fibonacci and is ");
            System.out.print(isPrime ? "" : "not ");
            System.out.println("prime.");
        }
    } // end of main

    /**
     * 2nd method to enter the inputted numbers into an array
     * return the numbers entered
     * @param numbers user input
     * @return count total input entered
     */

    public static int inputNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input;
        System.out.print("Please enter numbers (0 to stop): ");

        // do-while loop to get user input
        do {
            input = scanner.nextInt();
            if (input != 0) { // stop when 0 is entered
                numbers[count] = input; // stores the input
                count++;
            }
        }while (input != 0 && count < numbers.length);

            return count; // return the count of the numbers entered

    } // end of inputNumbers
        /**
         * 3rd method to check if a number is Fibonacci
         * @param n numbers inputted
         * @return True if the number is Fibonacci or returns false if otherwise
         */

        public static boolean isFibonacci ( int n){
            int a = 0, b = 1;
            if (n == a || n == b) {
                return true;
            }

            while (b < n) {
                int next = a + b;
                a = b;
                b = next;
            }
            return b == n; // return true if we found n (number) to be Fibonacci
        } // end of isfibonacci

        /**
         * 4th method to check if a number is prime
         * @param n numbers inputted
         * @return True if the number is prime or returns false if otherwise
         */

        public static boolean isPrime ( int n){
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; // not prime because it has a divisor
                }
            }
            return true; // prime because it has no divisors
        }

}// end of class