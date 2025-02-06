// 2. Write a Java program that takes an integer as input and calculates the sum of its digits
//    using a while loop.
import java.util.Scanner;

public class SumUsingWhileLoop {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int num = scanner.nextInt();
  int sum = 0;
        
      while (num > 0) {
         sum += num % 10;
         num /= 10;
      }    
      System.out.println("Sum of digits: " + sum);
      scanner.close();
    }
}

