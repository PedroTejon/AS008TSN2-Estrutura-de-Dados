package estruturadedados2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do lado da matriz:");
        int tam = sc.nextInt();
        
        int[][] matriz = new int[tam][tam];
        for (int y = 0; y < tam; y++) {
            for (int x = 0; x < tam; x++) {
                System.out.print("matriz[%d][%d] = ".formatted(y, x));
                matriz[y][x] = sc.nextInt();
            }
        }
        
        System.out.println("A diagonal secundária da matriz é %s".formatted(diagonalSecundariaMatriz(matriz, tam).toString()));
    }
    
    public static ArrayList<Integer> diagonalSecundariaMatriz(int[][] matriz, int tam) {
        ArrayList<Integer> diagonal = new ArrayList<Integer>();
        for (int y = 0; y < tam; y++) {
            diagonal.add(matriz[y][tam - y - 1]);
        }
        
        return diagonal;
    }
}
