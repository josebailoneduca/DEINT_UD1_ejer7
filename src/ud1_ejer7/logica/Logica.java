/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer7.logica;

import java.awt.Color;
import ud1_ejer7.gui.VentanaPrincipal;

/**
 * Lógica de negocio del ejercicio 7
 * 
 * Recibe ordenes de qué elemento es el que se modificará almacenandolo en el atributo "elemento".
 * Cuando recibe una orden de "setColor" pone el elemento almacenado del color recibido.
 * 
 * @author Jose Javier BO
 */
public class Logica {
    
    //ATRIBUTOS
    
    //Identificadores de los elementos
    public static final int REJILLA=0;
    public static final int FONDO=1;
    public static final int LISTADO=2;

    //almacena el elemento a ser modificado
    int elemento = REJILLA;
    
   VentanaPrincipal ventana;
  

   /**
    * Define el elemento para el proximo cambio de color
    * @param elemento  Elemento a seleccionar
    */
    public void setElemento(int elemento) {
        this.elemento=elemento;
    }
    
    /**
     * Pone los colores de los elementos con los colores por defecto
     */
    public void restablecer(){
        this.setColor(REJILLA, Color.BLACK);
        this.setColor(FONDO, new Color(242,242,242));
        this.setColor(LISTADO, new Color(242,242,242));
    }
    
    /**
     * Guarda una referencia a la ventana principal.
     * @param ventana La ventana
     */
    public void setVentana(VentanaPrincipal ventana) {
        this.ventana=ventana;
    } 

    
    /**
     * Cambia el color del elemento seleccionado actualmente al color suministrado
     * @param color El color que debe usarse
     */
    public void setColor(Color color) {
        this.setColor(this.elemento, color);
    }



    
       /**
    * Pone un elemento del color definido
    * @param elemento Elemento a modificar
    * @param color   Color a usar
    */
    private void setColor(int elemento, Color color){
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
