/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import hospital.Hospital;
import hospital.Paciente;
import hospital.Personal;
import hospital.Doctor;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */


public class SistemaHospitalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminar = true;

        // Crear una lista de hospitales para almacenar los datos
        List<Hospital> hospitales = new ArrayList<>();

        // Crear un hospital de ejemplo (esto puede ser dinámico según las entradas del usuario)
        Hospital hospital = new Hospital("001", "Hospital General");
        hospitales.add(hospital);

        while (terminar) {
            System.out.println("####################################");
            System.out.println("#          Sistema Integrado        ");
            System.out.println("#             Hospitalario          ");
            System.out.println("####################################");
            System.out.println("");
            System.out.println("1. Administrador");
            System.out.println("2. Técnico");
            System.out.println("3. Operaciones");
            System.out.println("4. Salir");
            System.out.println("Escribe el número según el rol al cual deseas ingresar:");
            String rta = sc.nextLine();

            if (rta.equals("1")) {
                boolean admin = true;
                while (admin) {
                    System.out.println("Bienvenido al rol de Administrador");
                    System.out.println("¿A qué área deseas ingresar?");
                    System.out.println("1. Paciente");
                    System.out.println("2. Personal");
                    System.out.println("3. Salir");
                    String optionsAd = sc.nextLine();
                    System.out.println("");

                    switch (optionsAd) {
                        case "1":
                            System.out.println("Bienvenido al rol de Administrador");
                            System.out.println("Estas en el área pacientes, ¿qué deseas haacer?");
                            System.out.println("1. Visualizar");
                            System.out.println("2. Agregar");
                            System.out.println("3. Actualizar");
                            System.out.println("4. Eliminar");
                            String optionsP = sc.nextLine();
                            System.out.println("");
                            
                            switch (optionsP) {
                                case "1":
                                    System.out.println("Visualizar pacientes");
                                    break;
                                case "2":
                                    System.out.println("Agregar Paciente");
                                    administrarPacientes(sc, hospital);
                                case "3":
                                    System.out.println("Actualizar paciente");
                                case "4":
                                    System.out.println("Eliminar paciente");
                                case "5":
                                    admin = false;
                                    break;
                                default:
                                    System.out.println("Opción invalida");
                                    break; 
                            }
                            
                            
                            break;
                        case "2":
                            administrarPersonal(sc, hospital);
                            break;
                        case "3":
                            admin = false;
                            break;
                        default:
                            System.out.println("Opción invalida");
                            break;
                    }
                }
            } else if (rta.equals("2")) {
                System.out.println("Bienvenido al rol de Técnico");
                // Añadir la lógica para el rol Técnico aquí
                break;
            } else if (rta.equals("3")) {
                System.out.println("Bienvenido al rol de Operaciones");
                // Añadir la lógica para el rol Operaciones aquí
                break;
            } else if (rta.equals("4")) {
                terminar = false;
            } else {
                System.out.println("Error. Favor digitar un número que esté entre 1 y 4.");
            }
        }
        sc.close();
    }

    private static void administrarPacientes(Scanner sc, Hospital hospital) {
        System.out.println("Administración de Pacientes");
        System.out.println("Ingrese el ID del paciente:");
        String id = sc.nextLine();
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la dirección del paciente:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del paciente:");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese el pabellón asignado:");
        String pabellonAsignado = sc.nextLine();
        System.out.println("Ingrese el diagnóstico:");
        String diagnostico = sc.nextLine();

        Paciente paciente = new Paciente(id, nombre, direccion, fechaNacimiento, pabellonAsignado, diagnostico);
        hospital.addPaciente(paciente);

        System.out.println("Paciente añadido con éxito.");
    }

    private static void administrarPersonal(Scanner sc, Hospital hospital) {
        System.out.println("Administración de Personal");
        System.out.println("Ingrese el ID del personal:");
        String id = sc.nextLine();
        System.out.println("Ingrese el nombre del personal:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la dirección del personal:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del personal:");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese la fecha de vinculación:");
        String fechaVinculacion = sc.nextLine();
        System.out.println("Ingrese el salario:");
        double salario = Double.parseDouble(sc.nextLine());

        Personal personal = new Personal(id, nombre, direccion, fechaNacimiento, fechaVinculacion, salario);
        hospital.addPersonal(personal);

        System.out.println("Personal añadido con éxito.");
    }
}