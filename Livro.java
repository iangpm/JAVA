public class Livro extends Produto {
        public Livro(String nome, String categoria, int codigo, double preco){
                super(nome, categoria, codigo, preco);
        }

        @Override
        public void descontar(){
                System.out.println("O desconto de 10% faz o produto ser R$" + preco * 0.9);
        }
}