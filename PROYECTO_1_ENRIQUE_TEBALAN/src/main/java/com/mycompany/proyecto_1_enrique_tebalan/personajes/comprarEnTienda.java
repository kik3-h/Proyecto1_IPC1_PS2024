/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.personajes;

import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.VERDE;
import com.mycompany.proyecto_1_enrique_tebalan.SEPARADOR_DE_LINEAS_LIMPIADOR;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class comprarEnTienda {
    
    public static void opcionMenuTienda(){
        Scanner scanner = new Scanner(System.in);
        SEPARADOR_DE_LINEAS_LIMPIADOR.dobleLineaDecoracion();
        System.out.println("ORO DISPONIBLE: 1000");
        System.out.println(VERDE+" BIENVENIDO A LA TIENDA RPG "+RESET);
        System.out.println("");
        System.out.println("1.Comprar Objetos");
        System.out.println("2.Vender Objetos");
        System.out.println("3.Magias");
        System.out.println("4.ComprarArmas");
        System.out.println("5.Vender Armas");
        System.out.println("6.Comprar Trabajos");
        System.out.println("7.Vender Trabajos");
        System.out.println("8.Salir");
        System.out.println("Que desea realizar?");
        int opcionMenuTienda;
        opcionMenuTienda = scanner.nextInt();
        
        switch (opcionMenuTienda)
        {
            case 1:
                System.out.println("1. Armas De Dos Manos");
                System.out.println("2. Arma De Una Mano");
                System.out.println("3. Armas Cortas");
                System.out.println("1. Armas De Dos Manos");
        }

    }
}
