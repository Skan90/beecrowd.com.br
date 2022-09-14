import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1019
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds - (hours * 3600)) / 60;
        seconds = seconds - (hours * 3600 + minutes * 60);
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}
