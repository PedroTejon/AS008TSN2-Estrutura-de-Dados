/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package estruturadedados3;
import estruturadedados3.Pilha;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ExemploPilhaED {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Empilhar um elemento\n" +
                    "2 - Remover um elemento\n" +
                    "3 - Exibir os valores da pilha\n" +
                    "4 - Sair\n" +
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
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido!");
                    break;
            }
        } while(op != 4);
    }
}
