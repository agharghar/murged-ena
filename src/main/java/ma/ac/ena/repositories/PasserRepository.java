package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Passer;

@Repository
public interface PasserRepository extends JpaRepository<Passer, Integer> {

}
