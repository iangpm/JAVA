import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Medias2 m = new Medias2();

        System.out.println("Digite o nome do aluno: ");
        m.nome = scanner.nextLine();

        System.out.print("Informe a primeira nota: ");
        m.nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        m.nota2 = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        m.nota3 = scanner.nextDouble();

        m.soma = m.media(m.nota1, m.nota2, m.nota3);
        System.out.print("A média do aluno é "+ m.soma);

        if (m.soma >= 7){
            System.out.println("\nO aluno foi aprovado");
        } else if (m.soma < 4){
            System.out.println("O aluno foi reprovado");
        } else {
            System.out.println("O aluno está na final");
        }
    }
}
