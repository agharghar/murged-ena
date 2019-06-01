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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Matiere")
public class Matiere {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idMatiere")
	private int idMatiere;
	
	@ManyToOne
	@JoinColumn(name="idModule")
	private Module module;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="associer",
	joinColumns=@JoinColumn(name="idMatiere"),
	inverseJoinColumns=@JoinColumn(name="idExamen"))
	private Set<Examen> examens = new HashSet<>();
	

	public Matiere() {
		super();
	}

	public int getIdMatiere() {
		return idMatiere;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public Set<Examen> getExamens() {
		return examens;
	}

	public void setExamens(Set<Examen> examens) {
		this.examens = examens;
	}

}
