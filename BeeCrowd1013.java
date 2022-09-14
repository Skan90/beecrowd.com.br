import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1013
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        int greatestAB = (a + b + Math.abs(a - b)) / 2;
        int greatestABC = (greatestAB + c + Math.abs(greatestAB - c)) / 2;

        System.out.println(greatestABC + " eh o maior");
    }
}
