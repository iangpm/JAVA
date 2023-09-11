import java.util.Scanner;

public class Aula5 {
     public static void main(String[] args) {
         Professor p = new Professor();
         Aluno a = new Aluno();
         Scanner sc = new Scanner(System.in);
         Scanner sc2 = new Scanner(System.in);

            System.out.println("Olá! Qual cadastro deseja realizar? " +
                    "\n Digite 1 para: Professor" +
                    "\n Digite 2 para: Aluno");

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Informe seu nome: ");
                    p.setNome(sc2.nextLine());

               //     sc.nextLine();
                    System.out.println("Informe sua idade: ");
                    p.setIdade(sc.nextInt());

                  //  sc.nextLine();
                    System.out.println("Informe sua especialização:  ");
                    p.setEspecializ(sc2.nextLine());

                    System.out.println("Informe seu salário: R$");
                    p.setSalario(sc.nextDouble());

                     System.out.println("Seu nome é " + p.getNome());
                     System.out.println("\nSua idade é " + p.getIdade());
                     System.out.println("\nSeu salário é R$" + p.getSalario());
                    System.out.println("\nSua especialização é em " + p.getEspecializ());
                    break;
                case 2:
                    System.out.println("Informe seu nome: ");
                    a.setNomealuno(sc.nextLine());

                    sc.nextLine();
                    System.out.println("Informe sua idade: ");
                    a.setIdadealuno(sc.nextInt());

                    System.out.println("Informe sua primeira nota: ");
                    a.setNota1(sc.nextDouble());

                    System.out.println("Informe sua segunda nota: ");
                    a.setNota2(sc.nextDouble());

                    a.calculaMedia();
                    System.out.println("Seu nome é " + a.getNomealuno());
                    System.out.println("\n Sua idade é " + a.getIdadealuno());
                    System.out.println("\n Sua primeira nota foi " + a.getNota1());
                    System.out.println("\n Sua segunda nota foi " + a.getNota2());
                    System.out.println("\n Sua média foi " + a.getMedia());
                    break;
            }
        }
    }
