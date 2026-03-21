package talonario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import talonario.model.Arancel;

@Repository
public interface IArancelesRepository extends JpaRepository<Arancel, Long> {

}