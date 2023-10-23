import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Cadastro c = new Cadastro();
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();


        System.out.println("Informe o nome da pessoa a ser cadastrada: ");
        p.setNome(scanner.next());

        System.out.println("Informe a idade da pessoa a ser cadastrada: ");
        p.setIdade(scanner.nextInt());

        c.cadastrar(pf);

        c.listar();
    }
}
