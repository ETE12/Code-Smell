import java.util.ArrayList;

class CarritoCompras {
    ArrayList<Producto> productos = new ArrayList<>();
    double precioTotal = 0;

    public void agregarProducto(Producto p) {
        productos.add(p);
        precioTotal += p.precio;
    }

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).nombre.equals(nombre)) {
                precioTotal -= productos.get(i).precio;
                productos.remove(i);
                break;
            }
        }
    }

    public void finalizarCompra() {
        if (precioTotal > 1000) {
            System.out.println("Aplicando descuento...");
            precioTotal *= 0.9;
        }
        System.out.println("Precio total: " + precioTotal);
    }
}