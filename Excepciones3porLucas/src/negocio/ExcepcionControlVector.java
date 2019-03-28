
package negocio;

public class ExcepcionControlVector extends Exception {
    private int codigo;
    
    public ExcepcionControlVector(int codErr){
        codigo=codErr;
    }
    
    @Override
    public String getMessage(){
        String res;
        switch(codigo){
            case 1: 
                res="Error: el tamaño ingresado para el vector debe ser mayor a cero";
                break;
            case 2: 
                res="Error: intenta acceder a una posicion inexistente del vector";
                break;
            case 3:
                res="Error: dato ingresado erroneo, debe ingresar solo numeros enteros";
                break;
            default:
                res="Error: otro";
        }
        return res;            
    }
    
    
    
}
