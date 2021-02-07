/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Arrays;

/**
 *
 * @author Sulayman
 */
public class Matricula {
    long identificador;
    Alumno[] alumno;
    String turno;
    String estado;
    
    public Matricula(){
        
    }
    
    public Matricula (long id, Alumno[] alumno, String turno, String estado){
        this.identificador = id;
        this.alumno = alumno;
        this.turno = turno;
        this.estado = estado;
    }
    
    //ToSTRING
    
    /**
     *
     * @return
     */
    @Override
    
    public String toString(){
        return identificador+Arrays.toString(alumno)+turno+estado;
    }
    
    //EQUALS
    public boolean equals(Matricula other){
        if(this.identificador != other.identificador){
            return false;
        }
        if(Arrays.equals(this.alumno ,other.alumno)){
            return false;
        }
        if(this.turno.equals(turno)){
            return false;
        }
        if(this.estado.equals(estado)){
            return false;
        }
        return true;
    }
    
    //GETTERS y SETTERS
    
    public long getIdentificador(){
        return identificador;
    }
    public void setIdentificador(long identificador){
        this.identificador = identificador;
    }
    public Alumno[] getAlumno(){
        return alumno;
    }
    
    
}
