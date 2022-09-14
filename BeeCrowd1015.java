import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1015
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double planeOneX = input.nextFloat();
        double planeOneY = input.nextFloat();
        double planeTwoX = input.nextFloat();
        double planeTwoY = input.nextFloat();
        input.close();

        double planesXsPow = Math.pow((planeTwoX - planeOneX), 2);
        double planesYsPow = Math.pow((planeTwoY - planeOneY), 2);
        double distance = Math.sqrt(planesXsPow + planesYsPow);
        System.out.printf("%.4f\n", distance);
    }
}
