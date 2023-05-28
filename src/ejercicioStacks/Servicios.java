package ejercicioStacks;

import java.util.Stack;

public class Servicios {
    
    public void ordenarStacks(Stack<Integer> pila){
        
        Stack<Integer> pilaaux=new Stack<>();

        while(!pila.isEmpty()){
            
            int aux=pila.pop();
            
            while(!pilaaux.isEmpty() && aux>pilaaux.peek()){
                pila.push(pilaaux.pop());
            }

            pilaaux.push(aux);
        }
    }

}
