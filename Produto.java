public class Produto {
    protected String nome;
    protected double preco;
    protected String cor;

    public Produto(String nome, double preco, String cor){
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }
}
