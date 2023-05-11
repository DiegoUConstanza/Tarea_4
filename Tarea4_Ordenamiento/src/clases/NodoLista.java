package clases;

public class NodoLista {
    
    public int Number;
    public NodoLista sig;

    public NodoLista(int Number) {
        this.Number = Number;
        this.sig = null;
    }
    
    public NodoLista(int Number, NodoLista sig) {
        this.Number = Number;
        this.sig = sig;
    }
    
}
