
package distancia;

import java.util.*;
public class Operaciones {
    public Operaciones(){
        
    }
    public static double distancia (double coordenada1, double coordenada2, double coordenada3, double coordenada4){
        double distancia = 0;
        
        double resta1 = (coordenada2-coordenada1)*(coordenada2-coordenada1);
        double resta2 = (coordenada4-coordenada3)*(coordenada4-coordenada3);
        
        distancia = Math.sqrt(resta1+resta2);
        
        return distancia;
    }
    public boolean login(String user, String pass){
        boolean access = false;
        
        if(user.equals("Carol")&&pass.equals("Contraseña")){
            access = true;
        }
        
        return access;
    }
}
