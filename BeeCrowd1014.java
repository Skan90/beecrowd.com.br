import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1014
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalDistanceInKm = input.nextInt();
        float totalFuelSpent = input.nextFloat();
        input.close();
        var consumption = totalDistanceInKm / totalFuelSpent;
        System.out.printf("%.3f km/l\n", consumption);
    }
}
