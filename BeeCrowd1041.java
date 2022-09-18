import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1041
// Last access 18 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1041 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x = input.nextDouble();
    double y = input.nextDouble();

    if (x == 0.0 && y == x) {
      System.out.println("Origem");
    } else if (x == 0.0 && y != x) {
      System.out.println("Eixo Y");
    } else if (y == 0.0 && y != x) {
      System.out.println("Eixo X");
    } else {
      if (x > 0.0 && y > 0.0) {
        System.out.println("Q1");
      } else if (x < 0.0 && y > 0.0) {
        System.out.println("Q2");
      } else if (x < 0.0 && y < 0.0) {
        System.out.println("Q3");
      } else if (x > 0.0 && y < 0.0) {
        System.out.println("Q4");
      }
    }
    input.close();
  }
}
