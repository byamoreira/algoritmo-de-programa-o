
import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.print("Digite um numero: ");
        int numero2 = scanner.nextInt();
        int soma=numero+numero2;

        System.out.println("A soma é: " + soma);
        scanner.close();}}
