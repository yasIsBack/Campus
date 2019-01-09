package campus.V0.domain.model.utilisateur;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import campus.V0.domain.model.formation.Formation;

@Entity
public class Utilisateur {

	
	@NotEmpty
	private String nom;

	@NotEmpty
	private String prenom;

	@Id
	private String email;
	
	@OneToMany
	private Formation formation;
}
