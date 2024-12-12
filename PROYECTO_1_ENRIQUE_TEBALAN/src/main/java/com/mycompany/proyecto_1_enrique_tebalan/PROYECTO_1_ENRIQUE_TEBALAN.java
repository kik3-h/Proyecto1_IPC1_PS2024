/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto_1_enrique_tebalan;

import java.util.Scanner;
import com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO;
import com.mycompany.proyecto_1_enrique_tebalan.REPORTES_Y_ESTADISTICAS;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.MORADO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.VERDE;
import com.mycompany.proyecto_1_enrique_tebalan.SEPARADOR_DE_LINEAS_LIMPIADOR;
import com.mycompany.proyecto_1_enrique_tebalan.adminJugable.adminJugableRPG;
import com.mycompany.proyecto_1_enrique_tebalan.adminJugable.generadorMapas;
import com.mycompany.proyecto_1_enrique_tebalan.ataquesRPG.ataquesPersonajesRPG;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.comprarEnTienda;
/**
 *
 * @author kik3.h
 */
public class PROYECTO_1_ENRIQUE_TEBALAN {
    
    public static void main(String[] args) { //ACA SE LLEVARA A CABO TODO XDD
        Scanner escaner = new Scanner(System.in); 
        
        BIENVENIDA_INICIO bienvenido = new BIENVENIDA_INICIO(); //aca creo el objeto de bienvenida
        
        BIENVENIDA_INICIO.bienvenida(args); //aca mando a llamer el mensaje de bienvenida
        
        int numOpcionMenu =0;
        
        do{
            SEPARADOR_DE_LINEAS_LIMPIADOR.dobleLineaDecoracion();
            System.out.println(VERDE+"1. COMENZAR PARTIDA"+RESET);
            System.out.println(AMARILLO+"2. TIENDA"+RESET);
            System.out.println(MORADO+"3. RESULTADOS Y ESTADISTICAS"+RESET);
            System.out.println(ROJO+"4. SALIR DE LA PARTIDA"+RESET);
            SEPARADOR_DE_LINEAS_LIMPIADOR.unaLineaDecoracion();
            numOpcionMenu = escaner.nextInt();
            
                switch (numOpcionMenu)
                {
                    case 1: 
                        SEPARADOR_DE_LINEAS_LIMPIADOR.limpiarPantalla();
                        System.out.println("ACA COMIENZA LA PARTIDA MOSTRANDO MAPA");  
                        adminJugableRPG.datosJugadorNuevo(); //aca comienzo pidiento los datos del jugador
                        adminJugableRPG.nombreDeLaPartida();
                        generadorMapas mapa = new generadorMapas();
                        //ataquesPersonajesRPG ataque = new ataquesPersonajesRPG();
                        //ataquesPersonajesRPG.accionAtaquesPersonajes();
                        
                        //ADMINJUEGABLE();
                    break;
                    
                    case 2:
                        SEPARADOR_DE_LINEAS_LIMPIADOR.limpiarPantalla();
                        System.out.println("ACA se muestra la tienda directamente");
                        comprarEnTienda.opcionMenuTienda();
                        //tienda();
                    break;
                    
                    case 3:
                        System.out.println("");
                        REPORTES_Y_ESTADISTICAS.reporEst();
                    break;
                    
                    case 4:
                        BIENVENIDA_INICIO.despedidaFinalJuego(args); 
                    break;
                    
                    default:
                        SEPARADOR_DE_LINEAS_LIMPIADOR.ingresarOpcionValida(); 
                }
                }while(numOpcionMenu >=1 || numOpcionMenu <=4 );
        

        BIENVENIDA_INICIO.despedidaFinalJuego(args);
    }

 
}
