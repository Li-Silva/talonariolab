package talonario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talonario.model.Cliente;
import talonario.repository.IClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository repository;

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente guardar(Cliente cliente){
        return repository.save(cliente);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
