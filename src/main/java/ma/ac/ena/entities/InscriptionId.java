package ma.ac.ena.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class InscriptionId implements Serializable{

	@ManyToOne
	@JoinColumn(name="idEtudiant")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name="idGroupe")
	private Groupe groupe;
	
	@ManyToOne
	@JoinColumn(name="idPromotion")
	private Promotion promotion;
	
	@ManyToOne
	@JoinColumn(name="idNiveau")
	private Niveau niveau;
	

	public InscriptionId() {
		super();
	}

	public InscriptionId(Etudiant etudiant, Groupe groupe, Promotion promotion, Filiere filiere, Niveau niveau) {
		super();
		this.etudiant = etudiant;
		this.groupe = groupe;
		this.promotion = promotion;
		this.niveau = niveau;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}


}
