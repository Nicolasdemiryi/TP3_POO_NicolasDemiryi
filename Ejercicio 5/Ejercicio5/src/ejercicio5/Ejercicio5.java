/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author user
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apolo", 50);
        
        nave.mostrarEstado();
        nave.avanzar(100);
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(50);
        System.out.println("\nEstado final: ");
        nave.mostrarEstado();
    }
    
}
