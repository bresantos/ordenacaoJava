import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
         // Passo 1: Insere os números [1, 2, 3, 4 e 5] em uma lista - com 5 células
         LinkedList<Integer> lista = new LinkedList<>();
         lista.add(1);
         lista.add(2);
         lista.add(3);
         lista.add(4);
         lista.add(5);
         
         // Passo 2: Remove todos os dados da lista e insere-os em uma Pilha - com 5 células
         Stack<Integer> pilha = new Stack<>();
         while (!lista.isEmpty()) {
             pilha.push(lista.removeFirst());
         }
         
         // Passo 3: Remove os dados da Pilha e insere-os em uma Fila - com 10 células
         Queue<Integer> fila = new LinkedList<>();
         while (!pilha.isEmpty()) {
             fila.add(pilha.pop());
         }
         
         // Passo 4: Insere os números [6, 7, 8, 9 e 10] na lista
         lista.add(6);
         lista.add(7);
         lista.add(8);
         lista.add(9);
         lista.add(10);
         
         // Passo 5: Repete os passos 2 e 3
         while (!lista.isEmpty()) {
             while (!lista.isEmpty()) {
                 pilha.push(lista.removeFirst());
             }
             while (!pilha.isEmpty()) {
                 fila.add(pilha.pop());
             }
         }
         
         // Passo 6: Exibe todos os números que foram inseridos na fila
         while (!fila.isEmpty()) {
             System.out.print(fila.poll() + " ");
         }
    }
}
