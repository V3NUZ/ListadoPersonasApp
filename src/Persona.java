public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numPersonas = 0;

    // Constructor vacio
    public Persona() {
        this.id = ++ Persona.numPersonas;
    }

    // Constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this(); // Se llama el constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

}
