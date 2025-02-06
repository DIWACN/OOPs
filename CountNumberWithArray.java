
// 4. Write a Java program that counts how many times a given number appears in an array.
//    Input: arr = [2, 3, 2, 5, 2, 6], target = 2
//    Output: 3
public class CountNumberWithArray {
public static void main(String[] args) {
 int[] arr = {2, 3, 2, 5, 2, 6};
  int target = 2;
      int count = 0;
    
for (int num : arr) {
  if (num == target) {
        count++;
                }
            }
    
    System.out.println("The number " + target + " appears " + count + " times.");
        }
    }

