package estruturadedados3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da pilha:");
        int tam = sc.nextInt();
        
        Pilha pilha = new Pilha(tam);
        
        int inp, qntd = 0;
        do {
            System.out.println("Digite o %dº elemento a inserir na pilha (ou 0 para sair):".formatted(qntd + 1));
            inp = sc.nextInt();
            if (inp != 0) {
                qntd++;
                pilha.empilhar(inp);
            }
        } while (inp != 0 || pilha.cheia());
        
        for (int i = 0; i < qntd; i++) {
            System.out.println("Item %d: %d".formatted(qntd - i, pilha.desempilhar()));
        }
    }
}
