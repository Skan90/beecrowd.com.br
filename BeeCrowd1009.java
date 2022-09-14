import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1009
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        float salary = input.nextFloat();
        float sales = input.nextFloat();
        System.out.printf("TOTAL = R$ %.2f\n", (salary + (sales * .15)));
    }
}
