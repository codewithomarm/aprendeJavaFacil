package com.codewithomar.clase8.producto;

//Clase POJO que almacena la info de un Producto
public class Producto {
    //Declaración de atributos
    private long id;
    private String detalle;
    private double precioUnitario;
    private int cantidad;

    //Método Constructor vacío
    public Producto() {
    }

    //Método Constructor con parámetros
    public Producto(long id, String detalle,
                    double precioUnitario, int cantidad){
        this.id = id;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    //Método Getter atributo id
    public long getId() {
        return id;
    }

    //Método Setter atributo id
    public void setId(long id) {
        this.id = id;
    }

    //Método Getter atributo detalle
    public String getDetalle() {
        return detalle;
    }

    //Método Setter atributo detalle
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    //Método Getter atributo precioUnitario
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    //Método Setter atributo precioUnitario
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    //Método Getter atributo cantidad
    public int getCantidad() {
        return cantidad;
    }

    //Método Setter atributo cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /* Método toString para mostrar la info
     * del producto por consola */
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", detalle='" + detalle + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                '}';
    }
}
