
import java.util.Scanner;

// 3. Write a Java program that prints the first N terms of the Fibonacci series using a loop.
public class Fibonacci {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second);
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
