package talonario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talonario.model.DetalleFactura;
import talonario.model.Factura;
import talonario.repository.IFacturaRepository;

@Service
public class FacturaService {

    @Autowired
    private IFacturaRepository repository;

    public List<Factura> listar(){
        return repository.findAll();
    }

    public Factura guardar(Factura factura){

        double total = 0;

        for(DetalleFactura d : factura.getDetalles()){
            d.setSubtotal(d.getCantidad() * d.getPrecio());
            d.setFactura(factura);
            total += d.getSubtotal();
        }

        factura.setTotal(total);

        return repository.save(factura);
    }
}