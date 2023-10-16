public class Violao extends Instrumento implements trocarCorda{
    public void tocar(){
        System.out.println("Annie Clark toca seu violão");
    }
    public void afinar(){
        System.out.println("Annie Clark afina seu violão");
    }

    @Override
    public void trocaCordas(){
        System.out.println("Annie Clark troca as cordas de seu violão \n");
    }
}
