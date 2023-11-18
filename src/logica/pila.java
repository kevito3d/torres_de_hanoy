/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author kcove
 */
public class pila {

    private nodo cima;
    private int tamanio;

    public pila() {
        cima = null;
        tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public boolean esvacia() {
        return cima == null;
    }
    public boolean valida(int x){
        return esvacia()|| x<cima.getDato();
    }
    public boolean apilar(int x) {
        if (!esvacia() && x >= cima.getDato()) {
            return false;
        }
        nodo q = new nodo(x, cima);
        cima = q;
        tamanio++;
        return true;
    }
    public String getPila(){
        if(!esvacia()){
            String x="----------\n";
            nodo q=cima;
            while(q!=null){
                x=x+q.getDato()+"\n";
                q=q.getSig();
            }
            x=x+"----------";
            return x;
        }
        return "pila vacia";
        
    }
    public int getCima(){
        try {
            return cima.getDato();
        } catch (Exception e) {
            return -1;
        }
    }
    public int desapilar(){
        if(!esvacia()){
            int x;
            x=cima.getDato();
            cima=cima.getSig();
            tamanio--;
            return x;
        }
        return -1111;
    }
}
