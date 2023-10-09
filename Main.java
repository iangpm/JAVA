public class Main {
    public static void main (String[] args){

        Cachorro c = new Cachorro("Tyrion", "macho", "daschund", "Alemanha", 7, 12.5);
        Gato g = new Gato("Linguota", "fêmea", "sphynx", "Egito", 3, 10.0);
        Passarinho p = new Passarinho("Piu-Piu", "macho", "canário", "savana", 2, 4.5);

        System.out.printf("O passarinho " + p.getNome() + ", da espécie " + p.getEspecie() + ", é " + p.getGenero() +
                ", tem " + p.getIdade() + " anos, " + "pesa " + p.getPeso() + "kg, e é originário da " + p.getHabitat());
        System.out.println(". \nEle diz: ");
        p.emitirSom();
        System.out.println("Ou traduzindo: ");
        p.voar();
        System.out.printf("\nO cão " + c.getNome() + ", da espécie " + c.getEspecie() + ", é " + c.getGenero() +
                ", tem " + c.getIdade() + " anos, " + "pesa " + c.getPeso() + "kg, e é originário da " + c.getHabitat());
        System.out.println(". \nEle diz: ");
        c.emitirSom();
        System.out.println("Ou traduzindo: ");
        c.correr();
        System.out.printf("\nO gato " + g.getNome() + ", da espécie " + g.getEspecie() + ", é " + g.getGenero() +
                ", tem " + g.getIdade() + " anos, " + "pesa " + g.getPeso() + "kg, e é originário da " + g.getHabitat());
        System.out.println(". \nEla diz: ");
        g.emitirSom();
        System.out.println("Ou traduzindo: ");
        g.correr();
    }
}
