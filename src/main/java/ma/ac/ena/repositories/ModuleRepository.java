package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {

}
