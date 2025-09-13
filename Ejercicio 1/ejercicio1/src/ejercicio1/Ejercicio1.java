/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author user
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Nicolas", "Demiryi", "Programacion", 7.5);
                
                est1.mostrarInfo();
                est1.subirCalificacion(1.0);
                est1.bajarCalificacion(0.5);
                
                System.out.println("\nDespues de los cambios: ");
                est1.mostrarInfo();
    }
    
}
