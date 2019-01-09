package campus.V0.domain.model.formation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Stage {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	private Date dateDeDebut;
	
	@NotEmpty
	private Date dateDeFin;

	protected Stage() {

	}

	public Stage(@NotEmpty Date dateDeDebut, @NotEmpty Date dateDeFin) {
		this.dateDeDebut = dateDeDebut;
		this.dateDeFin = dateDeFin;
	}

	public long getId() {
		return id;
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
	
	
	
	
	
	

}
