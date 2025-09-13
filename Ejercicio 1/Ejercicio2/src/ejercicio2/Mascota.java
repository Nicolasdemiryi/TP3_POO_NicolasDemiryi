/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author user
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Mascota " + nombre);
        System.out.println("Especie " + especie);
        System.out.println("Edad " + edad + " anios");
    }
    
    public void cumplirAnios(){
        this.edad++;
    }
}
