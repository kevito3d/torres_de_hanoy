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
public class nodo {
    int dato;
    nodo sig;

    public nodo(int x,nodo s) {
        dato=x;
        sig=s;
    }

    public int getDato() {
        return dato;
    }

    public nodo getSig() {
        return sig;
    }
    
    
}
