/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseg
 */
abstract class Vehiculo {
    private String modelo, marca, linea, motor, color, cilindros, tipo;
    private double precio_alquiler, precio_venta;

    public Vehiculo(){}

    public Vehiculo(String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, double precio_alquiler, double precio_venta) {
        this.modelo = modelo;
        this.marca = marca;
        this.linea = linea;
        this.motor = motor;
        this.color = color;
        this.cilindros = cilindros;
        this.tipo = tipo;
        this.precio_alquiler = precio_alquiler;
        this.precio_venta = precio_venta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio_alquiler() {
        return precio_alquiler;
    }

    public void setPrecio_alquiler(double precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    
   
    public void encender(){}
    public void apagar(){}
}
