import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1026
// Last access 19 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class AdHocBeeCrowd1026 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long a, b, c;
    while (input.hasNext()) {
      a = input.nextLong();
      b = input.nextLong();

      c = a ^ b;
      System.out.println(c);
    }
    input.close();
  }
}
