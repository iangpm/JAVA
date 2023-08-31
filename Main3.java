import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        System.out.println("Qual operação deseja realizar? " +
                "\n1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão");
        int x = scanner.nextInt();
        do {
            switch (x) {
                case 1:
                    System.out.println("Você selecionou soma");
                    System.out.println("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + c.somar(n1, n2));
                    break;
                case 2:
                    System.out.println("Você selecionou subtração");
                    System.out.println("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + c.subtrair(n1, n2));
                    break;
                case 3:
                    System.out.println("Você selecionou multiplicação");
                    System.out.println("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + c.multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println("Você selecionou divisão");
                    System.out.println("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + c.dividir(n1, n2));
                    break;
            }
            System.out.println("Para retornar, digite 0");
            x = scanner.nextInt();
        }
        while (x==0);

        scanner.close();
    }
}