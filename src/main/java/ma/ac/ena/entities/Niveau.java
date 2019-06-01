package ma.ac.ena.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="niveau")
public class Niveau {
	
	@Id
	@Column(name="idNiveau")
	private String idNiveau;
	
	@Column(name="libelleNiveau")
	private String libelleNiveau;
	
	@OneToMany(mappedBy="pk.niveau",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Inscription> inscriptions = new HashSet<>();
	

	@OneToMany(mappedBy="cont.niveau",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Contenir> contenir = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="idFiliere")
	private Filiere filiere;
	
	public Niveau() {
		super();
	}

	public Niveau(String idNiveau, String libelleNiveau) {
		super();
		this.idNiveau = idNiveau;
		this.libelleNiveau = libelleNiveau;
	}

	public String getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(String idNiveau) {
		this.idNiveau = idNiveau;
	}
	
	public String getLibelleNiveau() {
		return libelleNiveau;
	}
	
	public void setLibelleNiveau(String libelleNiveau) {
		this.libelleNiveau = libelleNiveau;
	}

	public Set<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
		
}
