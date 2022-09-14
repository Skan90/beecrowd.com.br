import java.util.*;

// Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1010
// Last access 9 September 2022
// Visit my GitHub repository @ https://github.com/skan90

public class BeeCrowd1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String produto1 = input.nextLine();
        String produto2 = input.nextLine();
        String[] divisaoEmArray1 = produto1.split("\\s+");
        String[] divisaoEmArray2 = produto2.split("\\s+");
        int quantidade1 = Integer.parseInt(divisaoEmArray1[1]);
        int quantidade2 = Integer.parseInt(divisaoEmArray2[1]);
        float preco1 = Float.parseFloat(divisaoEmArray1[2]);
        float preco2 = Float.parseFloat(divisaoEmArray2[2]);
        float valorTotal = (quantidade1 * preco1) + (quantidade2 * preco2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

    }
}
