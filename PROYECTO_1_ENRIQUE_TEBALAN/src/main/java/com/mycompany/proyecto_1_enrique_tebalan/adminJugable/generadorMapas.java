/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_enrique_tebalan.adminJugable;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.AMARILLO;
//import static com.mycompany.proyecto_1_enrique_tebalan.PROYECTO_1_ENRIQUE_TEBALAN;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.RESET;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.ROJO;
import static com.mycompany.proyecto_1_enrique_tebalan.BIENVENIDA_INICIO.VERDE;
import com.mycompany.proyecto_1_enrique_tebalan.SEPARADOR_DE_LINEAS_LIMPIADOR;
import com.mycompany.proyecto_1_enrique_tebalan.adminJugable.adminJugableRPG;
import com.mycompany.proyecto_1_enrique_tebalan.ataquesRPG.ataquesPersonajesRPG;
import com.mycompany.proyecto_1_enrique_tebalan.adminJugable.celdaTienda;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.ciudadesRPG;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.comprarEnTienda;
import com.mycompany.proyecto_1_enrique_tebalan.personajes.posadaRPG;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class generadorMapas {
    
    celdaEnemigos casillaEnemigo = new celdaEnemigos();
    celdaDelJugador casillaJugador = new celdaDelJugador();
    celdaTienda casillaTienda = new celdaTienda();
    celdaPosada casillaPosada = new celdaPosada();
    celdaCiudades casillaCiudad = new celdaCiudades();
    
    private int tamanioMapa;

    private String rangoMapa[][];

    int coordenadaX;
    int coordenadaY;

    public generadorMapas(){
        
        this.tamanioMapa= mapaRandom(); //aca mando a llamar al metodo que genera el mapa
        this.rangoMapa = new String[tamanioMapa][tamanioMapa]; 
        
        generar_MapaRango();
        crearLugaresFuertes();
        crearLugarTienda();
        crearPosada();
        crearCiudades();
        //Agrear_Jugador();
        hacerMovimientos();
        
    }
    
    private void generar_MapaRango() { //aca genero los espacion basados en el tamaño por el random
        for (int i = 0; i < tamanioMapa; i++) {
            for (int j = 0; j < tamanioMapa; j++) {

                rangoMapa[i][j] = casillaEnemigo.simbolo1();
            }
            System.out.println("");
        }
    }
    
    private void mostrarMapa() { //aca muestro en pantalla
        for (int x = 0; x < tamanioMapa; x++) {
            for (int y = 0; y < tamanioMapa; y++) {
                System.out.print(rangoMapa[x][y]);
            }
            System.out.println("");
        }
    }
    
    private void crearLugaresFuertes() {
        Random random = new Random();

        // del las casillas del mapa o un poco menos seran zonas fuertes
        for (int i = 0; i < (tamanioMapa * tamanioMapa) / 2; i++) {

            int x = random.nextInt(tamanioMapa);
            int y = random.nextInt(tamanioMapa);

            rangoMapa[x][y] = casillaEnemigo.simbolo2();
        }
    }
    
    private void crearLugarTienda()
    {
        Random random = new Random();
        for(int x=0; x < (tamanioMapa / tamanioMapa); x++)
        {
            int j = random.nextInt(tamanioMapa);
            int k = random.nextInt(tamanioMapa);
            
            rangoMapa [j][k]= casillaTienda.simbolo1();
                    
        }
    }
    
    private void crearPosada()
    {
        Random random = new Random();
        for(int x=0; x < ((tamanioMapa / tamanioMapa)+2); x++)
        {
            int j = random.nextInt(tamanioMapa);
            int k = random.nextInt(tamanioMapa);
            
            rangoMapa [j][k]= casillaPosada.simbolo1();
                    
        }
    }
    
    private void crearCiudades()
    {
        Random random = new Random();
        for(int x=0; x < ((tamanioMapa / tamanioMapa)+3); x++)
        {
            int j = random.nextInt(tamanioMapa);
            int k = random.nextInt(tamanioMapa);
            
            rangoMapa [j][k]= casillaCiudad.simbolo1();
                    
        }
    }
     
    private void añadirJugador()
    {
        Random random = new Random(); //aca genero la posicion donde aparece el jugador K
        
        int x = random.nextInt(tamanioMapa);
        int y = random.nextInt(tamanioMapa);
        
        rangoMapa[x][y]= casillaJugador.simbolo1();
    }
    
    String guardarPaso;
    private void hacerMovimientos()
    {
        Scanner scanner = new Scanner(System.in);
        String opcionMovimiento= "";
        do{
            SEPARADOR_DE_LINEAS_LIMPIADOR.limpiarPantalla();
            System.out.println("Esta Jugando: "+VERDE+adminJugableRPG.nombreDelJugadorNuevo+RESET+" En la partida de nombre: "+AMARILLO+adminJugableRPG.nombrePartida+RESET);
            System.out.println("");
            SEPARADOR_DE_LINEAS_LIMPIADOR.dobleLineaDecoracion();
            mostrarMapa();
            System.out.println(VERDE+adminJugableRPG.nombreDelJugadorNuevo+RESET+" Elije una opcion:");
            System.out.println("               Arriba (w)" + "               ");
            System.out.println("Izquieda(a)  " + " Abajo (s)" + "  Derecha(d)" + ROJO + "                Abandonar Partida(q)" + RESET);

            opcionMovimiento= scanner.nextLine();
            
            switch (opcionMovimiento)
            {
                //moverse a la izquierda
                case "a":
                    if(coordenadaY >0 )
                    {
                        guardarPaso= rangoMapa[coordenadaX][coordenadaY-1];
                        coordenadaY--;
                        verificadorCeldas();
                        //rangoMapa[coordenadaX][coordenadaY] = casillaEnemigo.simbolo1();
                        rangoMapa[coordenadaX][coordenadaY+1]= this.guardarPaso;
                        rangoMapa[coordenadaX][coordenadaY] = casillaJugador.simbolo1();  
                    }else
                    {
                        System.out.println(ROJO+"No puedes moverte más hacia la izquierda."+RESET);
                    }  
                break;
                
                //moverse a la derecha
                case "d":
                    if (coordenadaY < tamanioMapa - 1)
                    {
                        guardarPaso = rangoMapa[coordenadaX][coordenadaY+1];
                        //rangoMapa[coordenadaX][coordenadaY] = casillaEnemigo.simbolo1();
                        coordenadaY++;
                        verificadorCeldas();
                        rangoMapa[coordenadaX][coordenadaY-1]= this.guardarPaso;
                        rangoMapa[coordenadaX][coordenadaY] = casillaJugador.simbolo1();
                    }else
                    {
                        System.out.println(ROJO+"No puedes moverte más hacia la derecha."+RESET);
                    }
                    
                break;
                
                //movimiento Arriba
                case "w":
                    if (coordenadaX > 0)
                    {
                        guardarPaso= rangoMapa[coordenadaX-1][coordenadaY];
                        //rangoMapa[coordenadaX][coordenadaY] = casillaEnemigo.simbolo1();
                        coordenadaX--;
                        verificadorCeldas();
                        rangoMapa[coordenadaX+1][coordenadaY]= this.guardarPaso;
                        rangoMapa[coordenadaX][coordenadaY] = casillaJugador.simbolo1();
                    }else
                    {
                        System.out.println(ROJO+"No puedes moverte más hacia arriba."+RESET);
                    }
                    
                break;
                
                //moverse abajo
                case "s":
                    if (coordenadaX < tamanioMapa - 1)
                    {
                        guardarPaso= rangoMapa[coordenadaX+1][coordenadaY];
                        //rangoMapa[coordenadaX][coordenadaY] = casillaEnemigo.simbolo1();
                        coordenadaX++;
                        verificadorCeldas();
                        rangoMapa[coordenadaX-1][coordenadaY]= this.guardarPaso;
                        rangoMapa[coordenadaX][coordenadaY] = casillaJugador.simbolo1();
                    }else
                    {
                        System.out.println(ROJO+"No puedes moverte más hacia abajo."+RESET);
                    }
                    
                break;
                
                default:
                    System.out.println(ROJO+"Opción inválida. Inténtalo de nuevo."+RESET);
                break; 
            }  
        }while (!opcionMovimiento.equals("q"));
    }

    private void verificadorCeldas()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(guardarPaso);
        String opcionMenu ="";
            if(guardarPaso == casillaTienda.simbolo1())
            {
                    do{
                        System.out.println(VERDE+"Te encuentras en una tienda. ¡Compra algunos objetos!"+RESET);
                        System.out.println("Ingresa una Opcion");
                        System.out.println("1. IR A LA TIENDA");
                        System.out.println("2. CONTINUAR EXPLORANDO EN EL MAPA (SALIR)");
                        opcionMenu= scanner.nextLine();
                            
                            switch(opcionMenu)
                                    {
                                        case "1":
                                            comprarEnTienda.opcionMenuTienda();
                                        break;
                                        
                                        case "2":
                                            opcionMenu="2";
                                            break;
                                    }
                        
                    }while(!opcionMenu.equals("2"));
                    //llamar un do while

            }else if (guardarPaso == casillaEnemigo.simbolo2()) 
            {
                do{
                    System.out.println("Te encuentras en una Zona fuerte. ¡Defiendete!");
                    System.out.println("1. IR A LA BATALLA");
                    System.out.println("2. CONTINUAR EXPLORANDO EN EL MAPA (SALIR)");
                    opcionMenu= scanner.nextLine();
                            
                            switch(opcionMenu)
                                    {
                                        case "1":
                                            ataquesPersonajesRPG.accionAtaquesPersonajes();
                                        break;
                                        
                                        case "2":
                                            opcionMenu="2";
                                            break;
                                    }     
                }while (!opcionMenu.equals("2"));
                   
            }else if (guardarPaso == casillaPosada.simbolo1())
            {
                do{
                    System.out.println("Te encuentras en una Posada. ¡Descansa!");
                    System.out.println("1. IR A DESCANSAR");
                    System.out.println("2. CONTINUAR EXPLORANDO EN EL MAPA (SALIR)");
                    opcionMenu= scanner.nextLine();
                            
                            switch(opcionMenu)
                                    {
                                        case "1":
                                            posadaRPG.posadita();
                                        break;
                                        
                                        case "2":
                                            opcionMenu="2";
                                            break;
                                    }     
                }while (!opcionMenu.equals("2"));
                    
                    
            }else if (guardarPaso == casillaCiudad.simbolo1())
            {
                    do{
                    System.out.println("Te encuentras en una ciudad. ¡Conquistala!");
                    System.out.println("1. IR A CONQUISTAR");
                    System.out.println("2. CONTINUAR EXPLORANDO EN EL MAPA (SALIR)");
                    opcionMenu= scanner.nextLine();
                            
                            switch(opcionMenu)
                                    {
                                        case "1":
                                            ciudadesRPG.ciudadita();
                                        break;
                                        
                                        case "2":
                                            opcionMenu="2";
                                            break;
                                    }     
                }while (!opcionMenu.equals("2"));
            }
    }
    
    private int mapaRandom(){
        Random random = new Random();
        int aleatorio = random.nextInt(3);
        
        int mapaElegido;
        
        switch (aleatorio) {
            case 0:
                mapaElegido = 7;
                
                break;
                
            case 1:
                mapaElegido = 10;
                
                break;
                
            case 2:
                mapaElegido = 12;  
                break;
            default:
                throw new AssertionError();
        }
        return mapaElegido;     
    }
    
    
}
