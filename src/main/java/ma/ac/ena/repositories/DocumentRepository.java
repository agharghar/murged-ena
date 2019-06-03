package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.ena.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer>{
	
	Document findBynomFichier(String nomFichier) ; 

}
