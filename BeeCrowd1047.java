import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1047
// Last access 14 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startingHour = input.nextInt();
        int startingMinute = input.nextInt();
        int finishedHour = input.nextInt();
        int finishedMinute = input.nextInt();
        if (finishedHour <= startingHour && startingMinute >= finishedMinute) {
            finishedHour = finishedHour + 24;
        }

        int totalOfHours = Math.abs(startingHour - finishedHour);

        if (finishedMinute < startingMinute && totalOfHours != 0) {
            totalOfHours = totalOfHours - 1;
        }
        if (finishedMinute < startingMinute) {
            finishedMinute = finishedMinute + 60;
        }
        int totalOfMinutes = Math.abs(startingMinute - finishedMinute);

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalOfHours, totalOfMinutes);
        input.close();
    }
}
