/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquexpress;

/**
 *
 * @author 0
 */
public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double capacidadCarga;  
    private double ancho;          
    private double alto;
    private double largo;

    public Vehiculo(String placa, String marca, String modelo,
                    double capacidadCarga, double ancho, double alto, double largo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    // Setters
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
