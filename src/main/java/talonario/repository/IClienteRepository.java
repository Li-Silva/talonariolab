package talonario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import talonario.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
