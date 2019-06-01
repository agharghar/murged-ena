package ma.ac.ena.entities;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ComporterId implements Serializable {

	@ManyToOne
	@JoinColumn(name="idNiveau")
	private Niveau niveau;
	
	@ManyToOne
	@JoinColumn(name="idSemestre")
	private Semestre semestre;
	
	@ManyToOne
	@JoinColumn(name="idModule")
	private Module module;

	public ComporterId() {
		super();
	}

	public ComporterId(Niveau niveau, Semestre semestre, Module module) {
		super();
		this.niveau = niveau;
		this.semestre = semestre;
		this.module = module;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}
	
	
	
}
