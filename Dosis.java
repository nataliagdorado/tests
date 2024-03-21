import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dosis {
    private double cantidadInicial;
    private int diaIncremento;
    private double cantidadMaxima;
    private int diaFinal;

    public static void main(String[] args) {
        Dosis dosis = new Dosis();
        
        // Solicitar al usuario que introduzca los valores
        System.out.print("Para alimentar las bacterias es necesario introducir los datos en gramos de las dosis de alimento\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Introduce los gramos con los que hay que alimentar la población el día 1:\n");
            dosis.setCantidadInicial(Double.parseDouble(reader.readLine()));
            System.out.print("Introduce el día (1-30) en el que debe parar de incrementarse la cantidad de alimento:\n");
            dosis.setDiaIncremento(Integer.parseInt(reader.readLine()));
            System.out.print("Introduce la cantidad maxima (en gramos) hasta la que debe incrementarse:");
            dosis.setCantidadMaxima(Double.parseDouble(reader.readLine()));
            System.out.print("Introduce el día (1-30) en el que termina el experimento:");
            dosis.setDiaFinal(Integer.parseInt(reader.readLine()));
            
            reader.close();

            dosis.imprimirDosis();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imprimirDosis() {
        System.out.print("Los datos introducidos son:\n");
        System.out.println("Cantidad Inicial: " + getCantidadInicial());
        System.out.println("Cantidad Máxima: " + getCantidadMaxima());
        System.out.println("Día de Incremento: " + getDiaIncremento());
        System.out.println("Día Final: " + getDiaFinal());
        System.out.print("A continuacion se hace el cálculo de la dosis de cada día:\n");
        double subir;
        double bajar;
        subir= mediaAritmetica1 (getDiaIncremento(), getCantidadInicial(), getCantidadMaxima());
        bajar= mediaAritmetica2 (getDiaIncremento(), getCantidadInicial(), getCantidadMaxima(), getDiaFinal());

        System.out.println("La media aritmética es: " + subir);
        for (int i = 1; i <= getDiaFinal(); i++) {
            if (i == 1) {
                System.out.println("Día " + i + ": " + String.format("%.2f", getCantidadInicial()));
            } else if (i < getDiaIncremento()) {
                setCantidadInicial(getCantidadInicial() + subir);
                System.out.println("Día " + i + ": " + String.format("%.2f", getCantidadInicial()));
            } else if (i == getDiaIncremento()) {
                System.out.println("Día " + i + ": " + String.format("%.2f", getCantidadMaxima()));
            } else {
                setCantidadMaxima(getCantidadMaxima() - bajar);
                System.out.println("Día " + i + ": " + String.format("%.2f", getCantidadMaxima()));
            }
        }

    }

    private double mediaAritmetica1(int dia, double cInicial, double cMax){
        double media = (cMax - cInicial) / (dia - 2);
        return media;
    }
    private double mediaAritmetica2(int dia, double cInicial, double cMax, double diaF){
        double media = (cMax - cInicial) / (diaF - dia);
        return media;
    }

    // Getters and Setters
    public double getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(double cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public int getDiaIncremento() {
        return diaIncremento;
    }

    public void setDiaIncremento(int diaIncremento) {
        this.diaIncremento = diaIncremento;
    }

    public double getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getDiaFinal() {
        return diaFinal;
    }

    public void setDiaFinal(int diaFinal) {
        this.diaFinal = diaFinal;
    }
}