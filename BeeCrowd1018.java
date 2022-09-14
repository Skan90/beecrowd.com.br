import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1018
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int withdrawAmount = input.nextInt();
        System.out.println(withdrawAmount);
        System.out.println(withdrawAmount / 100 + " nota(s) de R$ 100,00");
        withdrawAmount = withdrawAmount % 100;
        System.out.println(withdrawAmount / 50 + " nota(s) de R$ 50,00");
        withdrawAmount = withdrawAmount % 50;
        System.out.println(withdrawAmount / 20 + " nota(s) de R$ 20,00");
        withdrawAmount = withdrawAmount % 20;
        System.out.println(withdrawAmount / 10 + " nota(s) de R$ 10,00");
        withdrawAmount = withdrawAmount % 10;
        System.out.println(withdrawAmount / 5 + " nota(s) de R$ 5,00");
        withdrawAmount = withdrawAmount % 5;
        System.out.println(withdrawAmount / 2 + " nota(s) de R$ 2,00");
        withdrawAmount = withdrawAmount % 2;
        System.out.println(withdrawAmount + " nota(s) de R$ 1,00");

    }
}
