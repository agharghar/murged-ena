package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Niveau;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, String>{
		
}