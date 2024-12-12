/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan;

/**
 *
 * @author DELL
 */

import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.CELESTE;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;
import com.mycompany.proyecto_1_enrique_tebalan.adminJugable.adminJugableRPG;
import java.util.Scanner;

public class REPORTES_Y_ESTADISTICAS {
   public static int victorias=0;
   public static int cantEnemigosDerrotados=0;
   public static int cantMuertesGuerreros=0;
   public static int cantCiudadesRec=0;
   public static int cantVecesRec=0; 
   public static int cantVecesMag=0; 
   public static int cantVecesdañoG=0;
   
    public static void reporEst()
    {
         System.out.println(ROJO + "\n*********REPORTES*********\n" + RESET);
        System.out.println(CELESTE+"  =======================================================================\n"+RESET);
        System.out.println("NOMBRE DEL JUGADOR:"+adminJugableRPG.nombreDelJugadorNuevo);
        System.out.println("\n");
        System.out.println("NOMBRE DE LA PARTIDA:"+adminJugableRPG.nombrePartida);
                System.out.println("\n");
        System.out.println("CANTIDAD DE ENEMIGOS DERROTADOS:"+cantEnemigosDerrotados);
        System.out.println("\n");
        System.out.println("Cantidad de veces que cada guerrero murió:"+cantMuertesGuerreros);
        System.out.println("Cantidad de daño que cada guerrero hizo:"+cantVecesdañoG);
        System.out.println("Cantidad de ciudades reconquistadas:"+cantCiudadesRec);
        System.out.println("Indicar si se logró reconquistar todas las ciudades o la partida finalizó por instrucción del jugador."+cantVecesRec);
        System.out.println("Cantidad de veces que se ejecutó cada magia:"+cantVecesMag);
        System.out.println(CELESTE+"  =======================================================================\n"+RESET);
    }
   
}
