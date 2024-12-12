/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.ataquesRPG;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.MORADO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import com.mycompany.proyecto_1_enrique_tebalan.SEPARADOR_DE_LINEAS_LIMPIADOR;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.guerreroRPG;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.enemigosRPG;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.adminPersonaje;
import com.mycompany.proyecto_1_enrique_tebalan.REPORTES_Y_ESTADISTICAS;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ataquesPersonajesRPG {
    
    public static void accionAtaquesPersonajes()
    {
        double danio= 50;
        double aumento = 0.25;
        
        danio += danio*aumento;
        System.out.println(danio);
        
        adminPersonaje[] soldadoDeLaLuz = new adminPersonaje[4]; //aca generan
        adminPersonaje[] botsitos = new adminPersonaje[4];
        
        //Mapa mapa = new Mapa();
        SEPARADOR_DE_LINEAS_LIMPIADOR.unaLineaDecoracion();
        System.out.println(AMARILLO+" Presiona enter para continuar:"+RESET);
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        SEPARADOR_DE_LINEAS_LIMPIADOR.saltoDeLinea();
        
        soldadoDeLaLuz[0] = new guerreroRPG(MORADO+"Vann"+RESET);
        soldadoDeLaLuz[0].mostrarResultadosEst();
        
        SEPARADOR_DE_LINEAS_LIMPIADOR.saltoDeLinea();
        
        soldadoDeLaLuz[1] = new guerreroRPG(MORADO+"Celes"+RESET);
        soldadoDeLaLuz[1].mostrarResultadosEst();
        
        SEPARADOR_DE_LINEAS_LIMPIADOR.saltoDeLinea();  
        
        soldadoDeLaLuz[2] = new guerreroRPG(MORADO+"Locke"+RESET);
        soldadoDeLaLuz[2].mostrarResultadosEst();
        
        SEPARADOR_DE_LINEAS_LIMPIADOR.saltoDeLinea();
        
        soldadoDeLaLuz[3] = new guerreroRPG(MORADO+"Rydia"+RESET);
        soldadoDeLaLuz[3].mostrarResultadosEst();
        
        //celes ataque a vaaan
        soldadoDeLaLuz[1].accionRecibirDanio(soldadoDeLaLuz[0].accionAtacar(soldadoDeLaLuz[1]));
        soldadoDeLaLuz[1].mostrarResultadosEst();
        //vaan ataca a celes
        soldadoDeLaLuz[0].accionRecibirDanio(soldadoDeLaLuz[1].accionAtacar(soldadoDeLaLuz[0]));
        soldadoDeLaLuz[0].mostrarResultadosEst();
        
        soldadoDeLaLuz[2].accionRecibirDanio(soldadoDeLaLuz[1].accionAtacar(soldadoDeLaLuz[2]));
        soldadoDeLaLuz[2].mostrarResultadosEst();
        
        REPORTES_Y_ESTADISTICAS.cantEnemigosDerrotados++;
        REPORTES_Y_ESTADISTICAS.cantMuertesGuerreros++;
        System.out.println("enter para continuar");
        scanner.nextLine();
        

        botsitos[0] = new enemigosRPG(MORADO+"BOT1"+RESET);
        botsitos[0].mostrarResultadosEst();
                        //bot 0 ataca a vaan
        botsitos[0].accionRecibirDanio(botsitos[0].accionAtacar(soldadoDeLaLuz[0]));
        System.out.println("daño bot a vann:");
        botsitos[0].mostrarResultadosEst();
        
        //leer las caracteristicas de los guerreros 
        for(adminPersonaje per : soldadoDeLaLuz)
        {
            per.mostrarResultadosEst();
            System.out.println("");
        }
        
        //leer las caracteristicas de todos los bots creados
        
        for(adminPersonaje bot : botsitos)
        {
            bot.mostrarResultadosEst();
            System.out.println("");
        }

        
    }
}
