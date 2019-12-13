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
import java.util.*;
public class CartasProceso {
    Random Aleatorio;
    private ArrayList<Carta> Mazo;
    
    public CartasProceso(){
        this.Mazo = new ArrayList<>();
        Aleatorio = new Random();
        
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j < 2 ; j++){
                if (i!= 0){
                    Mazo.add(CrearCarta("CartaNormal", "Amarillo", i));
                    Mazo.add(CrearCarta("CartaNormal", "Azul", i));
                    Mazo.add(CrearCarta("CartaNormal", "Rojo", i));
                    Mazo.add(CrearCarta("CartaNormal", "Verde", i));
                }
                else if (j == 0){
                    Mazo.add(CrearCarta("CartaNormal", "Amarillo", 0));
                    Mazo.add(CrearCarta("CartaNormal", "Azul", 0));
                    Mazo.add(CrearCarta("CartaNormal", "Rojo", 0));
                    Mazo.add(CrearCarta("CartaNormal", "Verde", 0));
                    for (int k = 0; k < 4; k++){
                        Mazo.add(CrearCarta("Comodin", "Negro", 0));
                        Mazo.add(CrearCarta("ComodinMas4", "Negro", 0));
                        if (k < 2){
                            Mazo.add(CrearCarta("PierdeTurno", "Amarillo", 0));
                            Mazo.add(CrearCarta("PierdeTurno", "Azul", 0));
                            Mazo.add(CrearCarta("PierdeTurno", "Rojo", 0));
                            Mazo.add(CrearCarta("PierdeTurno", "Verde", 0));
                            Mazo.add(CrearCarta("Reversa", "Amarillo", 0));
                            Mazo.add(CrearCarta("Reversa", "Azul", 0));
                            Mazo.add(CrearCarta("Reversa", "Rojo", 0));
                            Mazo.add(CrearCarta("Reversa", "Verde", 0));
                            Mazo.add(CrearCarta("Mas2", "Amarillo", 0));
                            Mazo.add(CrearCarta("Mas2", "Azul", 0));
                            Mazo.add(CrearCarta("Mas2", "Rojo", 0));
                            Mazo.add(CrearCarta("Mas2", "Verde", 0));
                        }
                    }
                }
            }   
        }
        Collections.shuffle(Mazo);
    }
    
    private Carta CrearCarta(String tipo, String Color, int Numero){
        switch(tipo) {
            case "CartaNormal":
                return new CartaNormal("CartaNormal", Color, Numero);
            case "cartaSalto":
                return new PierdeTurno(Color);
            case "cartaReversa":
                return new Reversa(Color);
            case "cartaCome2":
                return new Mas2(Color);
            case "cartaComodin":
                return new Comodin();
            case "cartaComodinCome4":
                return new ComodinMas4();
            default:
                System.out.println("No encontró tipo de carta para crear");
                return null;
        }
    }

    /**
     * @return the Mazo
     */
    public ArrayList<Carta> getMazo() {
        return Mazo;
    }
    
    public Carta SacarCarta(){
        return Mazo.remove(Mazo.size()-1);
    }

    /**
     * @param Mazo the Mazo to set
     */
    public void setMazo(ArrayList<Carta> Mazo) {
        this.Mazo = Mazo;
    }

}
