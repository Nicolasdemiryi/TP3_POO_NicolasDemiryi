/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author user
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        
        System.out.println("Libro inicial: " + libro1.getTitulo() + " - " + libro1.getAutor() + " (" + libro1.getAnioPublicacion() + ")");
        
        libro1.setAnioPublicacion(1300);
        libro1.setAnioPublicacion(2005);
        
        System.out.println("Libro final: " + libro1.getTitulo() + " - " + libro1.getAutor() + " (" + libro1.getAnioPublicacion()+ ") ");
    }
    
}
