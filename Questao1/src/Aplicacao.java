import java.util.Scanner;

public class Aplicacao {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Digite a primereira nota: ");
       double nota1 = sc.nextDouble();
       System.out.print("Digite a segunda nota: ");
       double nota2 = sc.nextDouble();

       double media = (nota1 + nota2 ) / 2.0;

       if (media >= 7.0) {
           System.out.printf("O aluno está aprovado!");
       } else if (media < 4.0) {
           System.out.printf("O aluno está reprovado!");
       } else {
           System.out.printf("O aluno está na final!");
       }
       sc.close();
   }

}
