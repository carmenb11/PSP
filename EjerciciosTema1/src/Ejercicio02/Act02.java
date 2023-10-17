package Ejercicio02;
import java.io.*;
public class Act02 {
	
	    public static void main(String[] args) {
	        try {
	            // Crear un proceso que ejecute el comando "cmd /c dir"
	            Process proceso = Runtime.getRuntime().exec("cmd /c dir");

	            // Obtener el InputStream del proceso para leer la salida
	            InputStream inputStream = proceso.getInputStream();

	            // Crear un InputStreamReader para leer caracteres desde el InputStream
	            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

	            // Crear un BufferedReader para leer líneas completas de texto
	            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	            // Leer y mostrar la salida línea por línea
	            String linea;
	            while ((linea = bufferedReader.readLine()) != null) {
	                System.out.println(linea);
	            }

	            // Cerrar el BufferedReader
	            bufferedReader.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


