package talonario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import talonario.model.Factura;

public interface IFacturaRepository extends JpaRepository<Factura, Long> {

}
