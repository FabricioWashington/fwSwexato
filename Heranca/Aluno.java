
public class Aluno extends Pessoa {
    private String matricula;
    private double mencao1;
    private double mencao2;

    public Aluno(String nome, int idade, String matricula, double mencao1, double mencao2) {
        super(nome, idade);
        this.matricula = matricula;
        this.mencao1 = mencao1;
        this.mencao2 = mencao2;
    }

    public double mediaFinal() {
        return (mencao1 + mencao2) / 2;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matricula: " + matricula);
        System.out.println("Mencão 1: " + mencao1);
        System.out.println("Menção: " + mencao2);
        System.out.println("Media Final: " + mediaFinal());

    }

}
