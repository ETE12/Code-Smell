public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("Laptop", 1200, Categoria.ELECTRONICA));
        carrito.agregarProducto(new Producto("Mouse", 20, Categoria.ACCESORIOS));

        carrito.finalizarCompra();
    }
}