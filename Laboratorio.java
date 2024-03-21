import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Laboratorio {
    private List<Experimento> experimento = new ArrayList<>();
    private int idE;

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public List<Experimento> getExperimento() {
        return experimento;
    }

    public void setExperimento(List<Experimento> experimento) {
        this.experimento = experimento;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "idE=" + idE +
                ", experimento=" + experimento +
                '}';
    }

    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Ingrese el nombre del experimento (o 'salir' para terminar):");
            String nombre = reader.readLine();

            while (!nombre.equalsIgnoreCase("salir")) {
                Experimento experimento = new Experimento(nombre);
                laboratorio.getExperimento().add(experimento);

                System.out.println("Experimento agregado: " + experimento);

                System.out.println("Ingrese el nombre del experimento (o 'salir' para terminar):");
                nombre = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Laboratorio finalizado: " + laboratorio);
    }
}

class Experimento {
    private String nombre;

    public Experimento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Experimento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void setExperimento(List<Experimento> experimento) {
        this.experimento = experimento;
        for (int i = 0; i < this.experimento.size(); i++) {
            if (experimento.get(i).getIdE() == i) {
                Experimento experimentoEnPosicionI = this.experimento.get(i);
                
                System.out.println("Valor en la posición " + i + ": " + experimentoEnPosicionI.getNombre());
            }
        }
    }
}
