import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        File directorio= new File("PrimerDirectorio/Segundo/Tercero");
        File fichero = new File("PrimerDirectorio/Segundo/Tercero/Michichero.txt");
        directorio.mkdir();
        fichero.createNewFile();

    }
}
