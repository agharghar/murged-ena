package ma.ac.ena.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Inscription")
public class Inscription {

	@EmbeddedId
	private InscriptionId pk;
	
	public Inscription() {
		
	}

	public Inscription(Etudiant etudiant, Groupe groupe, Promotion promotion, Filiere filiere, Niveau niveau) {
		super();
		this.pk = new InscriptionId(etudiant, groupe, promotion, filiere, niveau);
	}

	public InscriptionId getPk() {
		return pk;
	}

	public void setPk(InscriptionId pk) {
		this.pk = pk;
	}
}
