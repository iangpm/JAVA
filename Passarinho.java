class Passarinho extends Animal implements Voar {
    public Passarinho(String nome, String genero, String especie, String habitat, int idade, double peso){
    super(nome, genero, especie, habitat, idade, peso);
    }

    @Override
    public void emitirSom(){
        System.out.println("PIU PIU!");
    }

    @Override
    public void voar(){
        System.out.println("Estou voando!");
    }
}
