package edu.comillas.icai.gitt.pat.spring.mvc.modelo;

public class Carrito {
    private int idcarrito;
    private int idarticulo;
    private String descripcion;
    private int unidades;
    private double precioFinal;

    public Carrito(int idcarrito, int idarticulo, String descripcion, int unidades, double precioFinal) {
        this.idcarrito = idcarrito;
        this.idarticulo = idarticulo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precioFinal = precioFinal;
    }

    public int getIdcarrito() {
        return idcarrito;
    }

    public void setIdcarrito(int idcarrito) {
        this.idcarrito = idcarrito;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
