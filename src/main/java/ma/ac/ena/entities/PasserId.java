package ma.ac.ena.entities;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PasserId implements Serializable{

	@ManyToOne
	@JoinColumn(name="idEtudiant")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name="idExamen")
	private Examen examen;

	public PasserId() {
		super();
	}

	public PasserId(Etudiant etudiant, Examen examen) {
		super();
		this.etudiant = etudiant;
		this.examen = examen;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}
}
