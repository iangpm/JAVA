public class Aluno {
    private String nomealuno;
    private int idadealuno;
    private double nota1, nota2, media;

    public String getNomealuno() {
        return nomealuno;
    }
    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public int getIdadealuno() {
        return idadealuno;
    }
    public void setIdadealuno(int idadealuno) {
        this.idadealuno = idadealuno;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }
    public void calculaMedia() {
        this.media = (nota1 + nota2) / 2;
    }
}
