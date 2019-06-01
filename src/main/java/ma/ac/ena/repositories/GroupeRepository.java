package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Integer> {

}
