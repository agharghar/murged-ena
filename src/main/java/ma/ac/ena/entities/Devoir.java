package ma.ac.ena.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Devoir")
@PrimaryKeyJoinColumn(name="idExamen")
public class Devoir extends Examen {

}
