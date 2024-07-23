/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Yulieth
 */

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fin = true;

        while (fin) {
            System.out.println("-----------------------------");
            System.out.println("-       BIENVENIDO A        -");
            System.out.println("-        CAMPUSLANDS        -");
            System.out.println("-----------------------------");
            System.out.println("");
            System.out.println("Selecciona el cargo al que perteneces:");
            System.out.println("1. Coordinador \t2. Trainer \t3. Salir");
            System.out.println("Selecciona los números según el área a la que se desea ingresar");
            String rta = scanner.nextLine();
            limpiarPantalla();

            if (rta.equals("1")) {
                System.out.print("Ingresa tu nombre: ");
                String nameModCA = scanner.nextLine();
                limpiarPantalla();
                boolean m = true;
                while (m) {
                    letrero();
                    System.out.println("");
                    System.out.println(" Bienvenido " + nameModCA);
                    System.out.println("¿A qué área deseas ingresar: ");
                    System.out.println("1. Trainers \t2. Campers \n3. Rutas de entrenamiento  \t4. Reportes \n5. Volver al menú principal");
                    String optionsAC = scanner.nextLine();
                    limpiarPantalla();
                    switch (optionsAC) {
                        case "1":
                            boolean x = true;
                            while (x) {
                                letrero();
                                System.out.println("Has ingresado a la sección de Trainers.");
                                System.out.println("¿Qué deseas hacer?");
                                System.out.println("1. Crear nuevo Trainer \t2. Asignar horario \t3. Ver Trainers \n4. Volver al menú anterior");
                                String optionTr = scanner.nextLine();
                                limpiarPantalla();
                                switch (optionTr) {
                                    case "1":
                                        System.out.println("Opción de crear nuevo Trainer.");
                                        break;
                                    case "2":
                                        System.out.println("Opción de asignar horario.");
                                        break;
                                    case "3":
                                        System.out.println("Opción de ver Trainers.");
                                        break;
                                    case "4":
                                        x = false;
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 4.");
                                }
                            }
                            break;
                        case "2":
                            boolean f = true;
                            while (f) {
                                letrero();
                                System.out.println("Has ingresado a la sección de Campers.");
                                System.out.println("¿Qué deseas hacer?");
                                System.out.println("1. Inscripciones \t2. Matrículas \n3. Editar información \t4. Notas \n5. Volver al menú anterior");
                                String optionsA = scanner.nextLine();
                                limpiarPantalla();
                                switch (optionsA) {
                                    case "1":
                                        System.out.println("Opción de inscripciones.");
                                        break;
                                    case "2":
                                        System.out.println("Opción de matrículas.");
                                        break;
                                    case "3":
                                        System.out.println("Opción de editar información.");
                                        break;
                                    case "4":
                                        System.out.println("Opción de notas.");
                                        break;
                                    case "5":
                                        f = false;
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 5.");
                                }
                            }
                            break;
                        case "3":
                            boolean n = true;
                            while (n) {
                                letrero();
                                System.out.println("Has ingresado a la sección de Rutas de entrenamiento.");
                                System.out.println("¿Qué deseas hacer?");
                                System.out.println("1. Mostrar Rutas \t2. Crear rutas de entrenamiento \n3. Volver al menú anterior");
                                String optionR = scanner.nextLine();
                                limpiarPantalla();
                                switch (optionR) {
                                    case "1":
                                        System.out.println("Opción de mostrar rutas.");
                                        break;
                                    case "2":
                                        System.out.println("Opción de crear rutas de entrenamiento.");
                                        break;
                                    case "3":
                                        n = false;
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 3.");
                                }
                            }
                            break;
                        case "4":
                            letrero();
                            System.out.println("Has ingresado a la sección de reportes.");
                            System.out.println("¿Qué deseas ver?");
                            System.out.println("1. Campers que se encuentran inscritos \n2. Campers que aprobaron el examen inicial");
                            System.out.println("3. Entrenadores que se encuentran trabajando con CampusLands");
                            System.out.println("4. Campers con bajo rendimiento \n5. Campers y Trainers asociados a una ruta de entrenamiento");
                            System.out.println("6. Número de campers que perdieron y aprobaron cada uno de los módulos");
                            scanner.nextLine(); // Simular la espera de una entrada
                            break;
                        case "5":
                            m = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 5.");
                    }
                }
            } else if (rta.equals("2")) {
                letrero();
                System.out.println("");
                System.out.println("¿Qué deseas hacer?");
                System.out.println("1. Horario \t2. Volver al inicio");
                String optionsT = scanner.nextLine();
                limpiarPantalla();
                if (optionsT.equals("1")) {
                    letrero();
                    System.out.println("Has ingresado a la sección de Horarios.");
                    System.out.println("Completa la siguiente información para saber tu horario de trabajo.");
                    limpiarPantalla();
                    System.out.print("Ingresa tu número de identificación: ");
                    String trainerN = scanner.nextLine();
                    limpiarPantalla();
                    System.out.println("Tu número de identificación es " + trainerN);
                } else if (optionsT.equals("2")) {
                    limpiarPantalla();
                } else {
                    System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 2.");
                }
            } else if (rta.equals("3")) {
                fin = false;
            } else {
                System.out.println("Error. Favor digitar un número que esté entre 1 y 3.");
            }
        }

        scanner.close();
    }

    // Simular la limpieza de pantalla
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    // Simular letrero
    public static void letrero() {
        System.out.println("-----------------------------");
        System.out.println("-        Bienvenido         -");
        System.out.println("-----------------------------");
    }
}

