/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author user
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina){
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer() {
        edad++;
    }   
    
    public void mostrarEstado(){
        System.out.println("Gallina ID: " +idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
}
