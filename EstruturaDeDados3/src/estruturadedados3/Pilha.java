package estruturadedados3;
import javax.swing.JOptionPane;

public class Pilha {
    //Declarando os atributos da classe
    int topo;
    int tamanho;
    Object vetor[];
    
    public Pilha(int tam){
        topo = -1; //Marca que a pilha estÃ¡ vazia
        tamanho = tam;
        vetor = new Object[tam];
    }
    public boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    public boolean cheia(){
        if(topo == tamanho -1)
            return true;
        else
            return false;
    }
    public void empilhar(Object elem){
        if (cheia() == false){
            topo++;
            vetor[topo]=elem;
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "PILHA CHEIA!");
        }
    }
    public Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia";
        }
        else{
            valorDesempilhado = vetor[topo]; 
            topo--;
        }
        return valorDesempilhado;
    }
    public void ExibePilha(){
        if(vazia() == true){
            JOptionPane.showMessageDialog(null, 
                    "PILHA VAZIA!");
        }
        else{
            for(int i=topo; i>=0; i--){
                System.out.println("Elemento " 
                        + vetor[i] + " - posição " + i);
            }
        }
    }
}