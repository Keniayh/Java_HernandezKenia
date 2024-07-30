/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemahospitalario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Yulieth
 */
public class Conexion {
    private Connection con;
    private Scanner scanner;
    public Conexion(){
        scanner = new Scanner(System.in);
    }
    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://bgqtarkhukyhvpysdj0-mysql.services.clever-cloud.com:3306/bgqtarkhukyhvpysdj0",
                "u9tejivwjyjmzt7",
                "Jfocr9VQbk0zwNqhoOXx"
            );
            //JOptionPane.showMessageDialog(null, "La conexión es un éxito :)");
        } catch (Exception e) {
            System.err.println("Error en la conexión :(, error:" + e);
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.toString());
        }
        return con;
    }
    
    public void VerHospitales(){
        Conexion cn = new Conexion();
        Scanner sc = new Scanner(System.in);
        Connection con = cn.establecerConexion();
        PreparedStatement ps = null;
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_hospital, nombre, direccion FROM hospitales");
            while (rs.next()){
                System.out.println(rs.getInt("id_hospital") + " " + rs.getString("nombre") + " " + rs.getString("direccion"));
            }
        }catch (Exception e){    
            System.err.println("Error al ejecutar la consulta: " + e);
        }
    }
    
    public void InsertHospitales(){
        Conexion cn = new Conexion();
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        Connection con = cn.establecerConexion();
        String nombreHospital;
        String direccionHospital;
        try {
            ps = con.prepareStatement("insert into hospitales (nombre, direccion) values (?,?)");
            System.out.println("Ingresa el nombre del hospital: ");
            nombreHospital = sc.nextLine();
            System.out.println("Ingresa la direccion del hospital: ");
            direccionHospital = sc.nextLine();
            ps.setString(1, nombreHospital);
            ps.setString(2, direccionHospital);
            ps.executeUpdate();
            System.out.println("Insercion realizada con éxito");
        } catch (Exception e){
            System.err.println("Error sl ejecutar la inserción: " + e);
        }
    }
    
    public void DeleteHospitales(){
        Conexion cn = new Conexion();
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        Connection con = cn.establecerConexion();
        int idHospital;
        try {
            ps = con.prepareStatement("delete from hospitales where id_hospital = ?");
            System.out.println("Ingresa el id del hospital a eliminar: ");
            idHospital = sc.nextInt();
            ps.setInt(1, idHospital);
            ps.executeUpdate();
            System.out.println("Hospital eliminado con éxito");
        } catch(Exception e){
            System.err.println("Error sl eliminar los datos: " + e);            
        }

    }
    
    public void UpdateHospitales() {
        Conexion cn = new Conexion();
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        Connection con = cn.establecerConexion();
        String nombreHospital;
        String direccionHospital;
        int idHospital;
    
        try {
            System.out.println("Ingresa el id del hospital que deseas actualizar: ");
            idHospital = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Ingresa el nuevo nombre del hospital: ");
            nombreHospital = sc.nextLine();
        
            System.out.println("Ingresa la nueva direccion del hospital: ");
            direccionHospital = sc.nextLine();
        
            ps = con.prepareStatement("UPDATE hospitales SET nombre = ?, direccion = ? WHERE id_hospital = ?");
            ps.setInt(3, idHospital);
            ps.setString(1, nombreHospital);
            ps.setString(2, direccionHospital);
        
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("La actualización fue exitosa.");
            } else {
                System.out.println("No se encontró un hospital con el id proporcionado.");
            }   
        } catch (Exception e) {
            System.err.println("Error al actualizar los datos: " + e);
        }     
    }
    
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        Scanner sc = new Scanner(System.in);
        Connection con = cn.establecerConexion();
        PreparedStatement ps = null;
        Statement st;
        ResultSet rs;
        int option;
        
        do {
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
            option = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    boolean admin = true;
                    while (admin) {
                        System.out.println("Bienvenido al rol de Administrador");
                        System.out.println("¿A qué área deseas ingresar?");
                        System.out.println("1. Paciente");
                        System.out.println("2. Personal");
                        System.out.println("3. Hospitales");
                        System.out.println("4. Salir");
                        String optionsAd = sc.nextLine();
                        System.out.println("");

                        switch (optionsAd) {
                            case "1":
                                System.out.println("Estas en el área pacientes, ¿qué deseas hacer?");
                                System.out.println("1. Visualizar");
                                System.out.println("2. Agregar");
                                System.out.println("3. Actualizar");
                                System.out.println("4. Eliminar");
                                String optionsP = sc.nextLine();
                                System.out.println("");

                                try {
                                    switch (optionsP) {
                                        case "1":
                                            System.out.println("Visualizar pacientes");
                                            // Lógica para visualizar pacientes
                                            break;
                                        case "2":
                                            System.out.println("Agregar Paciente");
                                            // Lógica para agregar pacientes
                                            break;
                                        case "3":
                                            System.out.println("Actualizar paciente");
                                            // Lógica para actualizar pacientes
                                            break;
                                        case "4":
                                            System.out.println("Eliminar paciente");
                                            // Lógica para eliminar pacientes
                                            break;
                                        default:
                                            System.out.println("Opción invalida");
                                            break;
                                    }
                                } catch (Exception e) {
                                    System.err.println("Error al manejar pacientes: " + e.getMessage());
                                }
                                break;
                            case "2":
                                System.out.println("Estas en el área personal, ¿qué deseas hacer?");
                                System.out.println("1. Visualizar");
                                System.out.println("2. Agregar");
                                System.out.println("3. Actualizar");
                                System.out.println("4. Eliminar");
                                String optionsPe = sc.nextLine();
                                System.out.println("");

                                try {
                                    switch (optionsPe) {
                                        case "1":
                                            System.out.println("Visualizar personal");
                                            // Lógica para visualizar personal
                                            break;
                                        case "2":
                                            System.out.println("Agregar Personal");
                                            // Lógica para agregar personal
                                            break;
                                        case "3":
                                            System.out.println("Actualizar personal");
                                            // Lógica para actualizar personal
                                            break;
                                        case "4":
                                            System.out.println("Eliminar personal");
                                            // Lógica para eliminar personal
                                            break;
                                        default:
                                            System.out.println("Opción invalida");
                                            break;
                                    }
                                } catch (Exception e) {
                                    System.err.println("Error al manejar personal: " + e.getMessage());
                                }
                                break;
                            case "3":
                                boolean hospital = true;
                                while (hospital) {
                                    System.out.println("Bienvenido al área de Hospitales");
                                    System.out.println("¿Qué deseas hacer?");
                                    System.out.println("1. Ver Hospitales Registrados");
                                    System.out.println("2. Registrar Nuevo Hospital");
                                    System.out.println("3. Actualizar Hospitales Registrados");
                                    System.out.println("4. Eliminar Hospitales Registrados");
                                    System.out.println("5. Salir");
                                    String optionsH = sc.nextLine();
                                    System.out.println("");

                                    try {
                                        switch (optionsH) {
                                            case "1":
                                                cn.VerHospitales();
                                                break;
                                            case "2":
                                                cn.InsertHospitales();
                                                break;
                                            case "3":
                                                cn.UpdateHospitales();
                                                break;
                                            case "4":
                                                cn.DeleteHospitales();
                                                break;
                                            case "5":
                                                hospital = false;
                                                break;
                                            default:
                                                System.out.println("Opción invalida");
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.err.println("Error al manejar hospitales: " + e.getMessage());
                                    }
                                }
                                break;
                            case "4":
                                admin = false;
                                break;
                            default:
                                System.out.println("Opción invalida");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Bienvenido al rol de Técnico");
                    // Añadir la lógica para el rol Técnico aquí
                    break;
                case 3:
                    System.out.println("Bienvenido al rol de Operaciones");
                    // Añadir la lógica para el rol Operaciones aquí
                    break;
                default:
                    System.out.println("Error. Favor digitar un número que esté entre 1 y 4.");
                    break;
            }
        } while (option != 4);
        System.out.println("Bay user");
        sc.close();
    }
}
