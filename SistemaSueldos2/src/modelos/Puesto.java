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
public class Puesto implements Serializable {
    private String nombre;
    private double sueldo;
    
    public Puesto(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public boolean equals(Puesto puesto){
        return(this.nombre.equals(puesto.nombre)&&this.sueldo == puesto.sueldo);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo; 
    }
    
}
