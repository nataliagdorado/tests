import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date {
    private int dia;
    private int mes;
    private int anio;

    public void obtenerFecha() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce la fecha (dd/mm/aaaa): ");
        String fechaIngresada = reader.readLine();
        String[] partesFecha = fechaIngresada.split("/");
        if (partesFecha.length == 3) {
            dia = Integer.parseInt(partesFecha[0]);
            mes = Integer.parseInt(partesFecha[1]);
            anio = Integer.parseInt(partesFecha[2]);
        } else {
            System.out.println("Formato de fecha incorrecto");
        }
    }
/*
 * Este método devuelve la fecha en formato de texto y desde entonces trabajo con la fecha en formato texto
 */
    public String obtenerFechaTexto() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }

    public static void main(String[] args) throws IOException {
        Date date = new Date();
        date.obtenerFecha();
        System.out.println("Fecha ingresada: " + date.obtenerFechaTexto());
    }
}
