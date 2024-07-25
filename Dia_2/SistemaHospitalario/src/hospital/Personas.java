/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author camper
 */
public class Personas {
    private String id;
    private String nombre;
    private String direccion;
    private String fechaNacimiento;

    // Constructor, getters y setters
    public Personas(String id, String nombre, String direccion, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String setId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String setNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
