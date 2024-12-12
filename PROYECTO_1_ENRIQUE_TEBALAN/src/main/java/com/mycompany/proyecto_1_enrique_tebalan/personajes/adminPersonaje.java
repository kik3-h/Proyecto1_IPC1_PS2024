/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.personajes;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.VERDE;
import com.mycompany.proyecto_1_enrique_tebalan.SEPARADOR_DE_LINEAS_LIMPIADOR;
import java.util.Random;
/**
 *
 * @author DELL
 */
public abstract class adminPersonaje {
    
    Random random = new Random();
    
    private String nombrePersonaje;
    protected int vidaPersonaje ;
    protected int danioPersonaje ;
    protected int defensaPersonaje;
    
    public String getNombre() {
        return nombrePersonaje;
    }
    
    public void setNombre(String nombre) {
        this.nombrePersonaje = nombre;
    }
    
    public int getVida() {
        return vidaPersonaje;
    }
    
    public void setVida(int vida) {
        this.vidaPersonaje = vida;
    }
    
     public int getDaño() {
        return danioPersonaje;
    }
     
    public void setDaño(int daño) {
        this.danioPersonaje = daño;
    }
    
    public int getDefensa() {
        return defensaPersonaje;
    }
    
    public void setDefensa(int defensa) {
        this.defensaPersonaje = defensa;
    }
    
    public adminPersonaje(String nombre) {
        
        this.nombrePersonaje = nombre;
        vidaPersonaje = random.nextInt(15)+30;
        danioPersonaje = random.nextInt(8)+8;
        defensaPersonaje = random.nextInt(3)+3;
        
    }
    
    public int accionAtacar(adminPersonaje elatacado){ //atacar
        int danioFinal = danioPersonaje- elatacado.getDefensa();
        System.out.println(elatacado.getNombre()+" Ha recibido un daño total de: "+ROJO+danioFinal+RESET);
        return danioFinal;
    }
    
    public void accionRecibirDanio(int danioRecibido){ //recibirdanio
       
        vidaPersonaje = vidaPersonaje - danioRecibido;      
        
    }  
    
    public void mostrarResultadosEst(){ //mostrar resultados de las estadisticas de combate
        SEPARADOR_DE_LINEAS_LIMPIADOR.unaLineaDecoracion();
        System.out.println(nombrePersonaje);
        System.out.println(VERDE+"Vida Actual: "+vidaPersonaje+RESET);
        System.out.println(ROJO+"Daño Actual: "+danioPersonaje+RESET);
        System.out.println(AMARILLO+"Defensa Actual: "+defensaPersonaje+RESET);
        SEPARADOR_DE_LINEAS_LIMPIADOR.unaLineaDecoracion();
    }
    
    
    
}
