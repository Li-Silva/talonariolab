package talonario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import talonario.model.Factura;
import talonario.service.FacturaService;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService service;

    @GetMapping
    public List<Factura> listar(){
        return service.listar();
    }

    @PostMapping
    public Factura guardar(@RequestBody Factura factura){
        return service.guardar(factura);
    }
}
