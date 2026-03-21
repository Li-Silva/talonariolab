package talonario.model;

import jakarta.persistence.*;

@Entity
public class Arancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String concepto;
    private double precio;

    public Arancel(){}

    public Long getId(){ return id; }

    public String getConcepto(){ return concepto; }
    public void setConcepto(String concepto){ this.concepto = concepto; }

    public double getPrecio(){ return precio; }
    public void setPrecio(double precio){ this.precio = precio; }
}
