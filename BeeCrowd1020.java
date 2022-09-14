import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1020
// Last access 12 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int year = age / 365;
        int month = (age - (year * 365)) / 30;
        int day = ((age - (year * 365)) - month * 30);
        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");
    }
}
