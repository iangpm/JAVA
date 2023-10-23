import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void cadastrar(Pessoa p) {
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listar(){
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
