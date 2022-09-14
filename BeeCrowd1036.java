import java.util.Scanner;

public class BeeCrowd1036 {

  // Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1036
  // Last access 14 September 2022
  // Visit my GitHub repository @ https://github.com/skan90

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();
    double bhaskaraDelta = Math.pow(B, 2) - 4 * A * C;
    if (bhaskaraDelta < 0) {
      System.out.println("Impossivel calcular");
    } else if (A == 0.0) {
      System.out.println("Impossivel calcular");
    } else {
      var bhaskaraR1 = (-B + Math.sqrt(bhaskaraDelta)) / (2 * A);
      var bhaskaraR2 = (-B - Math.sqrt(bhaskaraDelta)) / (2 * A);

      System.out.printf("R1 = %.5f\n", bhaskaraR1);
      System.out.printf("R2 = %.5f\n", bhaskaraR2);
    }

  }
}
