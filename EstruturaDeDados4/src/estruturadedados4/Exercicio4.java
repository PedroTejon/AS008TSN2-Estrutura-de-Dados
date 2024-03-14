package estruturadedados4;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        
        
        Fila fila = new Fila(100);
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Incluir novos processos na fila\n" +
                    "2 - Retirar da fila processo com maior espera\n" +
                    "3 - Imprimir conteúdo da fila\n" +
                    "4 - Sair\n" +
                    "Digite a opção desejada:"));

            switch (op) {
                case 1:
                    int processoAEnfileirar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o processo a ser enfileirado:"));
                    fila.enfileirar(processoAEnfileirar);
                    break;
                case 2:
                    Object processoDesenfileirado = fila.desenfileirar();
                    JOptionPane.showMessageDialog(null, "Proceso desenfileirado: " + processoDesenfileirado.toString());
                    break;
                case 3:
                    fila.exibeFila();
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
