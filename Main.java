public class Main {
    public static void main(String[] args){

        Teste t = new Teste();
        Violao v = new Violao();
        Harpa h = new Harpa();

        t.fazerTocar(new Harpa());
        t.fazerAfinar(new Harpa());
        h.trocaCordas();
        
        t.fazerTocar(new Violao());
        t.fazerAfinar(new Violao());
        v.trocaCordas();

        t.fazerTocar(new Flauta());
        t.fazerAfinar(new Flauta());
    }
}
