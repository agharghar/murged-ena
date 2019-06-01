package ma.ac.ena.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEtudiant;
	@NotNull
	@Size(min = 2, max = 30)
	private String nom;
	@NotNull
	@Size(min = 2, max = 40)
	private String prenom;
	private Date dateNaissance;
	
	@OneToMany(mappedBy="pk.etudiant",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Inscription> inscriptions = new HashSet<>();
	
	@OneToMany(mappedBy="key.etudiant",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Passer> passers = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="idFiliere")
	private Filiere filiere;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public Long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}