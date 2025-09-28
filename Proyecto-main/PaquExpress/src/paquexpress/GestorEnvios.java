/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

import java.util.ArrayList;
import java.util.List;

public class GestorEnvios {
    
    private List<Envio> envios;

  
    public GestorEnvios() {
        this.envios = new ArrayList<>();
    }

    public void crearEnvio(Envio envio) {
        envios.add(envio);
    }

    public void asignarRepartidor(int idEnvio, Repartidor repartidor) {
        Envio envio = buscarEnvio(idEnvio);
        if (envio != null) {
            envio.setRepartidor(repartidor);
            System.out.println("Repartidor asignado al envio " + idEnvio);
        } else {
            System.out.println("No se encontro el envio con ID " + idEnvio);
        }
    }

    public void balancearEnvios(List<Repartidor> repartidores) {
        if (repartidores.isEmpty()) {
            System.out.println("No hay repartidores disponibles.");
            return;
        }

        int index = 0;
        for (Envio envio : envios) {
            Repartidor repartidor = repartidores.get(index % repartidores.size());
            envio.setRepartidor(repartidor);
            index++;
        }
        System.out.println("Se han balanceado los envios entre los repartidores.");
    }

    public List<Envio> listarEnvios() {
        return new ArrayList<>(envios);
    }

    public Envio buscarEnvio(int id) {
        for (Envio e : envios) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void actualizarEstadoEnvio(int id, String nuevoEstado) {
        Envio envio = buscarEnvio(id);
        if (envio != null) {
            envio.setEstado(nuevoEstado);
            System.out.println("Estado del envio " + id + " actualizado a: " + nuevoEstado);
        } else {
            System.out.println("No se encontro el envio con ID " + id);
        }
    }

    public void mostrarEnvios() {
        if (envios.isEmpty()) {
            System.out.println("No hay envios registrados.");
        } else {
            for (Envio e : envios) {
                System.out.println(e);
            }
        }
    }
}
