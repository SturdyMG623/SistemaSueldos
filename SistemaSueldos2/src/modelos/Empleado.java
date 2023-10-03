/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.io.Serializable;

/**
 *
 * @author CEDEC
 */
public class Empleado implements Serializable{
    private int legajo;
    private String nombre;
    private String apellido;
    private Puesto puesto;
    
    public Empleado(int legajo, String nombre, String apellido, Puesto puesto){
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
    }
    
    public int getLegajo(){
        return legajo;
    }
    
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public Puesto getPuesto(){
        return puesto;
    }
    
    public void setPuesto(Puesto puesto){
        this.puesto = puesto;
    }
}
