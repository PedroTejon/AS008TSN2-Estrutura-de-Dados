package estruturadedados2;
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Defina o tamanho N:");
        int tamanhoN = sc.nextInt();
        
        System.out.println("Defina o tamanho M:");
        int tamanhoM = sc.nextInt();
        
        int[][] matriz = new int[tamanhoM][tamanhoN];
        for (int y = 0; y < tamanhoM; y++) {
            for (int x = 0; x < tamanhoN; x++) {
                System.out.print("matriz[%d][%d] = ".formatted(y, x));
                matriz[y][x] = sc.nextInt();
            }
        }
       
        int[] maiorNumPos = acharMaiorPos(matriz, tamanhoN, tamanhoM);
        System.out.println("O maior número está na posição [%d][%d]".formatted(maiorNumPos[1], maiorNumPos[0]));
    }
    
    public static int[] acharMaiorPos(int[][] matriz, int tamanhoN, int tamanhoM) {
        int[] pos = {0, 0};
        int maiorNum = -999;
        for (int y = 0; y < tamanhoM; y++) {
            for (int x = 0; x < tamanhoN; x++) {
                if (matriz[y][x] > maiorNum) {
                    maiorNum = matriz[y][x];
                    pos[0] = x;
                    pos[1] = y;
                }
            }
        }
        
        return pos;
    } 
}
