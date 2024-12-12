/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.adminJugable;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.MORADO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.VERDE;
import com.mycompany.proyecto_1_enrique_tebalan.SEPARADOR_DE_LINEAS_LIMPIADOR;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class adminJugableRPG {
    public static String nombreDelJugadorNuevo;
    public static String nombrePartida;
    public static void datosJugadorNuevo()
    {
        String nombreJugadorNuevo;
        Scanner scanner = new Scanner(System.in);
        SEPARADOR_DE_LINEAS_LIMPIADOR.dobleLineaDecoracion();
        System.out.println(AMARILLO+" BIENVENID@ "+RESET);
        System.out.println(MORADO+" FAVOR INGRESA TU NOMBRE COMO JUGADOR: "+RESET);
        nombreDelJugadorNuevo = scanner.nextLine();
        SEPARADOR_DE_LINEAS_LIMPIADOR.continuarEnter();
        //return nombreJugadorNuevo;
    }
    
    public static void nombreDeLaPartida()
    {
       // String nombreDePartida;
        Scanner scanner = new Scanner(System.in);
        SEPARADOR_DE_LINEAS_LIMPIADOR.dobleLineaDecoracion();
        System.out.println(VERDE+" ¡COMIENZO DE LA PARTIDA! "+RESET);
        SEPARADOR_DE_LINEAS_LIMPIADOR.saltoDeLinea();
        SEPARADOR_DE_LINEAS_LIMPIADOR.unaLineaDecoracion();
        System.out.println(" FAVOR INGRESA EL NOMBRE DE LA PARTIDA: ");
        nombrePartida= scanner.nextLine();
        //aca tengo que sumarle 1000 de oro Y MAS 8 pociiones, 2 tiendas de campaña, 2 plumas de fenix
        SEPARADOR_DE_LINEAS_LIMPIADOR.continuarEnter();
    }
    
    public static void menuMovimientos()
    {
        System.out.println("");
        System.out.println("               Arriba (w)" + "               ");
        System.out.println("Izquieda(a)  " + " Abajo (s)" + "  Derecha(s)" + ROJO + "                Abandonar Partida(q)" + RESET);
    }
    

    
    
}

