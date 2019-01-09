package campus.V0.domain.application.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campus.V0.domain.application.IFrontOfficeService;
import campus.V0.domain.model.apprenant.Apprenant;
import campus.V0.domain.model.apprenant.IApprenantRepository;

@Service
public class FrontOfficeService implements IFrontOfficeService {

	@Autowired
	IApprenantRepository apprenants;

	@Override
	public List<Apprenant> listerApprenant() {
		return apprenants.findAll();
	}

	@Override
	public void supprimerApprenant(Apprenant apprenant) {
		apprenants.deleteById(apprenant.getEmail());

	}

	@Override
	public void nouvelleApprenant(Apprenant apprenant) {
		apprenants.save(apprenant);
	}

	@Override
	public Apprenant mettreAjourEmail(Apprenant apprenant, String nouveauMail) {

		Apprenant result = null;

		Optional<Apprenant> apprenantToFind = apprenants.findById(apprenant.getEmail());

		if (apprenantToFind.isPresent()) {
			result = apprenantToFind.get();
			result.setEmail(nouveauMail);
		}
		return result;
	}

}
