//Exercício 1
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Pessoa1 p = new Pessoa1();

        System.out.println("Informe sua matrícula: ");
        p.matricula = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Informe seu nome completo: ");
        p.nomecompleto = scanner.nextLine();

        System.out.println("Informe seu salário: R$ ");
        p.salario = scanner.nextDouble();

        System.out.println("Aplicando-se o desconto de 15% do INSS: R$");
        p.desconto = scanner.nextDouble();

        System.out.println("O salário líquido é: R$");
        p.salliq = scanner.nextDouble();

        System.out.println("Sua matrícula é: "+ p.matricula);
        System.out.println("Seu nome completo é: "+ p.nomecompleto);
        System.out.println("Seu salário é: R$ "+ p.salario);
        System.out.println("A dedução do INSS é: R$ "+ p.desconto);
        System.out.println("Seu salário líquido é: "+ p.salliq);

        scanner.close();
    }
}
