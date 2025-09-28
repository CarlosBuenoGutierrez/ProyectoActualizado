/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Envio {

    private int id;
    private List<Paquete> paquetes;
    private Cliente cliente;
    private Repartidor repartidor;
    private Zona zona;
    private String estado;
    private Date fechaSalida;
    private Date fechaEntrega;

    // Constructor
    public Envio(int id, Cliente cliente, Zona zona, List<Paquete> paquetes) {
        this.id = id;
        this.cliente = cliente;
        this.zona = zona;
        this.paquetes = new ArrayList<>(paquetes);
        this.estado = "Pendiente"; 
        this.fechaSalida = new Date();
        this.fechaEntrega = null;
    }

    public int getId() {
        return id;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public Zona getZona() {
        return zona;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Envio:" + "id:" + id + "\n" + "Cliente: " + (cliente != null ? cliente.getNombre() : "Sin cliente") + "\n"
                + "Repartidor:" + (repartidor != null ? repartidor.getNombre() : "No asignado") + "\n"
                + "Zona:" + (zona != null ? zona.getNombre() : "Sin zona") + "\n" + "Estado: " + estado + "\n"
                + "FechaSalida:" + fechaSalida + "\n" + "FechaEntrega:" + fechaEntrega + "\n"
                + "Paquetes:" + paquetes.size();
    }
}