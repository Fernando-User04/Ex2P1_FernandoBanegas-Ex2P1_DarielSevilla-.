/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_fernandobanegas.ex2p1_darielsevilla;

/**
 *
 * @author Fernando
 */
public class pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private double ataque;
    private double defensa;
    private double catchRate;
    private double vida;
    
    
    public void pokemon(){
        
    }
    
    public void pokemon(String nombre, String tipo, int nivel, double ataque, double defensa, double catchRate, double vida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.catchRate = catchRate;
        this.vida = vida;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(double catchRate) {
        this.catchRate = catchRate;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    

    @Override
    public String toString() {
        return nombre+"\ntipo : "+tipo+"\n"+vida+" hp"+"\nLVL. "+nivel+"\ndef : "+defensa+" atk : "+ataque;
    }
    
    
    
}
