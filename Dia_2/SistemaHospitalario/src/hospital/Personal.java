/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author camper
 */
public class Personal extends Personas {
    private String fechaVinculacion;
    private double salario;

    public Personal(String id, String nombre, String direccion, String fechaNacimiento, String fechaVinculacion, double salario) {
        super(id, nombre, direccion, fechaNacimiento);
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
    }
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(String fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
