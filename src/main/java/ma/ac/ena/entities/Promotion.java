package ma.ac.ena.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Promotion")
public class Promotion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPromotion")
	private int idPromotion;
	
	@Column(name="anneeScolaire")
	private String anneeScolaire;
	
	@OneToMany(mappedBy="pk.promotion",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Inscription> inscriptions = new HashSet<>();

	public Promotion() {
		super();
	}

	public Promotion(int idPromotion, Set<Inscription> inscriptions) {
		super();
		this.idPromotion = idPromotion;
		this.inscriptions = inscriptions;
	}

	public Set<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public int getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
}
