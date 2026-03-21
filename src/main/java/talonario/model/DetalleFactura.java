package talonario.model;

import jakarta.persistence.*;

@Entity
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private int cantidad;
    private double precio;
    private double subtotal;

    @ManyToOne
    @JoinColumn(name="factura_id")
    private Factura factura;

    public DetalleFactura(){}

    public Long getId(){ return id; }

    public String getProducto(){ return producto; }
    public void setProducto(String producto){ this.producto = producto; }

    public int getCantidad(){ return cantidad; }
    public void setCantidad(int cantidad){ this.cantidad = cantidad; }

    public double getPrecio(){ return precio; }
    public void setPrecio(double precio){ this.precio = precio; }

    public double getSubtotal(){ return subtotal; }
    public void setSubtotal(double subtotal){ this.subtotal = subtotal; }

    public Factura getFactura(){ return factura; }
    public void setFactura(Factura factura){ this.factura = factura; }
}