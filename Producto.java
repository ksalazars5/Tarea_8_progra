package Tarea_No_8;

public class Producto {
    int identificador;
    String nombreProducto;
    double precio;

    public Producto(int identificador, String nombreProducto, double precio) {
        this.identificador = identificador;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }


}
