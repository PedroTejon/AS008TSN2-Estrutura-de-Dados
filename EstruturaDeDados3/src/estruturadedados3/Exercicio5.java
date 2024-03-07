package estruturadedados3;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String urlAtual = "www.google.com";
        Pilha p = new Pilha(10);
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "URL Atual: %s\n".formatted(urlAtual) +
                    "1 - Acessar URL\n" +
                    "2 - URLs previamente acessadas\n" +
                    "3 - Sair\n" +
                    "Digite a opção desejada:"));

            switch (op) {
                case 1:
                    p.empilhar(urlAtual);
                    urlAtual = JOptionPane.showInputDialog(null, "Digite a URL para visitar:");
                    
                    break;
                case 2:
                    int qntd = 0;
                    Object urls[] = new String[10];
                    
                    String saida = "Histórico:\n";
                    while (!p.vazia()) {
                        Object url = p.desempilhar();
                        saida += url + "\n";
                        urls[qntd] = url;
                        qntd++;
                    }
                    for (int i = qntd - 1; i >= 0; i--) 
                        p.empilhar(urls[i]);
                    
                    saida += "%d site(s).".formatted(qntd);
                    
                    JOptionPane.showMessageDialog(null, saida);
                    
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido!");
                    break;
            }
        } while(op != 3);
    }
}
