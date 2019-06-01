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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Semestre")
public class Semestre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idSemestre")
	private int idSemestre;
	
	@OneToMany(mappedBy="ck.semestre",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Comporter> comporters = new HashSet<>();
	public Semestre() {
		super();
	}

	public Semestre(int idSemestre, Set<Comporter> comporters) {
		super();
		this.idSemestre = idSemestre;
		this.comporters = comporters;
	}


	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}

	public Set<Comporter> getComporters() {
		return comporters;
	}

	public void setComporters(Set<Comporter> comporters) {
		this.comporters = comporters;
	}
}
