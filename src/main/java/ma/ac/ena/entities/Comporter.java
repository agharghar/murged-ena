package ma.ac.ena.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Comporter")
public class Comporter {

	@EmbeddedId
	private ComporterId ck;

	public Comporter() {
		super();
	}
	
	public Comporter(Niveau niveau,Semestre semestre,Module module) {
		super();
		this.ck = new ComporterId(niveau, semestre, module);
	}

	public ComporterId getCk() {
		return ck;
	}

	public void setCk(ComporterId ck) {
		this.ck = ck;
	}
}
