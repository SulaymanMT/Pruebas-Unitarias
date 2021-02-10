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
public class CLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objetos de clase direccion
        Direccion dir1 = new Direccion("Av Africa",13,2,"B1",51002);
        Direccion dir2 = new Direccion("Av Madrid",9,0,"1",51001);
        Direccion dir3 = new Direccion("Av Malaga",10,4,"H4",51002);
         Direccion[] direcciones = new Direccion[3] ;
        //objeto de clase Alumno
        Alumno a1 = new Alumno();
        a1.setDni("12345679Q");
        a1.setNombre("Moha");
        a1.setApellido1("MOHAMED");
        a1.setApellido2("ALÍ");
        a1.setCorreo("sulayman@sulay.man");
        a1.setEdad(16);
        a1.setExpediente(100732);
        a1.setTelefono(615121521);
        a1.setNombrePadre("MOHAMED");
        a1.setNombreMadre("FATIMA");
        
        //objeto de clase Matricula
        Matricula m1 = new Matricula();
        m1.setIdentificador(1234548588);
        m1.setTurno("Dia");
        m1.setEstado("Alta");
        
      
        
        System.out.println(m1.toString());
        System.out.println(a1.toString());
        
        
        System.out.println(dir1.toString());
        System.out.println(dir2.toString());
        System.out.println(dir3.toString());
        
    }
    
}
