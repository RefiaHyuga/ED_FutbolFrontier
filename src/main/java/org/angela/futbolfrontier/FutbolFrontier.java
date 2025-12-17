/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.angela.futbolfrontier;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Angela
 */
public class FutbolFrontier {

    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Liga liga = new Liga();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1: //Registrar equipo
                    System.out.print("Nombre del equipo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ciudad del equipo: ");
                    String ciudad = scanner.nextLine();
                    Equipo equipo = new Equipo(nombre, ciudad);
                    liga.registrarEquipo(equipo);
                    System.out.println("Equipo registrado: " + equipo.getNombre());
                    break;
                case 2: //Registrar partido
                    System.out.print("Nombre del equipo local: ");
                    String nombreLocal = scanner.nextLine();
                    System.out.print("Nombre del equipo visitante: ");
                    String nombreVisitante = scanner.nextLine();
                    System.out.print("Goles del equipo local: ");
                    int golesLocal = scanner.nextInt();
                    System.out.print("Goles del equipo visitante: ");
                    int golesVisitante = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    if(liga.buscarEquipo(nombreLocal)!=null && liga.buscarEquipo(nombreVisitante)!=null){
                        Partido partido = new Partido(liga.buscarEquipo(nombreLocal), liga.buscarEquipo(nombreVisitante), golesLocal, golesVisitante, new Date());
                        liga.registrarPartido(partido);
                        System.out.println("Partido registrado: " + partido);
                    } else {
                        System.out.println("Uno de los equipos no existe.");
                    }
                    break;
                case 3:
                    liga.mostrarClasificacion();
                    break;
                case 4:// Buscar equipo por nombre
                    System.out.println("Introduce el nombre del equipo que quieres bucar: ");
                    String nombreEquipo = scanner.nextLine();
                    liga.buscarEquipo(nombreEquipo);
                    break;
                case 5:
                    liga.listarPartidos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    // Mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n--- Menú de la Liga de Fútbol ---");
        System.out.println("1. Registrar equipo");
        System.out.println("2. Registrar partido");
        System.out.println("3. Ver clasificación");
        System.out.println("4. Buscar equipo");
        System.out.println("5. Listar partidos");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
        
    }
}
    
 