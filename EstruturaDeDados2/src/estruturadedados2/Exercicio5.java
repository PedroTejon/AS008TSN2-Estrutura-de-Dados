package estruturadedados2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Defina o tamanho N da matriz:");
        int tamanhoN = sc.nextInt();
        
        System.out.println("Defina o tamanho M da matriz:");
        int tamanhoM = sc.nextInt();
        
        int[][] matriz = new int[tamanhoM][tamanhoN];
        for (int y = 0; y < tamanhoM; y++) {
            for (int x = 0; x < tamanhoN; x++) {
                System.out.print("matriz[%d][%d] = ".formatted(y, x));
                matriz[y][x] = sc.nextInt();
            }
        }
        
        boolean diagonal = true;
        for (int y = 0; y < tamanhoM; y++) {
            for (int x = 0; x < tamanhoN; x++) {
                if (x != y && matriz[y][x] != 0)
                    diagonal = false;
            }
        }
        
        if (diagonal) {
            System.out.println("A matriz é diagonal");
        }
        else {
            System.out.println("A matriz não é diagonal");
        }
    }
}
