
package archivos;
import java.io.File;

public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File B = new File("C:\\DATOS.txt");
        boolean resp1 = B.exists();
        boolean respLectura = B.canRead();
        boolean respEscritura = B.canWrite();
        System.out.println("El archivo existe?"+resp1);
        System.out.println("Se puede leer el archivo?"+respLectura);
        System.out.println("Se puede escribir en el archivo?"+respEscritura);
    }
    
}
