package ma.ac.ena.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Matiere;

@Repository
public interface MatiereRepository extends CrudRepository<Matiere, Integer> {

}
