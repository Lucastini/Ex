/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author AlumnoLocal
 */
public class ExcepcionDivisionSobre0 extends Exception{
    
    public String getMessage()
    {
        return "No se puede realizar la división sobre 0";
    }
    
}