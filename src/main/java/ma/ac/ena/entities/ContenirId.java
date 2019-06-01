package ma.ac.ena.entities;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ContenirId implements Serializable {

	@ManyToOne
	@JoinColumn(name="idFiliere")
	private Filiere filiere;
	
	@ManyToOne
	@JoinColumn(name="idNiveau")
	private Niveau niveau;

	public ContenirId() {
		super();
	}

	public ContenirId(Filiere filiere, Niveau niveau) {
		super();
		this.filiere = filiere;
		this.niveau = niveau;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
}
