/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.GridLayout;
// import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
// import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kevin
 */
public class fichas extends JPanel {

    private boolean bandera = false;
    private JPanel pControlador;
    private JButton a;
    private JButton s;
    private JButton d;

    public fichas() {
        setLayout(new BorderLayout());
        setOpaque(false);
        controlador();
        add(pControlador,BorderLayout.CENTER);
    }

    public JButton getA() {
        return a;
    }

    public JButton getS() {
        return s;
    }

    public JButton getD() {
        return d;
    }

    public class manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == a) {
                if (!bandera) {
                    bandera=true;
                } else {
                    bandera=false;
                }
            } else if (e.getSource() == s) {
                if (!bandera) {

                } else {

                }
            } else if (!bandera) {

            } else {

            }
        }

    }

    public void controlador() {
        pControlador = new JPanel();
        pControlador.setLayout(new GridLayout(1, 3));
        pControlador.setOpaque(false);
        
        a = new JButton("");
        a.setFocusable(false);
        //a.setSize(getWidth()/3 , getHeight());
        a.setContentAreaFilled(false);
        //a.setBorder(null);
        pControlador.add(a);
        s = new JButton("  ");
        s.setFocusable(false);
        //s.setSize(getWidth() / 3, getHeight());
        s.setContentAreaFilled(false);
        //s.setBorder(null);
        pControlador.add(s);
        d = new JButton("   ");
        d.setFocusable(false);
        //d.setSize(getWidth() / 3, getHeight());
        d.setContentAreaFilled(false);
        //d.setBorder(null);
        pControlador.add(d);
        
    }

}
