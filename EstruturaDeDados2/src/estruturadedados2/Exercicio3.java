package estruturadedados2;
import java.util.Scanner;

public class Exercicio3 {
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
        
        System.out.println("A soma da diagonal principal da matriz é " + somaDiagonalMatriz(matriz, tam));
    }
    
    public static int somaDiagonalMatriz(int[][] matriz, int tam) {
        int somaDiagonal = 0;
        for (int d = 0; d < tam; d++) {
            somaDiagonal += matriz[d][d];
        }
        
        return somaDiagonal;
    }
}
