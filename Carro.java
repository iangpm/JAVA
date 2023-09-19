public class Carro {
    private String marca, modelo;

    public Carro (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDetalhes() {
        System.out.printf("O carro é da marca " + marca + "e do modelo " + modelo);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
