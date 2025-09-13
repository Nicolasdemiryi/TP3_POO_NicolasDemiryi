/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author user
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);
        
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        
        System.out.println("Estado de las gallinas: ");
        g1.mostrarEstado();
        System.out.println();
        g2.mostrarEstado();
        
    }
    
}
