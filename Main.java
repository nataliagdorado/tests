/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Experimento> misExperimentos = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("  LA OPCION ");
            System.out.println(" 1 - crear  ");
            System.out.println(" 2 - Listar ");
            System.out.println(" 3 - Eliminar  ");
            System.out.println(" 4 - Modificar  ");
            System.out.println(" 0 - Salir ");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    Experimento a = new Experimento();

                    System.out.println("Ingrese el nombre:");
                    a.setNombreE(entrada.nextLine());
                    System.out.println("Id");
                    a.setIdE(Integer.parseInt(entrada.nextLine()));

                    misExperimentos.add(a);

                    System.out.println("EXPERIMENTO CREADO: ");
                    System.out.println("Nombre " + a.getNombreE());
                    System.out.println("Id " + a.getIdE());
                    break;
                case 2:
                    for (int i = 0; i < misExperimentos.size(); i++) {
                        System.out.println("Exp: " + (i + 1));
                        Experimento b = misExperimentos.get(i);
                        System.out.println("Nombre " + b.getNombreE());
                        System.out.println("Id " + b.getIdE());
                    }
                    break;
                case 3:
                    System.out.println("Nombre del experiento a borrar: ");
                    String name = entrada.nextLine();

                    for (int i = 0; i < misExperimentos.size(); i++) {
                        Experimento b = misExperimentos.get(i);
                        if (name.equals(b.getNombreE())) {
                            misExperimentos.remove(i);
                            System.out.println("Experimento eliminado");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nombre a modificar");
                    name = entrada.nextLine();

                    for (int i = 0; i < misExperimentos.size(); i++) {
                        Experimento b = misExperimentos.get(i);
                        if (name.equals(b.getIdE())) {
                            System.out.println("nombre: " + b.getNombreE());
                            System.out.println("Id: " + b.getIdE());
                            System.out.println("nuevo nombre: ");
                            String nuevonombre = entrada.nextLine();
                            b.setNombreE(nuevonombre);
                        }
                    }
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida!!!!!!!");
            }
        }

        entrada.close();
    }
}*/