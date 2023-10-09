public abstract class Animal {
    protected String nome, genero, especie, habitat;
    protected int idade;
    protected double peso;

    public Animal(String nome, String genero, String especie, String habitat, int idade, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.especie = especie;
        this.habitat = habitat;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();
}
