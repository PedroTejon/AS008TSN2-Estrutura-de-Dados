package estruturadedados2;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do array:");
        int tam = sc.nextInt();
        
        System.out.println("Digite o valor do número K:");
        int k = sc.nextInt();
        
        ArrayList<Integer> arrayOG = new ArrayList<Integer>();
        
        System.out.println("Digite os valores da array:");
        for (int i = 0; i < tam; i++) {
            int num = sc.nextInt();
            arrayOG.add(num);
        }
        
        System.out.println("A array %s com seus valores aparecendo K vezes é %s".formatted(arrayOG.toString(), arrayKVzs(arrayOG, k).toString()));
    }
    
    public static ArrayList<Integer> arrayKVzs(ArrayList<Integer> arrayOG, int k) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < arrayOG.size(); i++) {
            for (int j = 0; j < k; j++) {
                array.add(arrayOG.get(i));
            }
        }
        
        return array;
    }
}
