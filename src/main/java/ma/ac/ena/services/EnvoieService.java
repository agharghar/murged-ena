package ma.ac.ena.services;

import java.net.URI;

import ma.ac.ena.entities.Envoie;

public interface EnvoieService {

	Envoie isAuth(String fileName, int id);

	void setLu(Envoie envoie);

	

}
