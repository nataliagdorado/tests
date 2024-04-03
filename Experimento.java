

import java.util.ArrayList;
import java.util.Scanner;

public class Experimento {
    private String nombreE;
    private int idE;
//    Poblacion poblaciones = new Poblacion();

//    private static List<Poblacion> poblaciones = new ArrayList<>();
//    // Método para agregar poblaciones
//    public static void addPoblacion(Poblacion poblacion) {
//        poblaciones.add(poblacion);
//    }

    // Método para obtener poblaciones
//    public static List<Poblacion> getPoblaciones() {
//        return poblaciones;
//    }

    // Este constructor nos permite crear un vehiculo el cual va a contener inmediatamente
    // todas sus variables asignadas.


//    public static List<Poblacion> getPoblaciones() {
//        return poblaciones;
//    }
    public Experimento(String nombreE, int idE){
        this.nombreE = nombreE;
        this.idE = idE;
//        this.poblaciones = new ArrayList<>();

    }
//
//    public static void addPoblacion(Poblacion poblacion) {
//        poblaciones.add(poblacion);
//    }

//    public static void setPoblaciones(List<Poblacion> poblaciones) {
//        Experimento.poblaciones = poblaciones;
//    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public int getIdE() {
        return idE;
    }


    public static void crearExperimento(ArrayList<Experimento> Laboratorio){
        ArrayList<Experimento> misExperimentos=new ArrayList<Experimento>();

        if (Laboratorio!=null) {
            misExperimentos=Laboratorio;
        }

        String opcion;
        String nombreE = ""; // Initialize the nombreE variable
        int id = 0;
        misExperimentos.add(new Experimento(nombreE, ++id));

       

        crearExperimento(misExperimentos);
        Menu m=new Menu();

        Menu.menu(misExperimentos);
    }
}