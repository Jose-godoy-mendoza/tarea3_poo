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
public class Moto extends Vehiculo_terrestre{
    private String traccion, cadena, loderas, tacos_traseros, tipo_clutch;

    public Moto(){}
    
    public Moto(String traccion, String cadena, String loderas, String tacos_traseros, String tipo_clutch, String asientos, String llantas, String placa, String chasis, String tipo_frenos, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, double precio_alquiler, double precio_venta) {
        super(asientos, llantas, placa, chasis, tipo_frenos, modelo, marca, linea, motor, color, cilindros, tipo, precio_alquiler, precio_venta);
        this.traccion = traccion;
        this.cadena = cadena;
        this.loderas = loderas;
        this.tacos_traseros = tacos_traseros;
        this.tipo_clutch = tipo_clutch;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getLoderas() {
        return loderas;
    }

    public void setLoderas(String loderas) {
        this.loderas = loderas;
    }

    public String getTacos_traseros() {
        return tacos_traseros;
    }

    public void setTacos_traseros(String tacos_traseros) {
        this.tacos_traseros = tacos_traseros;
    }

    public String getTipo_clutch() {
        return tipo_clutch;
    }

    public void setTipo_clutch(String tipo_clutch) {
        this.tipo_clutch = tipo_clutch;
    }
    
    @Override
    public void acelerar()
    {
        System.out.println("Este Automovil acelera de 0 a 100 en 5 segundos");
    }
    ////////
    @Override
    public void frenar()
    {
        System.out.println("Esta moto puede frenar y diminuir la velocidad en 14km/s por cada 3 segundos");
    }
    /////////////
    public void comprimir(String tipo)
    {
        if((tipo.equals("Mecanico"))||(tipo.equals("mecanico")))
        {
        System.out.println("Para bajar más rapido la velocidad, suelte el clutch y frene para comprimir y frenar al mismo tiempo");    
        }
        else
        {
            System.out.println("Esta moto es automatica y no puede comprimir");
        }
    }
    
    //////////////
    @Override
    public void encender()
    {
        System.out.println("Inserte y gire la llave para encender el vehiculo");
    }
    //////////
    @Override
    public void apagar()
    {
        System.out.print("Gire la llave a la izquierda y quitela");
    }
    ///////////////
    @Override
    public void intermitentes()
    {
        System.out.println("presione la palanca hacia el lado al que va a pedir via ");
    }
    //////////
    public void forma_acelerar(String tipo)
    {
        if((tipo.equals("Mecanico"))||(tipo.equals("mecanico")))
        {
            System.out.println("Para hacer los cambios meta clutch y mueva la palanca al cambio siguiente");
        }
        else
        {
            System.out.println("Este vehiculo es automatico y no tiene clutch");
        }
    }
    //////////////
    @Override
    public void bloquear_vehiculo()
    {
        System.out.println("Apage completamente el vehiculo, y presione la llave y girela a la izquierda para bloquear el vehiculo");
    }
}
