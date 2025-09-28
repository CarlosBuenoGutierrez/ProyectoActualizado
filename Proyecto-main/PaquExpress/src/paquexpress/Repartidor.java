/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0
 */
public class Repartidor {
    
   private String cedula;
   private String telefono;
   private String nombre;
   private Vehiculo vehiculo;
   private Zona zona;
   private List<Envio> enviosAsignados;
   private List<Envio> enviosHistorial;

    public Repartidor(String cedula, String telefono, String nombre, Vehiculo vehiculo, Zona zona) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.zona = zona;
        this.enviosAsignados = new ArrayList<>();
        this.enviosHistorial = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Zona getZona() {
        return zona;
    }

    public List<Envio> getEnviosAsignados() {
        return enviosAsignados;
    }
    
    public List<Envio> getEnviosHistorial() {
        return enviosHistorial;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    public int cantidadEnviosHistorico(){
        return enviosHistorial.size();    
    }
   
    public int cantidadEnviosAsignados(){
        return enviosAsignados.size();    
    }
    
    public void asignarVehiculo(Vehiculo v){
        this.vehiculo = v; 
    }
   
    public void asignarEnvio(Envio e){
        this.enviosAsignados.add(e);
        this.enviosHistorial.add(e);
    }
    
    public void envioEntregado(Paquete p){
        
        for(Envio e :enviosAsignados){
            
            if(e.getPaquetes().remove(p)){
                if(e.getPaquetes().isEmpty()){
                    
                    e.setEstado("ENTREGADO");
                    e.setFechaEntrega(new java.util.Date());
                    enviosAsignados.remove(e);  
                }
                return;
            }
        }
    }
 
    public void envioFallido(Envio e) {
        if (enviosAsignados.remove(e)) {
            e.setEstado("NO ENTREGADO");
            e.setFechaEntrega(new java.util.Date());
        }
    }
    
    
    
}
