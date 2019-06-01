package ma.ac.ena.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Contenir")
public class Contenir {
	
	@EmbeddedId
	private ContenirId cont;
	
	public Contenir() {
		super();
	}
	
	public Contenir(Filiere filiere,Niveau niveau) {
		super();
		this.cont = new ContenirId(filiere,niveau);
	}

	public ContenirId getCont() {
		return cont;
	}

	public void setCont(ContenirId cont) {
		this.cont = cont;
	}

}
