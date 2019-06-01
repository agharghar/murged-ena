package ma.ac.ena.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Examen")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Examen implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idExamen")
	private int idExamen;
	
	@Column(name="dateExamen")
	private Date dateExamen;
	
	@ManyToMany(fetch=FetchType.EAGER,mappedBy="examens",cascade=CascadeType.ALL)
	private Set<Matiere> matieres = new HashSet<>();
	
	@OneToMany(mappedBy="key.examen",fetch=FetchType.LAZY)
	private Set<Passer> passers = new HashSet<>();

	public Examen() {
		super();
	}

	public Examen(Date dateExamen) {
		super();
		this.dateExamen = dateExamen;
	}

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	public Set<Passer> getPassers() {
		return passers;
	}

	public void setPassers(Set<Passer> passers) {
		this.passers = passers;
	}

	public Set<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}

	public Date getDateExamen() {
		return dateExamen;
	}

	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}
}
