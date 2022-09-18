import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1044
// Last access 18 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1044 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c;
    if (b < a) {
      c = a;
      a = b;
      b = c;
    }
    double multiple = b % a;
    if (multiple == 0.0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }
    input.close();
  }
}
