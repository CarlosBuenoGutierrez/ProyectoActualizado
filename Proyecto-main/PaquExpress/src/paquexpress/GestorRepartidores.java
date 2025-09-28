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
public class GestorRepartidores {
    
    private List<Repartidor> repartidores;

    public GestorRepartidores() {
        this.repartidores = new ArrayList<>();
    }
    
    public void agregarRepartidor(Repartidor r){
        this.repartidores.add(r);
    }
    
    public void eliminarRepartidor(String c){
        repartidores.removeIf(r -> r.getCedula().equals(c));
    }
    
    public Repartidor buscarRepartidor(String c){     
        return repartidores.stream().filter(r -> r.getCedula().equals(c)).findFirst().orElse(null);  
    }
    
    public List<Repartidor> listarRepartidores(){
        return repartidores;
    }
}
