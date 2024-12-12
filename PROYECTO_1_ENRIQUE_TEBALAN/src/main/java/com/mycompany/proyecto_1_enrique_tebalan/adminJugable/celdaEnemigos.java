/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.adminJugable;

import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;

/**
 *
 * @author DELL
 */
public class celdaEnemigos extends contenedor{
      //casilla zona debil
   // @Override
    public String simbolo1() {
        return AMARILLO+" ° "+RESET;
    
    }
    
    //casilla zona fuerte
   // @Override
    public String simbolo2() {
    return ROJO+" X "+RESET;
    }
}
