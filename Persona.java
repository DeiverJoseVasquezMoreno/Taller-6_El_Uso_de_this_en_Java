// public class Persona {
//     private String nombre;

//     // Método estático que intenta usar "this" (causará un error de compilación)
//     public static void mostrarNombre() {
//         System.out.println(this.nombre); // Error: Cannot use this in a static context
//     }
// }


public class Persona {
    private String nombre;

    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}
