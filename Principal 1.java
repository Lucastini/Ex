/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Scanner;
import java.util.InputMismatchException;

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
        Scanner in=new Scanner(System.in);
        int n1=0,n2=1;
        float div;
        
        try{
            System.out.println("Ingrese el primer número: ");
            n1=in.nextInt();
            System.out.println("Ingrese el segundo número: ");
            n2=in.nextInt();
            if(n2>0)
            {
                div=(float)n1/n2;
                System.out.println("La división es: "+div);
            }
            else
                System.out.println("No se puede dividir sobre 0");
        }
        catch(InputMismatchException e){
            System.out.println("¡Sólo debe ingresar números!");
            //System.out.println(e.toString());
        }
        finally{
            System.out.println("Fin del programa");
        }
        
        int vec[];
        vec=new int[10];
        for(int i=0;i<20;i++)
            vec[i]=0;
        
    }
    
}
