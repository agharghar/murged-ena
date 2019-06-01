package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Devoir;

@Repository
public interface DevoirRepository extends JpaRepository<Devoir, Integer> {

}
