/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author camper
 */
public class Hospital {
    private String id;
    private String nombre;
    private List<Paciente> pacientes;
    private List<Personal> personal;
    private List<Doctor> doctores;

    public Hospital(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
        this.personal = new ArrayList<>();
        this.doctores = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void addPersonal(Personal personal) {
        this.personal.add(personal);
    }

    public void addDoctor(Doctor doctor) {
        doctores.add(doctor);
    }
    
    // getters y setters
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public List<Personal> getPersonal(){
        return personal;
    }
    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }
    
    public List<Doctor> getDoctor() {
        return doctores;
    }
    public void setDoctor(List<Doctor> doctores) {
        this.doctores = doctores;
    }
}
