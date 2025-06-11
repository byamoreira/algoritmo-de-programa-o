
import java.util.Scanner;
public class Exercicio3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota1: ");
        double nota = scanner.nextInt();

        System.out.print("Nota2: ");
        double nota2 = scanner.nextInt();
        double soma = nota+nota2;
        double media = (soma/2);
        System.out.printf("Media: %.2f%n ",media);
        if(media>=5)
        System.out.println("Aprovado");
        else  if(media<5)
        System.out.println("Reprovado");
        {
        }

        scanner.close();}}
