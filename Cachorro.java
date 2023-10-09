public class Cachorro extends Animal implements Corrida {
    public Cachorro(String nome, String genero, String especie, String habitat, int idade, double peso){
            super(nome, genero, especie, habitat, idade, peso);
    }

    @Override
    public void emitirSom(){
        System.out.println("AU AU!");
    }

    @Override
    public void correr(){
        System.out.println("Estou correndo!");
    }
}
