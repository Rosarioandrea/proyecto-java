package Productos;

public class Producto {
    private int id;
    private String titulo;
    private double precio;

    // Constructor
    public Producto(int id, String titulo, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
    }
}
