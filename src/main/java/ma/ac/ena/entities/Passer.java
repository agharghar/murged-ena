package ma.ac.ena.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Passer")
public class Passer {
	
	@EmbeddedId
	private PasserId key;
	
	@Column(name="note")
	private double note;

	public Passer() {
		super();
	}

	public Passer(Etudiant etudiant, Examen examen, double note) {
		super();
		this.key = new PasserId(etudiant, examen);
		this.note = note;
	}

	public PasserId getKey() {
		return key;
	}

	public void setKey(PasserId key) {
		this.key = key;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

}
