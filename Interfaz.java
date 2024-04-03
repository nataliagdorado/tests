import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interfaz {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String scanTexto(String dato) throws IOException {
        System.out.print(dato);
        return reader.readLine();
    }

    public static int scanInt(String dato) throws IOException {
        System.out.print(dato);
        return Integer.parseInt(reader.readLine());
    }

    public static int scanInt(int dato) throws IOException {
        System.out.print(dato);
        return Integer.parseInt(reader.readLine());
    }

    public static double scanDouble(int dato) throws IOException {
        System.out.print(dato);
        return Double.parseDouble(reader.readLine());
    }

    public static double scanDoubleS(String dato) throws IOException {
        System.out.print(dato + " ");
        return Double.parseDouble(reader.readLine());
    }
}
