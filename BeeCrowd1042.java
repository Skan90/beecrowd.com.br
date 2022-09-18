import java.util.Arrays;
import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1042
// Last access 18 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1042 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] ascArray = new int[3];

    int firstInt = input.nextInt();
    int secondInt = input.nextInt();
    int thirdInt = input.nextInt();

    ascArray[0] = firstInt;
    ascArray[1] = secondInt;
    ascArray[2] = thirdInt;
    Arrays.sort(ascArray);
    for (int num : ascArray) {
      System.out.println(num);
    }
    System.out.println('\n' +
        Integer.toString(firstInt) + '\n' + Integer.toString(secondInt) + '\n' + Integer.toString(thirdInt));
    input.close();
  }
}
