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
public class ExcepcionControlVector extends Exception{
   private int codigo;
   
   public ExcepcionControlVector(int codEr)
   {
       codigo=codEr;
   }
   
   public String getMessage()
   {
       String mensaje="";
       switch(codigo)
       {
           case 1: mensaje="Error por tamaño incorrecto del vector";
                   break;
           case 2: mensaje="Error por intentar acceder a una posición no válida del vector";
                   break;
           default:mensaje="Otro error en el manejo del vector";
       }
       return mensaje;
   }
    
}
