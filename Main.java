import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        Moto m = new Moto();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

            System.out.println("Deseja acessar informações sobre carro ou moto? Digite:" +
                    "\n1 - Para carro" +
                    "\n2 - Para moto");

            int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("Informe a marca do carro: ");
                    c.setMarca(sc2.nextLine());

                    System.out.println("Informe o modelo do carro: ");
                    c.setModelo(sc2.nextLine());

                    System.out.println("Informe o ano de fabricação do carro: ");
                    c.setAnoFabric(sc.nextInt());

                    System.out.println("Informe o número de portas do carro: ");
                    c.setNumPortas(sc.nextInt());

                    System.out.println("O carro é da marca " + c.getMarca());
                    System.out.println("\nO carro é do modelo " + c.getModelo());
                    System.out.println("\nO carro foi fabricado em " + c.getAnoFabric());
                    System.out.println("\nO número de portas do carro é " + c.getNumPortas());
                    break;
                case 2:
                    System.out.println("Informe a marca da moto: ");
                    m.setMarca(sc2.nextLine());

                    System.out.println("Informe o modelo da moto: ");
                    m.setModelo(sc2.nextLine());

                    System.out.println("Informe o ano de fabricação da moto: ");
                    m.setAnoFabric(sc.nextInt());

                    System.out.println("Informe quantas cilindradas tem a moto: ");
                    m.setCilindradas(sc.nextInt());

                    System.out.println("A moto é da marca " + m.getMarca());
                    System.out.println("\nA moto é do modelo " + m.getModelo());
                    System.out.println("\nA moto foi fabricada em " + m.getAnoFabric());
                    System.out.println("\nO número de cilindradas da moto é " + m.getCilindradas());
                    break;
            }
        sc.close();
    }
}
