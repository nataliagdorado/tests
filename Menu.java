import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(ArrayList<Experimento> laboratorio) {

        Scanner entrada = new Scanner(System.in);

//        Experimento misExperimentos=new Experimento();

        boolean salir = false;
        System.out.println("BIENVENIDO AL LABORATORIO DE BACTERIAS");

        while (!salir) {
            System.out.println("Menu principal. Opciones:");
            System.out.println("1. Añadir experimentos");
            System.out.println("2. Ver experimentos y sus poblaciones");
            System.out.println("3. Borrar experimentos y sus poblaciones");
            System.out.println("4. Actualizar experimentos y sus poblaciones");
            System.out.println("5. Salir del programa");
            System.out.print("Introduce el número de opción: ");
            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    Experimento.crearExperimento(laboratorio);

//                    while (true) {
//                        Scanner scanner = new Scanner(System.in);
//                        System.out.println("¿Quieres crear un población en este experimento? (S/N):");
//                        String respuesta = scanner.nextLine().trim().toUpperCase();
//                        if (respuesta.equals("N")) {
//                            break;
//                        }
//                    }

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("ERROR");
            }
        }

        entrada.close();
    }

}
