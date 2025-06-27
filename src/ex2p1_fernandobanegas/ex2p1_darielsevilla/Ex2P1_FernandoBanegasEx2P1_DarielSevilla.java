/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_fernandobanegas.ex2p1_darielsevilla;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Fernando
 */
public class Ex2P1_FernandoBanegasEx2P1_DarielSevilla {

    static ArrayList<pokemon> poke = new ArrayList();
    static ArrayList<pokemon> encontrados = new ArrayList();
    static trainer tra = new trainer();
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        System.out.println("----P O K E M O N----");
        System.out.println("");
        System.out.println("Ingrese nombre de entrenador : ");
        String nombreentrenador = entrada.nextLine();
        System.out.println("Ingrese region del entrenador : ");
        String regionentrenador = entrada.nextLine();
        double dinero = 0.0;
        int pokeballs = 10;
        tra.setDinero(dinero);
        tra.setNombre(nombreentrenador);
        tra.setRegion(regionentrenador);
        tra.setPokeballs(pokeballs);
        System.out.println("");
        System.out.println(tra);
        System.out.println("");
        System.out.println("---------------------------------------\n");
        int opcion = 0;
        do {
            System.out.print("1) Crear Pokemon\n2) Atrapara Pokemon\n3) Pokedex\n4) Entrenar Pokemon\n5) Comprar Pokebolas\n6) "
                + "Informacion de entrenador\n7) Salir\nIngrese Opcion : ");
            opcion = entrada.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:
                    System.out.println("----Crear Pokemon----");
                    pokemon pokemon = new pokemon();
                    System.out.println("");
                    System.out.println("Ingrese especie de Pokemon : ");
                    entrada.nextLine();
                    String nombrepoke = entrada.nextLine();
                    boolean t = false;
                    String tipo = "";
                    do {
                        System.out.println("Ingrese tipo de Pokemon : ");
                        System.out.println("1) Fuego\n2) Agua\n3) Planta");
                        System.out.println("Ingrese tipo : ");
                        int ti = entrada.nextInt();
                        switch(ti){
                            case 1:
                                tipo = "fuego";
                                t = true;
                                break;
                            case 2:
                                tipo = "agua";
                                t = true;
                                break;
                            case 3:
                                tipo = "planta";
                                t = true;
                                break;
                            default:
                                System.out.println("Opcion no valida intente nuevamente ");
                                t = false;
                                break;
                        }
                    } while (!t);
                    System.out.println("Ingrese vida del pokemon (150-500) : ");
                    int vida = 0;
                    do {
                        System.out.print("Vida : ");
                        vida = entrada.nextInt();
                        
                        if (vida<150||vida>500) {
                            System.out.println("Vida no valida, intente nuevamente.");
                            
                        }
                        
                    } while (vida<150||vida>500);
                    System.out.println("Ingrese ataque del pokemon (80-120) : ");
                    double ataque = 0;
                    do {
                        System.out.print("Ataque : ");
                        ataque = entrada.nextDouble();
                        
                        if (ataque<80||ataque>120) {
                            System.out.println("Ataque no valido, intente nuevamente");
                            
                        }
                        
                    } while (ataque<80||ataque>120);
                    System.out.println("Ingrese defensa del pokemon (30-50) : ");
                    double defensa = 0;
                    do {
                        System.out.print("Defensa : ");
                        defensa = entrada.nextDouble();
                        
                        if (defensa<30||defensa>50) {
                            System.out.println("Defensa no valida, intente nuevamente");
                            
                        }
                        
                    } while (defensa<30||defensa>50);
                    System.out.println("Ingrese catchRate del pokemon (1-100) : ");
                    double catchRate = 0;
                    do {
                        System.out.print("CatchRate : ");
                        catchRate = entrada.nextDouble();
                        
                        if (catchRate<1||catchRate>100) {
                            System.out.println("CatchRate no valido intenta nuevamente");
                            
                        }
                        
                    } while (catchRate<1||catchRate>100);
                    
                    int nivel = 1;
                    
                    pokemon.setNombre(nombrepoke);
                    pokemon.setAtaque(ataque);
                    pokemon.setDefensa(defensa);
                    pokemon.setCatchRate(catchRate);
                    pokemon.setVida(vida);
                    pokemon.setTipo(tipo);
                    pokemon.setNivel(nivel);
                    System.out.println("");
                    poke.add(pokemon);
                    System.out.println("El pokemon : ");
                    System.out.println("------------");
                    System.out.println(pokemon);
                    System.out.println("------------");
                    System.out.println("Ha sido adicionado con exito !!!");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("----Atrapar Pokemon----");
                    if (poke.size()>0) {
                        
                        
                        
                    }else{
                        System.out.println("Deben de haber pokemones en el mundo para poder atraparlos. (crea un pokemon-Opcion1) ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("----Pokedex----");
                    break;
                case 4:
                    System.out.println("----Entrenar Pokemon----");
                    break;
                case 5:
                    System.out.println("----Comprar Pokebolas----");
                    break;
                case 6:
                    System.out.println("----Informacion de entrenador----");
                    break;
                case 7:
                    System.out.println("Saliendo del juego....");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
                    System.out.println("");
                    break;
            } 
        } while (opcion!=7);
       
        
        
    }
    
}
