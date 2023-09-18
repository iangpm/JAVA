public class Main {
    public static void main(String[] args){

        Aluno a = new Aluno("Joãozinho", 13, 1234567);
        Professor p = new Professor("Carlos Lucio", 65, 1750);

        System.out.println("Nome do aluno: " + a.getNome());
        System.out.println("Idade do aluno: " + a.getIdade());
        System.out.println("Matrícula do aluno: " + a.getMatricula());

        System.out.println("Nome do professor: " + p.getNome());
        System.out.println("Idade do professor: " + p.getIdade());
        System.out.println("Salário do professor: R$" + p.getSalario());
    }
}
