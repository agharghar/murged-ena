package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Rattrapage;

@Repository
public interface RattrapageRepository extends JpaRepository<Rattrapage, Integer> {

}
