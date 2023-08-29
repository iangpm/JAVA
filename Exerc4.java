//Exercicio4
public class Exerc4 {
    public static void main (String[] args){
        double salario = 2595.50;

        if (salario <= 900){
            System.out.println("Você está isento de desconto.");
        } else if (salario >= 901 && salario <= 1500){
            System.out.println("Você recebe um desconto de 5%!");
            System.out.println("Seu salário fica R$"+ salario * 0.95);
        } else if (salario >= 1501 && salario <= 2500){
            System.out.println("Você recebe um desconto de 10%!");
            System.out.println("Seu salário fica R$"+ salario * 0.90);
        } else if (salario >= 2500){
            System.out.println("Você recebe um desconto de 20%");
            System.out.println("Seu salário fica R$"+ salario * 0.80);
        }
    }
}
