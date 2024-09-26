package orientacaoobjeto2ma5;

public class Funcionario extends Pessoa {

    private int tempoServico;

    public Funcionario(int idade, int quantidadeFilhos, double salario, int tempoServico) {
        super(idade, quantidadeFilhos, salario);
        this.tempoServico = tempoServico;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void aumentarSalario(double salario, int idade) {
        if (salario >= 1500 && idade > 27) {
            System.out.printf("Salário antigo: R$ %.2f\n", salario);
            System.out.printf("Aumento de R$ %.2f\n", (salario * 0.25));
            System.out.printf("Novo salário R$ %.2f\n", (salario * 1.25));
        } else {
            System.out.printf("Salário: R$ %.2f\n", salario);
        }

    }

    public void promoverFuncionario(int tempoServico, int idade) {
        if (tempoServico > 5 && idade > 32) {
            System.out.println("Parabéns, novo gerente do setor");
        } else {
            System.out.println("Não desista da promoção");
        }
    }

    public void demitirFuncionario(int quantFilhos, int idade, int tempoServico) {
        if (idade > 55 && quantFilhos < 2 && tempoServico < 10) {
            System.out.println("Funcionário demitido");
        } else {
            System.out.println("Funcionário não apresenta quesitos para demissão");
        }

    }

}
