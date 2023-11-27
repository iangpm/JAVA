package entities;

import util.MsgComum;

public class PessoaIdosa extends Pessoa implements MsgComum {
    public PessoaIdosa(String nome, int idade, String sexo) {
        super(nome, idade, sexo, true);
    }

    @Override
    public String mensagem() {
       return "Pessoas com mais de 65 anos recebem 5% de desconto";
    }

    @Override
    public String toString() {
        return  "PessoaIdosa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + ", sexo="+sexo+
            '}'+" " + mensagem();
    }
}
