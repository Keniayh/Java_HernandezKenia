/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author camper
 */
public class Paciente extends Personas {
    private String pabellonAsignado;
    private String diagnostico;

    public Paciente(String id, String nombre, String direccion, String fechaNacimiento, String pabellonAsignado, String diagnostico) {
        super(id, nombre, direccion, fechaNacimiento);
        this.pabellonAsignado = pabellonAsignado;
        this.diagnostico = diagnostico;
    }
    public String getPabellonAsignado() {
        return pabellonAsignado;
    }

    public void setPabellonAsignado(String pabellonAsignado) {
        this.pabellonAsignado = pabellonAsignado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
