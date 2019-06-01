package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Comporter;
import ma.ac.ena.entities.ComporterId;

@Repository
public interface ComporterRepository extends JpaRepository<Comporter, ComporterId> {

}
