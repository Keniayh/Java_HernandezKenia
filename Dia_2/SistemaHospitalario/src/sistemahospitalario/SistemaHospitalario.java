/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemahospitalario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author camper
 */


public class SistemaHospitalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminar = true;
        
        while (terminar){
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
            
            if (rta.equals("1")){
                boolean admin = true;
                while (admin == true){
                    System.out.println("Bienvenido al rol de Administrador");
                    System.out.println("¿A qué área deseas ingresar?");
                    System.out.println("1. Paciente");
                    System.out.println("2. Personal");
                    System.out.println("3. Salir");
                    String optionsAd = sc.nextLine();
                    System.out.println("");
                    
                    switch (optionsAd) {
                        case "1":
                            System.out.println("area paciente");
                            break;
                        case "2":
                            System.out.println("area personal");
                            break;
                        case "3":
                            admin = false;
                        default:
                            System.out.println("Opción invalida");
                            break;
                    }
                    
                }
            } else if (rta.equals("2")) {
                System.out.println("Bienvenido al rol de Técnico");
                break;
            } else if (rta.equals("3")){
                System.out.println("Bienvenido al rol de Operaciones");
                break;
            } else if (rta.equals("4")) {
                break;
            } else {
                System.out.println("Error. Favor digitar un número que esté entre 1 y 4.");
            }
        }
    }
}
