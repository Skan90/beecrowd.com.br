import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1004
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short A = input.nextShort();
        short B = input.nextShort();
        var PROD = A * B;
        System.out.println("PROD = " + PROD);

    }
}
