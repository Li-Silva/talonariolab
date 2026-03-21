package talonario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import talonario.model.DetalleFactura;

public interface IDetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {

}