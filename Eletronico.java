public class Eletronico extends Produto{
    public Eletronico(String nome, String categoria, int codigo, double preco){
        super(nome, categoria, codigo, preco);
    }

    @Override
    public void descontar() {
        System.out.printf("O desconto de 5% faz o produto ser R$" + preco * 0.95);
    }
}
