/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CartasUtilidades;

/**
 *
 * @author carlo
 */
public class Mas2 extends Carta{
        public Mas2(String Color){
        super("Mas2", Color, 0);
        switch (Color){
            case "Amarillo":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo+2.png"));
                break;
            case "Azul":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul+2.png"));
                break;
            case "Rojo":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo+2.png"));
                break;
            case "Verde":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde+2.png"));
                break;
            default:
                this.Imagen = null;
                break;
        }
    }
}
