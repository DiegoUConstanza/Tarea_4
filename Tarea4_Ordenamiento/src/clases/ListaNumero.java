package clases;

import java.util.*;
import tarea4_ordenamiento.Menu;

public class ListaNumero {
   
    private NodoLista inicio, fin;
    private int numaux;
    public String lista_mostrar;
    List<Integer> numeros_vector = new ArrayList<>();

    public ListaNumero() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean estavacio(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void agregar(int Number){
        if(!estavacio()){
            fin.sig = new NodoLista (Number);
            fin = fin.sig;
        }else{
            inicio = fin = new NodoLista (Number);
        }
        
        NodoLista aux = inicio;
        
        try {
            numeros_vector.add(Number);
        }catch (NumberFormatException e) {
            System.out.println("Hubo un error");
        }
    }
    
    public void Mostrar(){
        NodoLista aux = inicio;
        while (aux != null){
            System.out.print("[" + aux.Number +"]");
            aux=aux.sig;
        }
    }
    
    public void Ordenar(){
        Collections.sort(numeros_vector);
        numeros_vector.forEach(numero -> System.out.print("["+numero +"]"));
        lista_mostrar = numeros_vector.toString();
    }
    
    public void Reseterar(){
        numeros_vector.clear();
    }
}
