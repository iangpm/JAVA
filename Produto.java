public class Produto {
    protected String nome, categoria;
    protected int codigo;
    protected double preco;

    public Produto(String nome, String categoria, int codigo, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void descontar(){
    }
}
