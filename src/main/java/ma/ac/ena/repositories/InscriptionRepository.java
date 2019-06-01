package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Inscription;
import ma.ac.ena.entities.InscriptionId;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, InscriptionId> {

}
