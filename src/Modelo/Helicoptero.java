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
public class Helicoptero extends Vehiculo_aereo{
    private String rotor_antipar, patines_aterrizaje;
    private int turbinas, helices, estabilizadores_cola;

    public Helicoptero(){}
    
    public Helicoptero(String rotor_antipar, String patines_aterrizaje, int turbinas, int helices, int estabilizadores_cola, String asientos, String piloto_automatico, String ventanas, int tanques, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, double precio_alquiler, double precio_venta) {
        super(asientos, piloto_automatico, ventanas, tanques, modelo, marca, linea, motor, color, cilindros, tipo, precio_alquiler, precio_venta);
        this.rotor_antipar = rotor_antipar;
        this.patines_aterrizaje = patines_aterrizaje;
        this.turbinas = turbinas;
        this.helices = helices;
        this.estabilizadores_cola = estabilizadores_cola;
    }

    public String getRotor_antipar() {
        return rotor_antipar;
    }

    public void setRotor_antipar(String rotor_antipar) {
        this.rotor_antipar = rotor_antipar;
    }

    public String getPatines_aterrizaje() {
        return patines_aterrizaje;
    }

    public void setPatines_aterrizaje(String patines_aterrizaje) {
        this.patines_aterrizaje = patines_aterrizaje;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public int getEstabilizadores_cola() {
        return estabilizadores_cola;
    }

    public void setEstabilizadores_cola(int estabilizadores_cola) {
        this.estabilizadores_cola = estabilizadores_cola;
    }
    
    @Override
    public void encender()
    {
        System.out.println("Lamentablemente no hay mucha informacion de como encender una helicoptero");
    }
    ///////////
    @Override
    public void apagar()
    {
        System.out.println("Lamentablemente no hay mucha informacion de como apagar un helicoptero");
    }
    ////////////
    @Override
    public void despegar()
    {
        System.out.println("Eleve el mando coletivo, y operar adecuadamente los pedales del timon");
    }
    ////////////
    @Override
    public void aterrizar()
    {
        System.out.println("Pongase sobre el area, baje el mando colectivo para bajar y maniobre adecuadamente los pedales");
    }
    /////////////
    @Override
    public void modo_emergencia()
    {
        System.out.println("Al detectar anormalidades este helicoptero activara luz roja");
    }
    /////////////
    @Override
    public void planear()
    {
        System.out.println("Para mantener estatico el helicoptero");
    }
    
}
