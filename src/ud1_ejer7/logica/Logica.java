/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer7.logica;

import java.awt.Color;
import java.awt.Panel;
import ud1_ejer7.gui.VentanaPrincipal;

/**
 *
 * @author Jose Javier BO
 */
public class Logica {
    
    public static final int REJILLA=0;
    public static final int FONDO=1;
    public static final int LISTADO=2;

    int modo = REJILLA;
    
   VentanaPrincipal ventana;
  
    public void setColor(int elemento, Color color){
        switch (elemento) {
            case REJILLA:
                ventana.setColorRejilla(color);
                break;
            case FONDO:
                ventana.setColorFondo(color);
                break;
            case LISTADO:
                ventana.setColorListado(color);
                break;
            default:
        }
    }

    public void restablecer(){
        this.setColor(REJILLA, Color.BLACK);
        this.setColor(FONDO, new Color(242,242,242));
        this.setColor(LISTADO, new Color(242,242,242));
    }
    
    public void setVentana(VentanaPrincipal ventana) {
        this.ventana=ventana;
    } 

    public void setColor(Color BLUE) {
        this.setColor(this.modo, BLUE);
    }

    public void setModo(int modo) {
        this.modo=modo;
    }

    public static void main(String[] args) {
        
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        Logica logica = new Logica();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()-> {
                VentanaPrincipal vp=new VentanaPrincipal(logica);
                vp.setLocationRelativeTo(null);
                  vp.setVisible(true);
        });
        new Logica();
    }      

}
