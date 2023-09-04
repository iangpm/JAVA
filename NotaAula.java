import java.util.Scanner;

public class NotaAula {
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        c.setNome(sc.nextLine());

        System.out.println("Informe o código do produto: ");
        c.setCodigo(sc.nextInt());

        System.out.println("Informe a quantidade em estoque:  ");
        c.setQuantidade(sc.nextInt());

        System.out.println("As informações foram cadastradas com sucesso! Deseja realizar uma venda? Se sim, digite 1. Se não"
                + " digite 0");

        int x = sc.nextInt();
        switch (x) {
            case 0:
                System.out.println("Encerrando o programa, obrigado pela cooperação!");
                break;
            case 1:
                System.out.println("Quantos itens deseja vender? ");
                c.setQtdvenda(sc.nextInt());
                System.out.println("A nova quantidade do estoque é " + c.getEstoque());
                break;
        }
    }
}
