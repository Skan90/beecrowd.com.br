import java.sql.SQLOutput;
import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1021
// Last access 12 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monetaryAmount = input.nextFloat();
        int integerValue;

        System.out.println("NOTAS:");

        integerValue = (int) monetaryAmount / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", (integerValue));
        monetaryAmount = monetaryAmount % 100.0;

        integerValue = (int) monetaryAmount / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", (integerValue));
        monetaryAmount = monetaryAmount % 50.0;

        integerValue = (int) monetaryAmount / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", (integerValue));
        monetaryAmount = monetaryAmount % 20.0;

        integerValue = (int) monetaryAmount / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", (integerValue));
        monetaryAmount = monetaryAmount % 10.0;

        integerValue = (int) monetaryAmount / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", (integerValue));
        monetaryAmount = monetaryAmount % 5.0;

        integerValue = (int) monetaryAmount / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", (integerValue));
        monetaryAmount = monetaryAmount % 2.0;

        System.out.println("MOEDAS:");
        monetaryAmount = monetaryAmount * 100;

        integerValue = (int) monetaryAmount / 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", integerValue);
        monetaryAmount = monetaryAmount % 100.0;

        integerValue = (int) monetaryAmount / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", integerValue);
        monetaryAmount = monetaryAmount % 50.0;

        integerValue = (int) monetaryAmount / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", integerValue);
        monetaryAmount = monetaryAmount % 25.0;

        integerValue = (int) monetaryAmount / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", integerValue);
        monetaryAmount = monetaryAmount % 10.0;

        integerValue = (int) monetaryAmount / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", integerValue);
        monetaryAmount = monetaryAmount % 5.0;

        System.out.printf("%.0f moeda(s) de R$ 0.01\n", monetaryAmount);
        input.close();

    }

}
