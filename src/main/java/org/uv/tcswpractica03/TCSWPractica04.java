/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tcswpractica03;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author meli
 */
public class TCSWPractica03 {

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            try {
           
                HibernateUtils.getSessionFactory();
                
                Vista vista = new Vista();
                vista.setVisible(true);
                
            } catch (Exception e) {
                Logger.getLogger(TCSWPractica04.class.getName()).log(Level.INFO, "Error al iniciar la aplicacion", e);
                
            }
        });
    }
}
