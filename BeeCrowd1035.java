import java.util.Scanner;

public class BeeCrowd1035 {

    // Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1035
    // Last access 13 September 2022
    // Visit my GitHub repository @ https://github.com/skan90

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int sumOfAB = A + B;
        int sumOfCD = C + D;
        int restOfDivision = A % 2;
        input.close();
        if (B > C && D > A && sumOfCD > sumOfAB && C > 0 && D > 0 && restOfDivision == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
