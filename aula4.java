import java.util.Scanner;

public class aula4 {
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       IMC i = new IMC();


       System.out.println("Informe sua altura: ");
       i.setAltura(sc.nextDouble());
       System.out.println("Você mede " + i.getAltura() + " metros");

       System.out.println("Informe seu peso: ");
       i.setPeso(sc.nextDouble());
       System.out.println("Você pesa " + i.getPeso() + " kg");

        System.out.printf("Seu IMC é de %.2f ", i.getIndice());
   }

}
