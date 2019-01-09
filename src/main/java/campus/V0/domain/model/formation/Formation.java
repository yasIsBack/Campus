package campus.V0.domain.model.formation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	private String nom;
	
	@NotEmpty
	private String lieu;

	@NotEmpty
	private Date dateDeDebut;

	@NotEmpty
	private Date dateDeFin;

	@ManyToOne
	private Stage stage;


	protected Formation() {
	}

	public Formation(@NotEmpty String nom, @NotEmpty Date dateDeDebut, @NotEmpty Date dateDeFin, Stage stage) {
		this.nom = nom;
		this.dateDeDebut = dateDeDebut;
		this.dateDeFin = dateDeFin;
		this.stage = stage;
	}

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDeDebut() {
		return dateDeDebut;
	}

	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}

	public Date getDateDeFin() {
		return dateDeFin;
	}

	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	

}
