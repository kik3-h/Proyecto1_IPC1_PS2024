/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan;

import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.CELESTE;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.MORADO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SEPARADOR_DE_LINEAS_LIMPIADOR {
    public static final String BORRRAR = "\u001B[0m"; //borrar 
    
    static Scanner leer=new Scanner(System.in);
    
    public static void espacioEnBlanco()
    {
        System.out.println("");
    }
    
    public static void dobleLineaDecoracion()
    {
        System.out.print("");
        System.out.println(CELESTE+"=======================================================================\n"+RESET);
    }
    
    public static void unaLineaDecoracion()
    {
        System.out.print("");
        System.out.println(MORADO+"------------------------------------------------------------------------\n"+RESET);
    }
    
    public static void limpiarPantalla()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void limpiarUnaLinea()
    {
        System.out.print("\033[F\033[2K");
    }
    
    public static void ingresarOpcionValida()
    {
                        limpiarPantalla();
                        espacioEnBlanco();
                        System.out.println("##########################################");
                        System.out.println(ROJO+"Ingrese una opción valida por favor"+RESET);
                        System.out.println("##########################################");
                        espacioEnBlanco();
    }
    public static void saltoDeLinea()
    {
        System.out.println("\n");
    }
    
        public static void continuarEnter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(AMARILLO+"   PRESIONA ENTER PARA CONTINUAR: "+RESET);
        scanner.nextLine();
    }
    
}
