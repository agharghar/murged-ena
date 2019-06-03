package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.ena.entities.Version;

public interface VersionRepository extends JpaRepository<Version, Integer>{

}
