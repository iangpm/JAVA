public class Roupa extends Produto{
    public Roupa(String nome, String categoria, int codigo, double preco){
        super(nome, categoria, codigo, preco);
    }

    @Override
    public void descontar() {
        System.out.printf("Roupas não recebem descontos");
    }
}
