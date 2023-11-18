/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import javax.swing.JLabel;
import ui.paneldeljuego;

/**
 *
 * @author kcove
 */
public class control {
    JLabel aux;
    int desseleccion=0;
    int seleccion = 0;
    pila p1;
    pila p2;
    pila p3;
    int tamanio;

    public control(int x) {
        p1 = new pila();
        p2 = new pila();
        p3 = new pila();
        for (int i = x - 1; i >= 0; i--) {
            p1.apilar(i);
        }
        aux=new JLabel ();
    }

    public pila getP1() {
        return p1;
    }

    public pila getP2() {
        return p2;
    }

    public pila getP3() {
        return p3;
    }

    public void setP3(pila p3) {
        this.p3 = p3;
    }

    public void coneccion(int a) {
        if (seleccion == 0) {
            switch (a) {
                case 1:
                    if (getP1().getTamanio() > 0) {
                        int getposCima=(getP1().getTamanio()-7)*-1;
                        paneldeljuego.left0[getposCima].getComponent(0).setBackground(Color.red);
                        seleccion = 1;
                        desseleccion=1;
                        
                    }
                    break;
                case 2:
                    if (getP2().getTamanio() > 0) {
                        int getposCima=(getP2().getTamanio()-7)*-1;
                        paneldeljuego.center0[getposCima].getComponent(0).setBackground(Color.red);
                        seleccion = 2;
                        desseleccion=2;
                    }
                    break;
                default:
                    if (getP3().getTamanio() > 0) {
                        int getposCima=(getP3().getTamanio()-7)*-1;
                        paneldeljuego.right0[getposCima].getComponent(0).setBackground(Color.red);
                        seleccion = 3;
                        desseleccion=3;
                    }
                    break;
            }
        } else {
            
            if(desseleccion==1){
                int getposCima=(getP1().getTamanio()-7)*-1;
                paneldeljuego.left0[getposCima].getComponent(0).setBackground(Color.green);
                desseleccion=0;
            }
                
            else if(desseleccion==2){
                int getposCima=(getP2().getTamanio()-7)*-1;
                paneldeljuego.center0[getposCima].getComponent(0).setBackground(Color.green);
                desseleccion=0;
            }
                
            else if(desseleccion==3){
                int getposCima=(getP3().getTamanio()-7)*-1;
                paneldeljuego.right0[getposCima].getComponent(0).setBackground(Color.green);
                desseleccion=0;
            }  
            if(a!=seleccion){
                mover(a);
            }
            seleccion=0;
        }
    }

    public void mover(int a) {
        switch(a){
            case 1:
                if(seleccion==2){
                    if(getP1().valida(getP2().getCima())){
                        int getposCima=(getP2().getTamanio()-7)*-1;
                    aux=(JLabel)paneldeljuego.center0[getposCima].getComponent(0);
                    paneldeljuego.center0[getposCima].remove(aux);
                    paneldeljuego.center0[getposCima].repaint();
                    p1.apilar(p2.desapilar());
                    int n=(getP1().getTamanio()-7)*-1;
                    paneldeljuego.left0[n].add(aux);
                    }
                    
                }else {
                    if(getP1().valida(getP3().getCima())){
                        int getposCima=(getP3().getTamanio()-7)*-1;
                    aux=(JLabel)paneldeljuego.right0[getposCima].getComponent(0);
                    paneldeljuego.right0[getposCima].remove(aux);
                    paneldeljuego.right0[getposCima].repaint();
                    p1.apilar(p3.desapilar());
                    int n=(getP1().getTamanio()-7)*-1;
                    paneldeljuego.left0[n].add(aux);
                    }
                    
                }
                break;
            case 2:
                if(seleccion==1){
                    if(getP2().valida(getP1().getCima())){
                        int getposCima=(getP1().getTamanio()-7)*-1;
                        aux=(JLabel)paneldeljuego.left0[getposCima].getComponent(0);
                                    paneldeljuego.left0[getposCima].remove(aux);
                                    paneldeljuego.left0[getposCima].repaint();
                        p2.apilar(p1.desapilar());
                        int n=(getP2().getTamanio()-7)*-1;
                    paneldeljuego.center0[n].add(aux);
                    }
                    
                    
                    
                }else {
                    if(getP2().valida(getP3().getCima())){
                        int getposCima=(getP3().getTamanio()-7)*-1;
                        aux=(JLabel)paneldeljuego.right0[getposCima].getComponent(0);
                    paneldeljuego.right0[getposCima].remove(aux);
                    paneldeljuego.right0[getposCima].repaint();
                    p2.apilar(p3.desapilar());
                    int n=(getP2().getTamanio()-7)*-1;
                    paneldeljuego.center0[n].add(aux);
                    }
                    
                }
                break;
            default:
                if(seleccion==1){
                    if(getP3().valida(getP1().getCima())){
                        int getposCima=(getP1().getTamanio()-7)*-1;
                        aux=(JLabel)paneldeljuego.left0[getposCima].getComponent(0);
                                    paneldeljuego.left0[getposCima].remove(aux);
                                    paneldeljuego.left0[getposCima].repaint();
                        p3.apilar(p1.desapilar());
                        int n=(getP3().getTamanio()-7)*-1;
                    paneldeljuego.right0[n].add(aux);
                    }                    
                }else{
                    if(getP3().valida(getP2().getCima())){
                        int getposCima=(getP2().getTamanio()-7)*-1;
                        aux=(JLabel)paneldeljuego.center0[getposCima].getComponent(0);
                                    paneldeljuego.center0[getposCima].remove(aux);
                                    paneldeljuego.center0[getposCima].repaint();
                        p3.apilar(p2.desapilar());
                        int n=(getP3().getTamanio()-7)*-1;
                    paneldeljuego.right0[n].add(aux);
                    }                    
                }
                
                break;
        }
    }
}
