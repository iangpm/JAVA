import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Diretor d = new Diretor();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Olá! Deseja realizar cadastro como gerente ou diretor? Digite:" +
                "\n1 - Para gerente" +
                "\n2 - Para diretor");

        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("Informe seu nome: ");
                g.setNome(sc2.nextLine());

                System.out.println("Informe seu salário: R$ ");
                g.setSalario(sc.nextDouble());

                System.out.println("Informe seu departamento: ");
                g.setDepartamento(sc2.nextLine());

                g.calcularBonus();
                System.out.println("Seu nome é  " + g.getNome());
                System.out.println("\nSeu salário é R$ " + g.getSalario());
                System.out.println("\nO seu departamento é " + g.getDepartamento());
                System.out.println("\nSeu salário com desconto é R$ " + g.getDesconto());
                break;
            case 2:
                System.out.println("Informe seu nome: ");
                d.setNome(sc2.nextLine());

                System.out.println("Informe seu salário: R$ ");
                d.setSalario(sc.nextDouble());

                System.out.println("Informe quantas ações tem: ");
                d.setAcoes(sc.nextInt());

                System.out.println("Seu nome é " + d.getNome());
                System.out.println("\nSeu salário é " + d.getSalario());
                System.out.println("\nO número de ações que você tem é " + d.getAcoes());
                break;
        }
        sc.close();
    }
}
