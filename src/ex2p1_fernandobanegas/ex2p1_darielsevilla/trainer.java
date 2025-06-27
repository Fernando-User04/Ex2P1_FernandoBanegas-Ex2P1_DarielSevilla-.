/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_fernandobanegas.ex2p1_darielsevilla;

/**
 *
 * @author Fernando
 */
public class trainer {
    private String nombre;
    private String region;
    private double dinero;
    private int pokeballs;
    
    
    public void trainer(){
        
    }
    
    public void trainer(String nombre, String region, double dinero, int pokeballs){
        this.nombre = nombre;
        this.region = region;
        this.dinero = dinero;
        this.pokeballs = pokeballs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getPokeballs() {
        return pokeballs;
    }

    public void setPokeballs(int pokeballs) {
        this.pokeballs = pokeballs;
    }

    @Override
    public String toString() {
        return "Entrenador : "+nombre+"\nRegion : "+region+"\nDinero : "+dinero+"\nPokebolas : "+pokeballs;
    }
    
    
    
}
