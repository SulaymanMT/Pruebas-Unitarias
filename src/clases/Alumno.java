/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author prog
 */
public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    int telefono;
    int dni;
    int expediente;
    String correo;
    String nombrePadre;
    String nombreMadre;
    int telMadre;
    int telPadre;
    Direccion[] direcciones;
    public Alumno(){
        
    }
    public Alumno(int dni,String nombre,String apellido,String apellido2, int edad, int telefono, int expediente,
            String correo, String nomPadre, String nomMadre,int telMadre,int telPadre){
        this.dni= dni;
        this.nombre=nombre;
        this.apellido1=apellido;
        this.apellido2=apellido2;
        this.edad=edad;
        this.telefono=telefono;
        this.expediente=expediente;
        this.correo=correo;
        this.nombrePadre=nomPadre;
        this.nombreMadre=nomMadre;
        this.telPadre=telPadre;
        this.telMadre=telMadre;         
    }
    @Override
    public String toString(){
        return dni + nombre + apellido1 + apellido1+ edad+ telefono+ expediente+correo+nombrePadre+nombreMadre+telPadre+telMadre; 
    }
    //EQUALS
    public boolean equals(Alumno other){
        if(this.dni != other.dni){
            return false;
        }
        if(this.nombre.equals(other.nombre)){
            return false;
        }
        if(this.apellido1.equals(other.apellido1)){
            return false;
        }
        if(this.apellido2.equals(other.apellido2)){
            return false;
        }
        if(this.edad != other.edad){
            return false;
        }
        if(this.telefono != other.telefono){
            return false;
        }
        if(this.expediente != other.expediente){
            return false;
        }
        if(this.correo.equals(other.correo)){
            return false;
        }
        if(this.nombreMadre.equals(other.nombreMadre)){
            return false;
        }
        if(this.nombrePadre.equals(other.nombrePadre)){
            return false;
        }
        if(this.telPadre != other.telPadre){
            return false;
        }
        if(this.telMadre != other.telMadre){
            return false;
        }
        return true;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String dni){
        this.nombre=nombre;
    }
    
    
}
