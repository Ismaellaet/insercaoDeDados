package atividade_tres;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Programa {
    public static ArrayList<Integer> list = new ArrayList<>(5);
    public static Stack<Integer> stack = new Stack<>();
    public static Queue<Integer> queue = new LinkedList<>();

    public static void print() {
        System.out.printf("List: %s;\nStack: %s;\nQueue: %s;\n\n", list, stack, queue);
    }
    
    public static void addToList(int max) {
        int size = 5;
        for(int i = max - size + 1; i <= max; i++) {
            list.add(i);
        }
    }

    public static void emptyListAndAddToStack() {
        while(!list.isEmpty()) {
            int number = list.remove(0);
            stack.push(number);
        }
    }   

    public static void emptyStackAndAddToQueue() {
        while(!stack.isEmpty()) {
            int number = stack.pop();
            queue.add(number);
        }      
    }
    
   public static void main(String[] args) {   
        
        addToList(5);
        
        print();
        
        emptyListAndAddToStack();

        print();
        
        emptyStackAndAddToQueue();

        print();
        
        addToList(10);

        print();
       
        emptyListAndAddToStack();

        print();
        
        emptyStackAndAddToQueue();  

        System.out.printf("Queue: %s", queue);

        /* Os números exibidos na fila (queue) estão desordenados por causa da retirada dos números na pilha (stack). Na pilha, a inserção e a remoção de elementos ocorrem a partir do mesmo ponto: o topo da pilha */
        
   }
}