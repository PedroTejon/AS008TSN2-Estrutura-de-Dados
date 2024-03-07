package estruturadedados3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pilha n = new Pilha(8);
        Pilha p = new Pilha(8);
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o %dº número:".formatted(i + 1));
            int num = sc.nextInt();
            
            if (num > 0) {
                p.empilhar(num);
            } else if (num < 0) {
                n.empilhar(num);
            } else {
                p.desempilhar();
                n.desempilhar();
            }
        }
        
        System.out.println("Pilha P:");
        p.ExibePilha();
        
        System.out.println("Pilha N:");
        n.ExibePilha();
    }
}
