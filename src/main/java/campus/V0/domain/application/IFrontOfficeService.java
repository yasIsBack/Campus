package campus.V0.domain.application;

import java.util.List;

import campus.V0.domain.model.apprenant.Apprenant;

public interface IFrontOfficeService {
	
	List<Apprenant> listerApprenant();
	
	void nouvelleApprenant(Apprenant apprenant);
	void supprimerApprenant(Apprenant apprenant);
	
	Apprenant mettreAjourEmail(Apprenant apprenant, String nouveauMail);
}
