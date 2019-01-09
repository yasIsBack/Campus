package campus.V0.domain.model.apprenant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Apprenant {
	
	@NotEmpty
	@Id
	private String email;
	
	@NotEmpty
	private String nom;
	
	@NotEmpty
	private String prenom;

	protected Apprenant() {
	}

	public Apprenant(@NotEmpty String email, @NotEmpty String nom, @NotEmpty String prenom) {
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	
	
	
	
	

}
