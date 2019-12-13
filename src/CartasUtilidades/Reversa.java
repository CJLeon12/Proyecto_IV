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

public class Reversa extends Carta{
    public Reversa(String Color){
        super("Reversa", Color, 0);
        switch (Color){
            case "Amarillo":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AmarilloReversa.png"));
                break;
            case "Azul":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AzulReversa.png"));
                break;
            case "Rojo":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RojoReversa.png"));
                break;
            case "Verde":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VerdeReversa.png"));
                break;
            default:
                this.Imagen = null;
                break;
        }
    }
}
