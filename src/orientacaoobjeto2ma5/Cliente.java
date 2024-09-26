package orientacaoobjeto2ma5;

public class Cliente extends Pessoa {

    private String nome;

    public Cliente(int idade, int quantidadeFilhos, double salario, String nome) {
        super(idade, quantidadeFilhos, salario);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void fidelizarCliente(double renda, int quantFilhos) {
        if (renda > 2500 && quantFilhos > 3) {
            System.out.println("fidelize o cliente");
        } else {
            System.out.println("Acompanhar a evolução do cliente");
        }
    }

    public void liberarDesconto(int idade, int quantFilhos) {
        if (idade > 35 && quantFilhos > 2) {
            System.out.println("Desconto liberado para Sr(a) " + getNome());
        } else {
            System.out.println(getNome() + ", desconto não liberado! Entre em contato com a Central.");
        }
    }

}
