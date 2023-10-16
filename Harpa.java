public class Harpa extends Instrumento implements trocarCorda {
    public void tocar(){
        System.out.println("O príncipe Rhaegar toca sua harpa");
    }
    public void afinar(){
        System.out.println("O príncipe Rhaegar afina sua harpa");
    }

    @Override
    public void trocaCordas(){
        System.out.println("O príncipe Rhaegar troca as cordas de sua harpa \n");
    }
}
