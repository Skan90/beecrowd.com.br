import java.util.Scanner;

public class BeeCrowd1043 {

  // Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1043
  // Last access 18 September 2022
  // Visit my GitHub repository @ https://github.com/skan90

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double aLength = input.nextDouble();
    double bLength = input.nextDouble();
    double cLength = input.nextDouble();

    double aPlusB = aLength + bLength;
    double aPlusC = aLength + cLength;
    double bPlusC = bLength + cLength;

    // (if statement)
    // Triangle Inequality Theorem - Euclidean geometry:
    // The sum of any two sides of a triangle is greater than
    // to the third side.
    if (aPlusB > cLength && aPlusC > bLength && bPlusC > aLength) {
      double trianglePerimeter = aLength + bLength + cLength;
      System.out.printf("Perimetro = %.1f\n", trianglePerimeter);
    } else {
      double trapeziumArea = (0.5 * (aLength + bLength)) * cLength;
      System.out.printf("Area = %.1f\n", trapeziumArea);
    }
    input.close();
  }
}
