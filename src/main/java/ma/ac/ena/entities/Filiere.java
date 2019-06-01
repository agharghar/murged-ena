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
@Table(name="Filiere")
public class Filiere {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idFiliere")
	private int idFiliere;
	
	@Column(name="nomFiliere")
	private String nomFiliere;
	
	@OneToMany(mappedBy="cont.filiere",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Contenir> contenir = new HashSet<>();

	public Filiere() {
		super();
	}
	
	public Filiere(int idFiliere, String nomFiliere) {
		super();
		this.idFiliere = idFiliere;
		this.nomFiliere = nomFiliere;
	}

	public int getIdFiliere() {
		return idFiliere;
	}

	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}

	public String getNomFiliere() {
		return nomFiliere;
	}

	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

}
