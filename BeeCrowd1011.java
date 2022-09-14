import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1011
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double raioAoCubo = Math.pow(raio, 3);
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * raioAoCubo;
        System.out.printf("VOLUME = %.3f\n", volume);

    }
}
