/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author user
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota gato = new Mascota(" Betuna"," Gato", 2 );
        
        gato.mostrarInfo();
        gato.cumplirAnios();
        
        
        System.out.println("\nDespues de cumplir anios: ");
        gato.mostrarInfo();
    }
    
}
