
package negocio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int tam, pos, vec[];
        try{
            System.out.println("Ingrese tamaño del vector:");
            tam=in.nextInt();
            if(tam<1)
                throw new ExcepcionControlVector(1);
            else{
                vec=new int[tam];
                for(int i=0;i<vec.length;i++){
                    vec[i]=(int)(Math.random()*10+1);
                    System.out.println("El valor en la posicion "+i+" es: "+vec[i]);
                }
            }
            System.out.println("Ingrese el indice de la posicion del vector cuyo valor quiere conocer:");
            pos=in.nextInt();
            if(pos>vec.length||pos<0)
                throw new ExcepcionControlVector(2);
            System.out.println("El valor presente en la posicion "+pos+" es: "+vec[pos]);
        }
        catch(ExcepcionControlVector e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(new ExcepcionControlVector(3).getMessage());
        }
        
        System.out.println("Fin del programa");
        

    }
    
}
