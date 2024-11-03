public class Producto {
    private String nombre;
    private double precio;

    // Constructor que utiliza "this" para diferenciar entre atributos y parámetros
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + this.nombre + ", Precio: " + this.precio);
    }
}
