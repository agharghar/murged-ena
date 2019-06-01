package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Filiere;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Integer> {

}
