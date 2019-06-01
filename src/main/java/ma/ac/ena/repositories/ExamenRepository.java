package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

}
