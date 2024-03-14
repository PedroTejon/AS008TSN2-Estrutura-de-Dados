package estruturadedados4;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da fila:");
        int tam = sc.nextInt();

        Fila fila = new Fila(tam);

        for (int i = 0; i < tam; i++) {
            System.out.println("Digite o %dº elemento a inserir na fila:".formatted(i + 1));
            int inp = sc.nextInt();
            fila.enfileirar(inp);
        }
        
        int resultados[] = calcular(fila, tam);
        System.out.println("Maior número: %d\nMenor número: %d\nMédia aritmética: %d".formatted(resultados[0], resultados[1], resultados[2]));
    }

    public static int[] calcular(Fila fila, int tam) {
        int somaT = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        for (int i = 0; i < tam; i++) {
            int item = Integer.parseInt(fila.desenfileirar());
            if (item > maior) {
                maior = item;
            }
            if (item < menor) {
                menor = item;
            }
            somaT += item;
        }
        
        int resultado[] = {maior, menor, somaT / tam};
        
        return resultado;
    }
}
