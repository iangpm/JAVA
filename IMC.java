public class IMC {

    private double altura;
    private double peso;
    private double indice;

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public void setIndice  (double indice){
        this.indice = indice;
    }
    public double getIndice(){
        return indice = peso / (altura * altura);
    }
}

