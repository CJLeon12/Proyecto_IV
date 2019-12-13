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
import java.util.ArrayList;
public class Jugador {
    private ArrayList<Carta> Mano;
    
    public Jugador (){

    }
    
    public void AñadirCarta(Carta CartaJuego){
        this.getMano().add(CartaJuego);
    }
    
    public Carta DevolverCarta(int Numero){
        return this.getMano().get(Numero);
    }
    
    public void EliminarCarta(int Numero){
        this.getMano().remove(Numero);
    }
    
    public int RetornarNumero(){
        return this.getMano().size();
    }

    /**
     * @return the Mano
     */
    public ArrayList<Carta> getMano() {
        return Mano;
    }

    /**
     * @param Mano the Mano to set
     */
    public void setMano(ArrayList<Carta> Mano) {
        this.Mano = Mano;
    }
}
