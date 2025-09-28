/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

/**
 *
 * @author 0
 */
public class Camion extends Vehiculo {

    public Camion(String placa, String marca, String modelo, double capacidadCarga, double ancho, double alto, double largo) {
        super(placa, marca, modelo, capacidadCarga, ancho, alto, largo);
    }
    
    public Camion(String placa, String marca, String modelo) {
        super(placa, marca, modelo,
              5000, 
              250,  
              300,  
              600); 
    }
    
    
}
