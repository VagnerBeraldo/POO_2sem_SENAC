/*
2) Escreva um programa usando o paradigma da orientação a objetos para seguinte 
situação. Duas classes, Funcionário e Cliente, onde o usuário deve escolher 
apenas um deles para inserir as seguintes informações: nome, idade, quantidade 
de filhos, salário ou renda. Para a classe funcionário devem existir três métodos. 
O primeiro método é aumentar salário. Este método tem como parâmentros salário e 
idade do funcionário. A condição para aumentar o salário é salário maior ou igual 
R$ 1500 e idade maior que 27 anos. Atendida a condição o aumento será de 25% sobre 
o salário atual.
O segundo método é promover o funcionário. Este método tem como parâmetros tempo 
de serviço e idade do funcionário. A condição de promoção é tempo de serviço maior 
que cinco anos e idade maior que 32 anos. Atendida a condição o funcionário vai 
para gerencia de setor e imprimirá na tela “gerente de setor”.
O terceiro método é para demitir o funcionário. Este método tem como parâmetros 
quantidade de filhos, idade e tempo de empresa. A condição de demissão será idade 
acima de 55 anos e menos de dois filhos e menos de 10 anos de empresa.
Para a classe cliente devem existir dois métodos. O primeiro é para fidelizar o 
cliente. As condições para fidelizar são renda maior que R$ 2500 e a quantidade 
de filhos maior que 3. Atendida a condição imprima na tela “fidelize o cliente”.
O segundo método é para liberar desconto no nome do cliente. A condição para liberar 
o desconto é idade maior que 35 anos e mais de dois filhos . Atendida a condição 
imprima na tela “Desconto liberado para Sr(a)” seguindo do nome do cliente.

INCLUSÃO DA CLASSE PESSOA PARA HERANÇA
INCLUSÃO DA ESTRUTURA DE REPETIÇÃO (WHILE E DO WHILE)
Agora o usuário pode escolher entre funcionário e cliente diversas vezes até que
digite 3 para sair

 */
package orientacaoobjeto2ma5;

import java.util.Scanner;

public class Orientacaoobjeto2ma5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int idade = 0, quantFilho = 0;
        double salario = 0;

        do {
            System.out.println("Digite: \n  1 - para inserir dados do Funcionário\n  "
                    + "2 - para inserir dados do Cliente \n  3 - para Sair");

            while (op < 1 || op > 3) {
                System.out.print("Opção: ");
                op = sc.nextInt();
            }

            if (op == 1 || op == 2) {
                if (op == 1) {
                    System.out.println("\nDigite os dados do Funcionário:");
                } else {
                    System.out.println("\nDigite os dados do Cliente:");
                }

                System.out.print("Digite a idade: ");
                idade = sc.nextInt();
                System.out.print("Digite a quantidade de filhos: ");
                quantFilho = sc.nextInt();
                System.out.print("Digite o valor do salário R$: ");
                salario = sc.nextDouble();
            }

            switch (op) {
                case 1:
                    System.out.print("Digite o tempo de Serviço: ");
                    int tempoServico = sc.nextInt();

                    Funcionario func = new Funcionario(idade, quantFilho, salario, tempoServico);
                    System.out.println("");
                    func.aumentarSalario(salario, idade);
                    func.promoverFuncionario(tempoServico, idade);
                    func.demitirFuncionario(quantFilho, idade, tempoServico);
                    System.out.println("");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    Cliente cliente = new Cliente(idade, quantFilho, salario, nome);
                    System.out.println("");
                    cliente.fidelizarCliente(salario, quantFilho);
                    cliente.liberarDesconto(idade, quantFilho);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Até breve!");
                    break;
            }
            if (op != 3) {
                op = 0;
            }
        } while (op != 3);
        sc.close();
    }
}
