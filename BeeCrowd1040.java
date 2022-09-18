import java.util.Scanner;

public class BeeCrowd1040 {

  // Problem URL: https://www.beecrowd.com.br/judge/en/problems/view/1040
  // Last access 18 September 2022
  // Visit my GitHub repository @ https://github.com/skan90

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float grade1 = input.nextFloat();
    float grade2 = input.nextFloat();
    float grade3 = input.nextFloat();
    float grade4 = input.nextFloat();

    float averageGrade = ((grade1 * 2) + (grade2 * 3) + (grade3 * 4) + grade4) / 10;
    if (averageGrade >= 7.0) {
      System.out.printf("Media: %.1f\n", averageGrade);
      System.out.println("Aluno aprovado.");
    } else if (averageGrade < 5.0) {
      System.out.printf("Media: %.1f\n", averageGrade);
      System.out.println("Aluno reprovado.");
    } else if (averageGrade >= 5.0 || averageGrade < 7.0) {
      System.out.printf("Media: %.1f\n", averageGrade);
      System.out.println("Aluno em exame.");
      float exam = input.nextFloat();
      System.out.println("Nota do exame: " + exam);
      input.close();
      averageGrade = (averageGrade + exam) / 2;
      if (averageGrade < 5.0) {
        System.out.println("Aluno reprovado.");
        System.out.printf("Media final: %.1f\n", averageGrade);
      } else {
        System.out.println("Aluno aprovado.");
        System.out.printf("Media final: %.1f\n", averageGrade);
      }
    }
    input.close();
  }
}
