/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author kevin
 */
public class TorresDeHanoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        framejuego a = new framejuego();
        a.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        a.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Se pide una confirmación antes de finalizar el programa
                int option = JOptionPane.showConfirmDialog(
                        a,
                        "¿Estás seguro de que quieres cerrar la aplicación?",
                        "Confirmación de cierre",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

}
