/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

public class Paquete {
    private int id;
    private double peso;
    private double dimensiones;
    private String destino;

    public Paquete(int id, double peso, double dimensiones, String destino) {
        this.id = id;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Paquete:" + "id:" + id + "\n" +  " Peso:" + peso + "\n" + "Dimensiones:" + dimensiones + "\n" + "Destino:" + "\n" +
                destino;
    }
}
