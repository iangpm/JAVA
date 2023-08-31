public class Medias {
    String nome;
    Double nota1;
    Double nota2;
    Double nota3;
    Double soma;

    public double media (double nota1, double nota2, double nota3){
        soma = (nota1 + nota2 + nota3) / 3;
        return soma;
    }
}
