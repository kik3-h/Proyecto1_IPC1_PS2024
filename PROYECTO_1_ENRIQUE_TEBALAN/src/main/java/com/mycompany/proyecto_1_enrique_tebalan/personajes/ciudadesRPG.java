/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.personajes;
import com.mycompany.proyecto_1_enrique_tebalan.ataquesRPG.ataquesPersonajesRPG;
import com.mycompany.proyecto_1_enrique_tebalan.REPORTES_Y_ESTADISTICAS;
/**
 *
 * @author DELL
 */
public class ciudadesRPG {
    
    public static void ciudadita(){
        System.out.println("Te encuentras en una ciudad. ¡Conquistala!");
        ataquesPersonajesRPG.accionAtaquesPersonajes();
        REPORTES_Y_ESTADISTICAS.cantCiudadesRec++;
        
    }
}
