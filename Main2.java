public class Main2 {
    public static void main (String[] args){

        Livro l = new Livro("Duna", "livro", 123456, 80.00);
        Eletronico e = new Eletronico("PS5", "eletrônico", 12347, 4000);
        Roupa r = new Roupa("casaco", "roupa", 215453, 66.00);

        System.out.println("O " + l.getCategoria() + " " + l.getNome() + ", código " + l.getCodigo() + ", custa R$" + l.getPreco());
        l.descontar();
        System.out.println("O " + e.getCategoria() + " " + e.getNome() + ", de código " + e.getCodigo() + ", custa R$" + e.getPreco());
        e.descontar();
        System.out.println("A peça de " + r.getCategoria() + " " + r.getNome() + ", de código " + r.getCodigo() + ", custa R$" + r.getPreco());
        r.descontar();
        
    }
}
