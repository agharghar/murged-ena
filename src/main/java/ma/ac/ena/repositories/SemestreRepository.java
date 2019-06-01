package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Semestre;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Integer> {

}
