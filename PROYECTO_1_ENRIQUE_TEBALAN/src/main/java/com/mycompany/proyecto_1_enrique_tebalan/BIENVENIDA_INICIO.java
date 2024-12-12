/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan;


/**
 *
 * @author DELL
 */
public class BIENVENIDA_INICIO {
           public static final String RESET = "\u001B[0m";
           public static final String VERDE = "\u001B[32m";
           public static final String AMARILLO = "\u001B[33m";
           public static final String ROJO = "\u001B[31m";
           public static final String AZUL = "\u001B[34m";
           public static final String MORADO = "\u001B[35m";
           public static final String CELESTE = "\u001B[36m";
           
        public static void bienvenida(String[] args)
                {
                SEPARADOR_DE_LINEAS_LIMPIADOR.limpiarPantalla();
                System.out.print("");
                System.out.println("PROYECTO 1 PS2024"); //27/02/2024
                System.out.println("");
                System.out.println(CELESTE+"  =======================================================================\n"+RESET);
                System.out.println(VERDE+"                              ¡BIENVENID@! :D         \n"+RESET);
                System.out.println(VERDE+"                                      A       \n "+RESET);
                System.out.println(VERDE+"                              un videojuego RPG    \n    "+RESET);
                System.out.println(CELESTE+"                     ---------------------------------  \n          "+RESET);
                System.out.println(MORADO+"                               By kik3.h    \n        "+RESET);
                System.out.println(CELESTE+"  ======================================================================="+RESET);
                //19/03/2024
       }
        
       public static void despedidaFinalJuego(String [] args)
       {
                SEPARADOR_DE_LINEAS_LIMPIADOR.limpiarPantalla();
                System.out.print("");
                System.out.println("PROYECTO 1 PS2024"); //27/02/2024
                System.out.println("");
                System.out.println(CELESTE+"  =======================================================================\n"+RESET);
                System.out.println(ROJO+"                              ¡HASTA LUEGO! :(         \n"+RESET);
                System.out.println(VERDE+"                                             \n "+RESET);
                System.out.println(AMARILLO+"                         has jugado un videojuego RPG    \n    "+RESET);
                System.out.println(CELESTE+"                     ---------------------------------  \n          "+RESET);
                System.out.println(MORADO+"                              By kik3.h    \n        "+RESET);
                System.out.println(CELESTE+"  ======================================================================="+RESET);
                System.exit(0);
       }
       
       public static void menuJugarOtraVez()
       {
                SEPARADOR_DE_LINEAS_LIMPIADOR.limpiarPantalla();
                System.out.print("");
                System.out.println(MORADO+"HAS DECIDIDO INTENTARLO DE NUEVO, MUCHA SUERTE :D"+RESET);
                //adminJugable();
       }

  
 }

