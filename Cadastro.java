public class Cadastro {
    private int codigo;
    private String nome;
    private int quantidade;
    private int qtdvenda;
    private int estoque;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setQuantidade  (int quantidade){
        this.quantidade = quantidade;
    }
    public int getIndice(){
        return quantidade;
    }

    public void setQtdvenda (int qtdvenda){
        this.qtdvenda = qtdvenda;
    }
    public int getQtdvenda(){
        return qtdvenda;
    }

    public void setEstoque (int estoque){
        this.estoque = estoque;
    }
    public int getEstoque(){
        return estoque = quantidade - qtdvenda;
    }
}
