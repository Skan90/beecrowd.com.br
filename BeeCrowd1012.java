import java.util.Scanner;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1012
// Last access 10 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", ((c / 2) * (a + b)));
        System.out.printf("QUADRADO: %.3f\n", (Math.pow(b, 2)));
        System.out.printf("RETANGULO: %.3f\n", (a * b));
    }
}
