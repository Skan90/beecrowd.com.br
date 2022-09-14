import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1007
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short a = input.nextShort();
        short b = input.nextShort();
        short c = input.nextShort();
        short d = input.nextShort();
        System.out.println("DIFERENCA = " + (a * b - c * d));

    }
}
