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
public class CartaNormal extends Carta{
    public CartaNormal(String Tipo,String Color,int Numero){
        super(Tipo, Color, Numero);
        switch(Color){
            case "Amarillo":
                switch(Numero){
                    case 0:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo0.png"));
                        break;
                    case 1:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo1.png"));
                        break;
                    case 2:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo2.png"));
                        break;
                    case 3:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo3.png"));
                        break;
                    case 4:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo4.png"));
                        break;
                    case 5:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo5.png"));
                        break;
                    case 6:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo6.png"));
                        break;
                    case 7:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo7.png"));
                        break;
                    case 8:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo8.png"));
                        break;
                    case 9:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo9.png"));
                        break;
                }
                break;
            case "Azul":
                switch(Numero){
                    case 0:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul0.png"));
                        break;
                    case 1:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul1.png"));
                        break;
                    case 2:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul2.png"));
                        break;
                    case 3:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul3.png"));
                        break;
                    case 4:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul4.png"));
                        break;
                    case 5:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul5.png"));
                        break;
                    case 6:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul6.png"));
                        break;
                    case 7:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul7.png"));
                        break;
                    case 8:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul8.png"));
                        break;
                    case 9:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul9.png"));
                        break;
                }
                break;
            case "Rojo":
                switch(Numero){
                    case 0:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo0.png"));
                        break;
                    case 1:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo1.png"));
                        break;
                    case 2:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo2.png"));
                        break;
                    case 3:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo3.png"));
                        break;
                    case 4:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo4.png"));
                        break;
                    case 5:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo5.png"));
                        break;
                    case 6:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo6.png"));
                        break;
                    case 7:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo7.png"));
                        break;
                    case 8:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo8.png"));
                        break;
                    case 9:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rojo9.png"));
                        break;
                }
                break;
            case "Verde":
                switch(Numero){
                    case 0:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde0.png"));
                        break;
                    case 1:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde1.png"));
                        break;
                    case 2:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde2.png"));
                        break;
                    case 3:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde3.png"));
                        break;
                    case 4:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde4.png"));
                        break;
                    case 5:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde5.png"));
                        break;
                    case 6:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde6.png"));
                        break;
                    case 7:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde7.png"));
                        break;
                    case 8:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde8.png"));
                        break;
                    case 9:
                        this.Imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verde9.png"));
                        break;
                }
                break;    
        }   
        
    }
    
}
