/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package estruturadedados4;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da fila:");
        int tam = sc.nextInt();
        
        Fila fila = new Fila(tam);
        
        int inp, qntd = 0;
        do {
            System.out.println("Digite o %dº elemento a inserir na fila (ou 0 para sair):".formatted(qntd + 1));
            inp = sc.nextInt();
            if (inp != 0) {
                qntd++;
                fila.enfileirar(inp);
            }
        } while (inp != 0 && !fila.cheia());
        
        System.out.println("Itens:");
        for (int i = 0; i < qntd; i++) {            
            System.out.println(fila.desenfileirar());
        }
    }
}
