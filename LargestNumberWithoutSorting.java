// 5. Write a Java program to find the second largest element in an integer array without
//    sorting the array.
public class LargestNumberWithoutSorting {   
  public static void main(String[] args) {
            int[] arr = {10, 5, 8, 20, 15};
            int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
    for (int num : arr) {
           if (num > largest) {
                    secondLargest = largest;
              largest = num;
          } else if (num > secondLargest && num != largest) {          
                secondLargest = num;
                }
          }
    
            System.out.println("Second largest element: " + secondLargest);
        }
    
}
