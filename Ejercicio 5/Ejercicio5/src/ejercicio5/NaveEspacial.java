/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author user
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 100;
    
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado!");
            
         } else {
            System.out.println("Combustible insuficiente para despegar");
        } 
    }
    
    public void avanzar(int distancia){
        int consumo = distancia / 10;
        if (combustible >= consumo) {
            combustible -=consumo;
            System.out.println(nombre + " avanzo " + distancia + " km ");
            
        } else {
            System.out.println("No hay suficiente combustible para avanzar");
        }
    }
    public void recargarCombustible(int cantidad){
        if (combustible + cantidad <= CAPACIDAD_MAXIMA) {
            combustible +=cantidad;
            System.out.println("Se recargaron "+ cantidad + " litros de combustible");
            
        } else {
            System.out.println("No se puede superar la capacidad maxima de " + CAPACIDAD_MAXIMA);
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}
    