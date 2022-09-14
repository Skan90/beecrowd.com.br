import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1037
// Last access 14 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1037 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double number = input.nextDouble();
    input.close();
    if (number < 0.0 || number > 100.0) {
      System.out.println("Fora de intervalo");
    } else if (number <= 25.0000) {
      System.out.println("Intervalo [0,25]");
    } else if (number <= 50.00000 && number > 25.00000) {
      System.out.println("Intervalo (25,50]");
    } else if (number <= 75.00000 && number > 50.00001) {
      System.out.println("Intervalo (50,75]");
    } else {
      System.out.println("Intervalo (75,100]");
    }
  }
}
