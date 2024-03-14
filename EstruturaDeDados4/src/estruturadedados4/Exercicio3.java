package estruturadedados4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da Fila 1:");
        int tamF1 = sc.nextInt();
        
        Fila fila1 = new Fila(tamF1);
        
        int inp, qntdF1 = 0;
        do {
            System.out.println("Digite o %dº elemento a inserir na Fila 1 (ou 0 para sair):".formatted(qntdF1 + 1));
            inp = sc.nextInt();
            if (inp != 0) {
                qntdF1++;
                fila1.enfileirar(inp);
            }
        } while (inp != 0 && !fila1.cheia());
        
        System.out.println("Digite o tamanho da Fila 2:");
        int tamF2 = sc.nextInt();
        
        Fila fila2 = new Fila(tamF2);
        
        int qntdF2 = 0;
        do {
            System.out.println("Digite o %dº elemento a inserir na Fila 2 (ou 0 para sair):".formatted(qntdF2 + 1));
            inp = sc.nextInt();
            if (inp != 0) {
                qntdF2++;
                fila2.enfileirar(inp);
            }
        } while (inp != 0 && !fila2.cheia());
        
        if (qntdF1 > qntdF2) {
            System.out.println("A Fila 1 possui mais elementos que a Fila 2");
        } else {
            System.out.println("A Fila 1 não possui mais elementos que a Fila 2");
        }
    }
}
