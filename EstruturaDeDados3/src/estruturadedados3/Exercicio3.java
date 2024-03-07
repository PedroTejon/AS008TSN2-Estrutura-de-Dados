package estruturadedados3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Empilhar um elemento\n" +
                    "2 - Remover um elemento\n" +
                    "3 - Exibir os valores da pilha\n" +
                    "4 - Exibir quantidade de elementos na pilha\n" +
                    "5 - Sair\n" +
                    "Digite a opção desejada:"));

            switch (op) {
                case 1:
                    int valorAEmpilhar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser empilhado:"));
                    p.empilhar(valorAEmpilhar);
                    break;
                case 2:
                    Object valorDesempilhado = p.desempilhar();
                    JOptionPane.showMessageDialog(null, "Valor desempilhado: " + valorDesempilhado.toString());
                    break;
                case 3:
                    p.ExibePilha();
                    break;
                case 4:
                    Object elementos[] = new Object[5];
                    int qntd = 0;
                    while (!p.vazia()) {
                        Object elemento = p.desempilhar();
                        elementos[qntd] = elemento;
                        qntd++;
                    }
                    for (int i = 0; i < qntd; i++) {
                        p.empilhar(elementos[i]);
                    }
                    JOptionPane.showMessageDialog(null, "A pilha contém %d elemento(s)".formatted(qntd));
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido!");
                    break;
            }
        } while(op != 5);
    }
}
