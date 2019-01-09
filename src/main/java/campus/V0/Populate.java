package campus.V0;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import campus.V0.domain.model.apprenant.Apprenant;
import campus.V0.domain.model.apprenant.IApprenantRepository;

@Component
public class Populate {

	@Autowired
	IApprenantRepository apprenants;
	
	@Transactional
	public void nettoyage() {
		apprenants.deleteAll();
	}
	
	public boolean hasNoData() {
		return ( apprenants.count() == 0 );
	}
	
	public void nettoiePuisCree() {
		nettoyage();
		creerJeuDessai();
	}
	
	public void creerJeuDessai() {
		
		Apprenant yas = new Apprenant("b_yas@me.com", "BENYOUSSIF", "Yassine");
		Apprenant kenza= new Apprenant("kenza.bannouf@gmail.com", "BANNOUF", "Kenza");
		Apprenant martin = new Apprenant("berthier.martin@gmail.com", "BÉRTHIER", "Martin");
		Apprenant andrei = new Apprenant("andreibodea17@gmail.com", "BODEA", "Andrei");
		Apprenant seb = new Apprenant("elusuesebastien@gmail.com", "ELUSUE", "Sébastien");
		
		apprenants.save(yas);
		apprenants.save(kenza);
		apprenants.save(martin);
		apprenants.save(andrei);
		apprenants.save(seb);
	}

}
