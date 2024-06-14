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
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        //Mostrar las opciones
        System.out.println("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion proporcionada
        switch (opcion) {
            case 1: { //Agregar persona a la lista
                System.out.println("Proporciona el nombre: ");
                var nombre = consola.nextLine();

                System.out.println("Proporciona el telefono: ");
                var tel = consola.nextLine();

                System.out.println("Proporciona el email: ");
                var email = consola.nextLine();

                //Crear el objeto persona
                var persona = new Persona(nombre, tel, email);
                // lo agreagamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + "elementos");
                break;
            }// Fin caso 1

            case 2: { //Listar las personas
                System.out.println("Listado de Personas");
                //Mejorando usando lamda y metodo referencia
                personas.forEach(System.out::println);
                break;
            }

            case 3: { //Salimos del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default:
                System.out.println("Opcion erronea: " + opcion);
                break;
        }//Fin swithc
        return salir;
    }


}