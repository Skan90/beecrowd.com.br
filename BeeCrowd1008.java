import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1008
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short employeesNumber = input.nextShort();
        short workedHours = input.nextShort();
        float salaryPerHour = input.nextFloat();
        System.out.println("NUMBER = " + employeesNumber);
        System.out.printf("SALARY = U$ %.2f\n", (workedHours * salaryPerHour));
    }
}
