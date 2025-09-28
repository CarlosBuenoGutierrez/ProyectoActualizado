package paquexpress;

import java.util.ArrayList;
import java.util.List;

public class GestorPaquetes {

    private List<Paquete> paquetes;

    public GestorPaquetes() {
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(Paquete p) {
        paquetes.add(p);
    }

    public void eliminarPaquete(int id) {
        Paquete paquete = buscarPaquete(id);
        if (paquete != null) {
            paquetes.remove(paquete);
        } else {
            System.out.println("Paquete con ID " + id + " no encontrado.");
        }
    }

    public Paquete buscarPaquete(int id) {
        for (Paquete p : paquetes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Paquete> listarPaquetes() {
        return new ArrayList<>(paquetes);
    }

    public void mostrarPaquetes() {
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes registrados.");
        } else {
            for (Paquete p : paquetes) {
                System.out.println(p);
            }
        }
    }
}
