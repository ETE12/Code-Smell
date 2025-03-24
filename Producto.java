
class Producto {
    String nombre;
    double precio;
    String categoria;
    
    public Producto(String n, double p, String c) {
        nombre = n;
        precio = p;
        categoria = c;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Categoría: " + categoria);
    }
}