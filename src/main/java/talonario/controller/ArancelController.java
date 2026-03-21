package talonario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import talonario.model.Arancel;
import talonario.service.ArancelService;

@RestController
@RequestMapping("/aranceles")
public class ArancelController {

    @Autowired
    private ArancelService service;

    @GetMapping
    public List<Arancel> listar(){
        return service.listar();
    }

    @PostMapping
    public Arancel guardar(@RequestBody Arancel arancel){
        return service.guardar(arancel);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}
