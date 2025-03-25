import java.util.ArrayList;

class CarritoCompras {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public double aplicarDescuento(double total) {
        return total > 1000 ? total * 0.9 : total;
    }

    public void finalizarCompra() {
        double total = calcularPrecioTotal();
        total = aplicarDescuento(total);
        System.out.println("Precio total final: $" + total);
    }
}