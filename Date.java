import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Date {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la fecha de inicio del experimento (dd-mm-aaaa): ");
        DateTimeFormatter fechaEnEspanol = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            String input = reader.readLine();

            LocalDate date = null;
            boolean numeroValido = false;
            while (!numeroValido) {
                try {
                    date = LocalDate.parse(input, fechaEnEspanol);
                    numeroValido = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de fecha incorrecto. Introduce una fecha en el formato dd-mm-aaaa.");
                    System.out.print("Introduce una fecha (dd-mm-aaaa): ");
                    input = reader.readLine();
                }
            }

            int daysToAdd = 0;
            numeroValido = false;
            while (!numeroValido) {
                System.out.print("Introduce el número de días que dura el experimento (máximo 30 días): ");
                try {
                    daysToAdd = Integer.parseInt(reader.readLine());
                    if (daysToAdd <= 30) {
                        numeroValido = true;
                    } else {
                        System.out.println("Error: El número de días debe ser máximo 30.");
                    }
                } catch (NumberFormatException | IOException e) {
                    System.out.println("Error: Introduce un número válido.");
                }
            }

            LocalDate newDate = date.plusDays(daysToAdd);

            DateTimeFormatter fechaEnEspanolOutput = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = date.format(fechaEnEspanolOutput);
            String formattedNewDate = newDate.format(fechaEnEspanolOutput);

            System.out.println("Fecha introducida: " + formattedDate);
            System.out.println("Fecha en el que termina este experimento que dura " + daysToAdd + " días: " + formattedNewDate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}