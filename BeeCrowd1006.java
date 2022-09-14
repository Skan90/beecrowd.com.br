import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1006
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        var MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
