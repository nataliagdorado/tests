import java.util.Scanner;

public class Dosis {
    double cantidadInicial;
    int diaIncremento;
    double cantidadMaxima;
    int diaFinal;

    public static void main(String[] args) {
        Dosis dosis = new Dosis();
        
        // Solicitar al usuario que introduzca los valores
        System.out.print("Para alimentar las bacterias es necesario introducir los datos en gramos de las dosis de alimento\n");
        Scanner scanner = new Scanner(System.in);
           
            System.out.print("Introduce los gramos con los que hay que alimentar la población el día 1:\n");
            dosis.cantidadInicial = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Introduce el día (1-30) en el que debe parar de incrementarse la cantidad de alimento:\n");
            dosis.diaIncremento = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Introduce la cantidad maxima (en gramos) hasta la que debe incrementarse  el alimento el día " + dosis.diaIncremento);
            dosis.cantidadMaxima = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Introduce el día (1-30) en el que termina el experimento");
            dosis.diaFinal = scanner.nextInt();
            scanner.close();
            
            dosis.imprimirDosis();
        }

    public void imprimirDosis() {
        System.out.print("Los datos introducidos son:\n");
        System.out.println("Cantidad Inicial: " + cantidadInicial);
        System.out.println("Cantidad Máxima: " + cantidadMaxima);
        System.out.println("Día de Incremento: " + diaIncremento);
        System.out.println("Día Final: " + diaFinal);
        System.out.print("A continuacion se hace el cálculo de la dosis de cada día:\n");
        double subir;
        double bajar;
        subir= mediaAritmetica1 (diaIncremento, cantidadInicial, cantidadMaxima);
        bajar= mediaAritmetica2 (diaIncremento, cantidadInicial, cantidadMaxima, diaFinal);

        System.out.println("La media aritmética es: " + subir);
        for (int i = 1; i <= diaFinal; i++) {
            if (i == 1) {
                System.out.println("Día " + i + ": " + cantidadInicial);
            }
            else if (i < diaIncremento) {
                cantidadInicial = cantidadInicial + subir;
                System.out.println("Día " + i + ": " + cantidadInicial);
            } 
            else if (i == diaIncremento) {
                System.out.println("Día " + i + ": " + cantidadMaxima);
            }
            else {

                cantidadMaxima = cantidadMaxima - bajar;
                System.out.println("Día " + i + ": " + cantidadMaxima);
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
}