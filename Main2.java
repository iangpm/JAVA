public class Main2 {
    public static void main (String[] args){

        Livro l = new Livro("Duna", "livro", 123456, 79.9);
        Eletronico e = new Eletronico("PS5", "eletrônico", 12347, 4000);
        Roupa r = new Roupa("Casaco", "roupa", 215453, 65.9);

        System.out.println("O " + l.getCategoria() + " " + l.getNome() + ", código " + l.getCodigo() + "custa R$" +l.getPreco());
        l.descontar();


    }
}
