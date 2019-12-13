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
public class PierdeTurno extends Carta{
        public PierdeTurno(String Color){
        super("PierdeTurno", Color, 0);
        switch (Color){
            case "Amarillo":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AmarilloPierde.png"));
                break;
            case "Azul":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AzulPierde.png"));
                break;
            case "Rojo":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RojoPierde.png"));
                break;
            case "Verde":
                this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VerdePierde.png"));
                break;
            default:
                this.Imagen = null;
                break;
        }
    }
}
