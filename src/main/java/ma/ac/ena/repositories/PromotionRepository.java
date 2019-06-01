package ma.ac.ena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.ena.entities.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

}
