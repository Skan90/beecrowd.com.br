import java.io.IOException;
import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1002
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1002 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double A = 3.14159 * Math.pow(R, 2);
        System.out.printf("A=%.4f\n", A);
    }

}
