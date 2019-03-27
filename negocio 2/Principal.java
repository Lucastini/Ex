/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Scanner;

/**
 *
 * @author AlumnoLocal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,div;
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese el numerador: ");
        n1=in.nextInt();
        System.out.println("Ingrese el denominador: ");
        n2=in.nextInt();
        try
        {
            if(n2==0)
            {
                throw new ExcepcionDivisionSobre0();
            }
            else
            {
                div=n1/n2;
                System.out.println("El resultado de la división es: "+div);
            }
        }
        catch(ExcepcionDivisionSobre0 miExcepcion)
        {
            System.out.println(miExcepcion.getMessage());
        }
        
    }
    
}
