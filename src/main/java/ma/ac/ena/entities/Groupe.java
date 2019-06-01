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
@Table(name="Groupe")
public class Groupe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idGroupe")
	private int idGroupe;
	
	@OneToMany(mappedBy="pk.groupe",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Inscription> inscriptions = new HashSet<>();

	public Groupe() {
		super();
	}

	public Groupe(int idGroupe, Set<Inscription> inscriptions) {
		super();
		this.idGroupe = idGroupe;
		this.inscriptions = inscriptions;
	}

	public Set<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
}
