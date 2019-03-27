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
        Scanner in=new Scanner(System.in);
        int tam,pos=0;
        int vec[];
        
        System.out.println("Ingrese el tamaño del vector: ");
        tam=in.nextInt();
        try
        {
            if(tam<=0)
            {
                throw new ExcepcionControlVector(1);
            }
            else
            {
                vec=new int[tam];
            
                for(int i=0;i<vec.length;i++)
                {
                    vec[i]=(int)Math.random()*10+1;
                }
                System.out.println("Ingrese alguna posición para la que desea ver el número: ");
                pos=in.nextInt();
                if(pos<0 || pos>=vec.length)
                {
                    throw new ExcepcionControlVector(2);
                }
                else
                    System.out.println("Valor en la posición ["+pos+"] = "+vec[pos]);
            }
        }
        catch(ExcepcionControlVector e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
