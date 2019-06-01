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
@Table(name="Module")
public class Module {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idModule")
	private int idModule;
	
	@OneToMany(mappedBy="ck.module",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Comporter> comporters = new HashSet<>();
	
	@OneToMany(mappedBy="module",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Matiere> matiere = new HashSet<>();
			
	public Module() {
		super();
	}

	public int getIdModule() {
		return idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public Set<Comporter> getComporters() {
		return comporters;
	}

	public void setComporters(Set<Comporter> comporters) {
		this.comporters = comporters;
	}

	public Set<Matiere> getMatiere() {
		return matiere;
	}

	public void setMatiere(Set<Matiere> matiere) {
		this.matiere = matiere;
	}

}
