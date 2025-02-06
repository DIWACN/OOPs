
// Write a Java program to count and display the total number of prime numbers between 1
// and 1000.
public class TotalPrimeNumber {
        public static void main(String[] args) {
            int count = 0;
            
 for (int num = 2; num <= 1000; num++) {
                boolean isPrime = true;
                
for (int i = 2; i * i <= num; i++) {
     if (num % i == 0) {
         isPrime = false;
         break;
             }
         }
       if (isPrime) {
       count++;
                }
    }
            
   System.out.println("Total prime numbers between 1 and 1000: " + count);
        }
    }

