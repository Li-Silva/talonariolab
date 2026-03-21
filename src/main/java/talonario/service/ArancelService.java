package talonario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talonario.model.Arancel;
import talonario.repository.IArancelesRepository;

@Service
public class ArancelService {

    @Autowired
    private IArancelesRepository repository;

    public List<Arancel> listar(){
        return repository.findAll();
    }

    public Arancel guardar(Arancel arancel){
        return repository.save(arancel);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
