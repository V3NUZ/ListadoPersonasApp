import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Definimos la lsita fuera del ciclo
        List<Persona> personas = new ArrayList<>();

        //Menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();
        }
    }

    private static void mostrarMenu(){
        //Mostrar las opciones
        System.out.println("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion: ");

    }
}