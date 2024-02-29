package estruturadedados2;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Defina o tamanho da primeira array:");
        int tamanhoN = sc.nextInt();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        
        System.out.println("Defina o tamanho da segunda array:");
        int tamanhoM = sc.nextInt();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        
        ArrayList<Integer> arrayUniao = new ArrayList<Integer>();
        System.out.println("Insira os valores da primeira array:");
        for (int i = 0; i < tamanhoN; i++) {
            int num = sc.nextInt();
            array1.add(num);
            if (!arrayUniao.contains(num))
                arrayUniao.add(num);
        }
        
        System.out.println("Insira os valores da segunda array:");
        for (int i = 0; i < tamanhoM; i++) {
            int num = sc.nextInt();
            array2.add(num);
            if (!arrayUniao.contains(num))
                arrayUniao.add(num);
        }
        
        System.out.println("Os valores da união entre %s e %s é %s".formatted(array1.toString(), array2.toString(), arrayUniao.toString()));
    }
}
