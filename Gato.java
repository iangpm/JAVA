class Gato extends Animal implements Corrida {
    public Gato(String nome, String genero, String especie, String habitat, int idade, double peso){
        super(nome, genero, especie, habitat, idade, peso);
    }

    @Override
    public void emitirSom(){
        System.out.println("MINHAU!");
    }

    @Override
    public void correr(){
        System.out.println("Estou correndo!");
    }
}
