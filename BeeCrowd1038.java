import java.util.Scanner;

public class BeeCrowd1038 {

  // Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1038
  // Last access 17 September 2022
  // Visit my GitHub repository @ https://github.com/skan90

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] price = { 0.0, 4.0, 4.5, 5.0, 2.0, 1.5 };
    int code = input.nextInt();
    int quantity = input.nextInt();
    double total = price[code] * quantity;
    System.out.printf("Total: R$ %.2f\n", total);
    input.close();
  }

}