import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1005
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        var MEDIA = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
