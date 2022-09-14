import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1017
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1017 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int travelTimeInHours = input.nextInt();
        int avgSpeedInKm = input.nextInt();
        input.close();
        var travelDistance = travelTimeInHours * avgSpeedInKm;
        double gasConsumption = (travelDistance / 12.0);
        System.out.printf("%.3f\n", gasConsumption);
    }
}
