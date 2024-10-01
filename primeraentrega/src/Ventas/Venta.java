package Ventas;

import java.util.Date;

public class Venta {
    private Cliente cliente;
    private Producto producto;
    private Date fecha;
    private int cantidad;

    // Constructor
    public Venta(Cliente cliente, Producto producto, Date fecha, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    // Método para calcular el total de la compra
    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Venta [cliente=" + cliente.getNombre() + ", producto=" + producto.getTitulo() +
                ", cantidad=" + cantidad + ", total=" + calcularTotal() + "]";
    }
}
