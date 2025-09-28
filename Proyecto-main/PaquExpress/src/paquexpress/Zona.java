/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

/**
 *
 * @author 0
 */
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Zona {

    private int codigoPostal;
    private String nombre;
    private List<Repartidor> repartidores;
    private List<Cliente> clientes;

    public Zona(int codigoPostal, String nombre) {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.repartidores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Getters
    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    // Métodos de gestión
    public void asignarRepartidor(Repartidor r) {
        if (!repartidores.contains(r)) {
            repartidores.add(r);
        }
    }

    public void asignarCliente(Cliente c) {
        if (!clientes.contains(c)) {
            clientes.add(c);
        }
    }

    public List<Repartidor> listarRepartidores() {
        return new ArrayList<>(repartidores);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }

  
    public Map<Repartidor, Integer> getRepartidoresConCarga() {
        Map<Repartidor, Integer> carga = new HashMap<>();
        for (Repartidor r : repartidores) {
            carga.put(r, r.getEnviosAsignados().size());
        }
        return carga;
    }
}
