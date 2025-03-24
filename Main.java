public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("Laptop", 1200, "Electrónica"));
        carrito.agregarProducto(new Producto("Mouse", 20, "Accesorios"));
        carrito.finalizarCompra();
    }
}