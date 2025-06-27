/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_fernandobanegas.ex2p1_darielsevilla;

import static ex2p1_fernandobanegas.ex2p1_darielsevilla.Ex2P1_FernandoBanegasEx2P1_DarielSevilla.encontrados;
import static ex2p1_fernandobanegas.ex2p1_darielsevilla.Ex2P1_FernandoBanegasEx2P1_DarielSevilla.global;
import static ex2p1_fernandobanegas.ex2p1_darielsevilla.Ex2P1_FernandoBanegasEx2P1_DarielSevilla.tra;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class metodos {
    
    public void restaurar(pokemon x){
        x.setVida(100.0);
    }
    
    static void combate(pokemon bueno, pokemon enemigo, boolean turnoAliado) {
        metodos met = new metodos();
        if (bueno.getVida() <= 0) {
            bueno.setNivel(bueno.getNivel() - 3);
            if (bueno.getNivel() < 1) bueno.setNivel(1);
            tra.setDinero(tra.getDinero() - 1000);
            if (tra.getDinero() < 0) tra.setDinero(0);
            met.restaurar(bueno);
            System.out.println("Perdiste el combate. Nivel bajado a " + bueno.getNivel());
            return;
        } else if (enemigo.getVida() <= 0) {
            int sube = new Random().nextInt(3) + 1;
            bueno.setNivel(bueno.getNivel() + sube);
            int premio = 600 + new Random().nextInt(201);
            tra.setDinero(tra.getDinero() + premio);
            met.restaurar(bueno);
            System.out.println("¡Ganaste el combate! Nivel +" + sube + ", Dinero +" + premio);
            return;
        }

        if (turnoAliado) {
            double daño = bueno.getAtaque();
            enemigo.setVida(enemigo.getVida() - daño);
            System.out.println(bueno.getNombre() + " ataca con " + daño + " de daño. Vida enemigo: " + enemigo.getVida());
        } else {
            double daño = enemigo.getAtaque();
            bueno.setVida(bueno.getVida() - daño);
            System.out.println(enemigo.getNombre() + " ataca con " + daño + " de daño. Vida aliado: " + bueno.getVida());
        }
        combate(bueno, enemigo, !turnoAliado);
    }
    
}
