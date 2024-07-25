/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author camper
 */
public class Doctor extends Personal {
    private String especialidad;
    private boolean esJunior;

    public Doctor(String id, String nombre, String direccion, String fechaNacimiento, String fechaVinculacion, double salario, String especialidad, boolean esJunior) {
        super(id, nombre, direccion, fechaNacimiento, fechaVinculacion, salario);
        this.especialidad = especialidad;
        this.esJunior = esJunior;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEsJunior() {
        return esJunior;
    }

    public void setEsJunior(boolean esJunior) {
        this.esJunior = esJunior;
    }
}
