public class Main2 {
    public static void main(String[] args) {

        Prod1 p1 = new Prod1("Camisa", 49.99, "Camisa polo azul");
        Prod2 p2 = new Prod2("Calça", 99.99, "Calça jeans preta");

        System.out.println("Nome do primeiro produto: " + p1.getNome());
        System.out.println("Preço do primeiro produto: " + p1.getPreco());
        System.out.println("Descrição do primeiro produto: " + p1.getCor());

        System.out.println("Nome do segundo produto: " + p2.getNome());
        System.out.println("Preço do segundo produto: " + p2.getPreco());
        System.out.println("Descrição do segundo produto: " + p2.getCor());

    }
}