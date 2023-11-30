package Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ManejoTXT {

    // Método para leer un archivo de texto y mostrar su contenido
    public static List<DatosTeams> cargarDatosDesdeArchivo(String rutaArchivo) {
        List<DatosTeams> equipos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 4) {
                    String codigo = datos[0];
                    String team = datos[1];
                    int ranking = Integer.parseInt(datos[2]);
                    String imageFileName = datos[3];
                    DatosTeams equipo = new DatosTeams(team, ranking, imageFileName);
                    equipos.add(equipo);
                } else {
                    System.out.println("Formato incorrecto en la línea: " + linea);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return equipos;
    }

    // Método para escribir en un archivo de texto
    public  void escribirArchivo(String nombreArchivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write(contenido);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
