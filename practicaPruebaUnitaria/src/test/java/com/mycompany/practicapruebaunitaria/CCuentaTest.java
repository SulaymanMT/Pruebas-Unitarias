/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicapruebaunitaria;



import org.junit.jupiter.api.Test;
import junit.framework.TestCase;


/**
 *
 * @author Sulayman
 */
public class CCuentaTest extends TestCase{
   
    CCuenta instance = new CCuenta("Juan Lopez","1000-2365-85-123456789",2500,0);
    public CCuentaTest(String testName) {
        super(testName);
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRitrar() throws Exception{
        System.out.println("Prueba del metodo Retirar");
        double cantidad =1000.00;
        instance.retirar(cantidad);
        assertEquals("debe dar 1500 (2500 que tenia menos 1000 que se retiran)",1500.0,instance.estado());
        assertNotNull("deberia tener valor",instance.estado());
    }
    public void testIngresar() throws Exception{
        System.out.println("Prueba del metodo Retirar");
        double cantidad2 =250;
        instance.ingresar(cantidad2);
        assertEquals("debe dar 2750 (2500 que tenia mas 250 que se ingresan)",2750.0,instance.estado());
        assertNotNull("deberia tener valor",instance.estado());
    }


   

}
