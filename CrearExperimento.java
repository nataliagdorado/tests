/*public static void crearExperimento(){
    System.out.println("A continuación introduce los datos del experimento que tendrá el id..." );

    String name = Interfaz.scanTexto("Nombre del experimento: ");
    int id = Interfaz.scanInt("ID del experimento:");
    System.out.print("Tienes que crear una población por defecto");
    String nop = Interfaz.scanTexto("Nombre de la poblacion:");
    int idP = Interfaz.scanInt("ID de la poblacion:");
    int numBacterias = Interfaz.scanInt("Numero de bacterias:");
    String fecha1= Interfaz.scanTexto("Fecha de inicio del cultivo:");
    String fecha2= Interfaz.scanTexto("Fecha de caducidad del cultivo:");
    String temperatura= Interfaz.scanDouble("Fecha de inicio del cultivo:");


    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce la luminosidad (ALTA, MEDIA, BAJA):");
    String luminosity = scanner.nextLine();
    Luminosidad luminosidad= Luminosidad.ALTA;
    switch(luminosity) {
        case "ALTA":
            luminosidad = Luminosidad.ALTA;
            break;
        case "MEDIA":
            luminosidad = Luminosidad.MEDIA;
            break;
        case "BAJA":
            luminosidad = Luminosidad.BAJA;
    }

    System.out.print("Introduce la dosis de comida: ");
    String dosis = scanner.nextLine();
    Dosis dosisComida = new Dosis(dosis);

    System.out.print("Datos introducidos del experimento nº" + contador);
    System.out.println("\nName: " + name);
    System.out.println("ID: " + id);
    System.out.println("Poblacion: " + nop);
    System.out.println("IDP: " + idP);
    System.out.println("NumBac: " + numBacterias);
    System.out.println("Fecha Inicio: " + fecha1);
    System.out.println("Fecha Fin: " + fecha2);
    System.out.println("Temperatura: " + temperatura);
    System.out.println("Luminosity: " + luminosity);
    System.out.println("Dosis: " + dosis);

    Poblacion poblacion = new Poblacion(nop, idP, numBacterias, fecha1, fecha2, temperatura, luminosidad, dosisComida);
    misExperimentos[contador] = new Experimento(name,id,misPoblaciones);
    contador++;
}
*/