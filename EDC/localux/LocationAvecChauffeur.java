package localux;

import java.util.Date;

public class LocationAvecChauffeur extends Location {
	public FormuleAvecChauffeur laFormuleAvecChauffeur;
	
	/**
	 * Constructeur vide
	 */
	public LocationAvecChauffeur() {
		
	}
	/**
	 * Constructeur
	 */
	public LocationAvecChauffeur(int unNumLoc, Date uneDate , double unMontantRegle,
			Vehicule unVehicule,  FormuleAvecChauffeur uneFormuleAvecChauffeur) {
		super(unNumLoc, uneDate, unMontantRegle, unVehicule);
		
		this.laFormuleAvecChauffeur = uneFormuleAvecChauffeur;
	}
	
	/**
	 * Méthodes Getter et Setter
	 * @return laFormuleAvecChauffeur
	 */
	public FormuleAvecChauffeur getLaFormuleAvecChauffeur() {
		return laFormuleAvecChauffeur;
	}
	public void setLaFormuleAvecChauffeur(FormuleAvecChauffeur laFormuleAvecChauffeur) {
		this.laFormuleAvecChauffeur = laFormuleAvecChauffeur;
	}
	
}
