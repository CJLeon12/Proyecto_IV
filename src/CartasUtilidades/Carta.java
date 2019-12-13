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
import javax.swing.ImageIcon;
public abstract class Carta {
    protected String Tipo;
    private String Color;
    private int Numero;
    protected ImageIcon Imagen;
    
    public Carta(String t, String c, int n){
        this.Tipo = t;
        this.Color = c;
        this.Numero = n;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public ImageIcon getImagen(){
        return Imagen;
    }
    
}
