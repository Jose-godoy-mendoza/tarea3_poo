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
public class Automovil extends Vehiculo_terrestre{
    private String traccion, estado, suspension;
    private int puertas, ventanas;

    private Automovil(){}

    public Automovil(String traccion, String estado, String suspension, int puertas, int ventanas, String asientos, String llantas, String placa, String chasis, String tipo_frenos, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, double precio_alquiler, double precio_venta) {
        super(asientos, llantas, placa, chasis, tipo_frenos, modelo, marca, linea, motor, color, cilindros, tipo, precio_alquiler, precio_venta);
        this.traccion = traccion;
        this.estado = estado;
        this.suspension = suspension;
        this.puertas = puertas;
        this.ventanas = ventanas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }
    
    
    @Override
    public void acelerar()
    {
        System.out.println("Este Automovil acelera de 0 a 100 en 5 segundos");
    }
    /////////
    @Override
    public void frenar()
    {
        System.out.println("Este Automovil puede frenar y diminuir la velocidad en 10km/s por cada 3 segundos");
    }
    ////////////
    public void comprimir(String tipo)
    {
        if((tipo.equals("Mecanico"))||(tipo.equals("mecanico")))
        {
        System.out.println("Para bajar más rapido la velocidad, suelte el clutch y frene para comprimir y frenar al mismo tiempo");
        }
        else
        {
            System.out.println("Este automovil no puede comprimir ya que es automatico");
        }
    }
    //////////////
    @Override
    public void encender()
    {
        System.out.println("Inserte y gire la llave para encender el vehiculo");
    }
    //////////////
    @Override
    public void apagar()
    {
        System.out.print("Gire la llave a la izquierda y quitela");
    }
    /////////
    @Override
    public void intermitentes()
    {
        System.out.println("Baje la palanca para pedir via a la izquierda, suba la palanca para pedir via a la derecha \npresione el boton de emergencia para activar ambas luces");
    }
    /////////
    @Override
    public void bloquear_vehiculo()
    {
        System.out.println("Apage completamente el vehiculo, y presione la llave y girela a la izquierda para bloquear el vehiculo");
    }
    //////////
    public void forma_acelerar(String tipo)
    {
        if((tipo.equals("Mecanico"))||(tipo.equals("mecanico")))
        {
            System.out.println("Para hacer los cambios meta clutch y mueva la palanca de velocidades al cambio siguiente");
        }
        else
        {
            System.out.println("Este vehiculo es automatico y no tiene clutch");
        }
    }
    
}
