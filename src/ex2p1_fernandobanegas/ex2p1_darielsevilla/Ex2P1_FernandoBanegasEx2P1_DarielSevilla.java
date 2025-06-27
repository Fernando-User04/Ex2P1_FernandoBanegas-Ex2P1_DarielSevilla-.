/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_fernandobanegas.ex2p1_darielsevilla;
import static ex2p1_fernandobanegas.ex2p1_darielsevilla.metodos.combate;
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
    static ArrayList<pokemon> global = new ArrayList();
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        metodos met = new metodos();
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
                    global.add(pokemon);
                    System.out.println("El pokemon : ");
                    System.out.println("------------");
                    System.out.println(pokemon);
                    System.out.println("------------");
                    System.out.println("Ha sido adicionado con exito !!!");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("----Atrapar Pokemon----");
                    if (poke.size()>0&&tra.getPokeballs()>0) {
                        int random = r.nextInt(poke.size());
                        System.out.println("");
                        System.out.println("Un pokemon salvaje ha salido de la grama");
                        System.out.println("Es un "+poke.get(random).getNombre()+" salvaje");
                        boolean atrapado = false;
                        double chance = poke.get(random).getCatchRate();
                        do {
                            double tiro = r.nextDouble(100)+1;
                            if (tiro<=chance) {
                                System.out.println("Pokebolas : "+tra.getPokeballs());
                                System.out.println("Se puedo atrapar al "+poke.get(random).getNombre()+" salvaje");
                                encontrados.add(poke.get(random));
                                poke.remove(random);
                                atrapado = true;
                            }else{
                                int pokebo = tra.getPokeballs()-1;
                                tra.setPokeballs(pokebo);
                                System.out.println("Pokebolas : "+tra.getPokeballs());
                                int opc = 0;
                                do {
                                    System.out.println("El "+poke.get(random).getNombre()+" salvaje ha escapado"
                                        + ", desea intentar otra vez? (1 - Si, 2 - No)");
                                    System.out.println("Opcion : ");
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            atrapado = false;
                                            break;
                                        case 2:
                                            atrapado = true;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida, intente nuevamente.");
                                            break;
                                    }
                                } while (opc<1||opc>2);
                            }
                        } while (!atrapado);
                        
                    }else{
                        if (poke.size()==0) {
                            System.out.println("Deben de haber pokemones en el mundo para poder atraparlos. (crea un pokemon-Opcion1) ");
                        }
                        if (tra.getPokeballs()==0) {
                            System.out.println("Debes de tener pokebolas para poder atrapar pokemones");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("----Pokedex----");
                    System.out.println("");
                    int opci = 0;
                    do {
                        System.out.println("Seleccione opcion de listado : ");
                        System.out.println("1) Por tipo\n2) Pokemon atrapados\n3) Todos");
                        System.out.print("Opcion : ");
                        opci = entrada.nextInt();
                        System.out.println("");
                        switch(opci){
                            case 1:
                                int tipopoke = 0;
                                String type = "";
                                do {
                                    System.out.println("Ingrese tipo de pokemon : ");
                                    System.out.println("1) fuego\n2) agua\n3) planta");
                                    System.out.print("Tipo : ");
                                    tipopoke = entrada.nextInt();
                                    switch(tipopoke){
                                        case 1:
                                            type = "fuego";
                                            break;
                                        case 2:
                                            type = "agua";
                                            break;
                                        case 3:
                                            type = "planta";
                                            break;
                                        default:
                                            System.out.println("Tipo no valido, intente nuevamente.");
                                            break;
                                    }
                                } while (tipopoke<1||tipopoke>3);
                                System.out.println("");
                                for (int i = 0; i < global.size(); i++) {
                                    if (type.equalsIgnoreCase(global.get(i).getTipo())) {
                                        System.out.println("---------------");
                                        System.out.println(global.get(i));
                                        System.out.println("---------------");
                                    }
                                }
                                System.out.println("");
                                break;
                            case 2:
                                for (int i = 0; i < encontrados.size(); i++) {
                                    System.out.println("---------------");
                                    System.out.println(encontrados.get(i));
                                    System.out.println("---------------");
                                }
                                System.out.println("");
                                break;
                            case 3:
                                for (int i = 0; i < global.size(); i++) {
                                    System.out.println("---------------");
                                    System.out.println(global.get(i));
                                    System.out.println("---------------");
                                }
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opcion no valida, intente nuevamente.");
                        }
                    } while (opci<1||opci>3);
                    break;
                case 4:
                    System.out.println("----Entrenar Pokemon----");
                    System.out.println("");
                    if (encontrados.isEmpty()) {
                        System.out.println("No tienes Pokémon atrapados para entrenar.");
                        return;
                    }
                    System.out.println("Tus Pokémon atrapados:");
                    for (int i = 0; i < encontrados.size(); i++)
                        System.out.println(i + ". " + encontrados.get(i).getNombre());
                    System.out.print("Elige uno para entrenar: ");
                    int elegido = entrada.nextInt();
                    pokemon aliado = encontrados.get(elegido);
                    int ra = r.nextInt(global.size());
                    pokemon enemigo = global.get(ra);
                    combate(aliado, enemigo, true);

                    
                    break;
                case 5:
                    System.out.println("----Comprar Pokebolas----");
                    System.out.println("");
                    System.out.println("Cuantas pokebolas desea comprar? (Ingrese un numero) : ");
                    int cantidad = entrada.nextInt();
                    int precio = cantidad*100;
                    if (precio<=tra.getDinero()) {
                        System.out.println("Ha comprado "+cantidad+" pokebolas !!!");
                        System.out.println(tra);
                    }else{
                        System.out.println("No tienes suficiente dinero :( (mendigo pobre) ");
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("----Informacion de entrenador----");
                    System.out.println("");
                    System.out.println(tra);
                    System.out.println("");
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
