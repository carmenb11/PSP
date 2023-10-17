package Ejercicio03;

import java.io.*;

public class Act03 {
	
	    public static void main(String[] args) {
	        try {
	            // Crear un objeto File que referencie al directorio "bin"
	            File directorioBin = new File("C:\\Users\\carme\\eclipse-workspace_P_S_P\\EjerciciosTema1\\bin\\Ejercicio02"); // Reemplaza con la ruta correcta

	            // Comprobar si el directorio "bin" existe
	            if (!directorioBin.exists() || !directorioBin.isDirectory()) {
	                System.out.println("El directorio 'bin' no existe.");
	                return;
	            }

	            // Obtener la ruta completa del programa Java en el directorio "bin"
	            String rutaPrograma = directorioBin.getAbsolutePath() + File.separator + "Act02.java";

	            // Ejecutar el programa Java usando ProcessBuilder
	            ProcessBuilder pb = new ProcessBuilder("java", rutaPrograma);
	            Process proceso = pb.start();

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
	
