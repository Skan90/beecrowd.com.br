import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1045
// Last access 18 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1045 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = 0;

    if (b >= c && b >= a) {
      d = a;
      a = b;
      b = d;
    }

    if (c >= a && c >= b) {
      d = a;
      a = c;
      c = d;
    }

    double aSquared = Math.pow(a, 2);
    double bSquared = Math.pow(b, 2);
    double cSquared = Math.pow(c, 2);

    double bPlusC = b + c;

    if (a >= bPlusC) {
      System.out.println("NAO FORMA TRIANGULO");
    } else {
      if (aSquared == (bSquared + cSquared)) {
        System.out.println("TRIANGULO RETANGULO");
      }
      if (aSquared > (bSquared + cSquared)) {
        System.out.println("TRIANGULO OBTUSANGULO");
      }
      if (aSquared < (bSquared + cSquared)) {
        System.out.println("TRIANGULO ACUTANGULO");
      }
      if (a == b && a == c) {
        System.out.println("TRIANGULO EQUILATERO");
      }
      if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
        System.out.println("TRIANGULO ISOSCELES");
      }
    }

    input.close();
  }
}
