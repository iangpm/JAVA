//Exercicio3
public class Exerc3 {
    public static void main (String[] args) {
        double nota1 = 7.5;
        double nota2 = 5.2;
        double nota3 = 8.8;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("Você está aprovado!");
        }else if (media < 4){
            System.out.println("Você foi reprovado.");
        }else{
            System.out.println("Você está na final.");
        }
    }
}
