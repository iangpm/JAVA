//Exercicio 1
public class Aula2 {
    public static void main(String[] args){
        int x = 3;
        System.out.println("Boa tarde! O que deseja? Digite: -1 para comprar item " +
                "\n -2 para consultar valor" +
                "\n -3 para falar com atendente e 0 para retornar ao menu");
        switch(x){
            case 0:
                System.out.println("Retornar ao menu principal");
                break;
            case 1:
                System.out.println("Desejo comprar um item" +
                        "\n -Temos itens de pet shop, loja de roupas e clínica médica");
                break;
            case 2:
                System.out.println("Desejo saber o valor de um produto ou serviço" +
                        "\n -Seguem ofertas imperdíveis: " +
                        "\n -Ração premium para animais de porte pequeno por R$39.90" +
                        "\n -Vestido de alça por R$84.90" +
                        "\n -Pacote de 100 luvas cirúrgicas por R$23.90");
                break;
            case 3:
                System.out.println("Desejo falar com um atendente" +
                        "\n -Você fala com Laura, como posso ajudar?");
            break;
            default:
                System.out.println("Escolha inválida");
        }
    }
}
