package estruturadedados3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantas placas voc� deseja armazenar:");
        int qntdPl = sc.nextInt();
        
        Pilha pilha = new Pilha(qntdPl);
        for (int i = 0; i < qntdPl; i++) {
            System.out.println("Digite a %d� placa:".formatted(i + 1));
            pilha.empilhar(sc.next());
        }
        
        System.out.println("Digite a placa do carro que voc� deseja verificar se est� estacionado:");
        String placa = sc.next();
        
        boolean contem = false;
        Object placas[] = new Object[qntdPl];
        int pos = -1;
        for (int i = 0; i < qntdPl; i++) {
            Object placaA = pilha.desempilhar();
            placas[i] = placaA;
            if (placaA.equals(placa)) {
                contem = true;
                pos = i;
            }
        }
        for (int i = 0; i < qntdPl; i++) {
            pilha.empilhar(placas[i]);
        }
        
        
        if (contem) {
            int qntdPRetirar = qntdPl - pos - 1;
            if (qntdPRetirar > 0) {
                System.out.println("Ser� necess�rio remover os seguintes carros:");
                for (int i = 0; i < qntdPRetirar; i++) {
                    System.out.println(pilha.desempilhar());                
                }
            } else {
                System.out.println("O carro est� no topo da pilha");
            }
        } else {
            System.out.println("N�o existe nenhum carro com esta placa estacionado.");
        }
    }
    
    
}
