import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1016
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1016 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kilometers = input.nextInt();
        input.close();
        int minutes = kilometers * 2;
        System.out.println(minutes + " minutos");
    }
}
