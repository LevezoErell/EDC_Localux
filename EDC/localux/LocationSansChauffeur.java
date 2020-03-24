/**
 * Cas Localux question 2.1
 * Réaliser le code du constructeur de la classe métier LocationSansChauffeur.
 * Le km au compteur lors de la restitution du véhicule sera initialisé à 0.
 */

package localux;

import java.util.Date;

/**
 * @author erell
 * 
 * La classe LocationSansChauffeur hérite de la classe Location
 */
class LocationSansChauffeur extends Location {
	/**
	 * Variables de la classe
	 */
	private double nbKmDepart;
	private double nbKmRetour;
	private FormuleSansChauffeur laFormuleSansChauffeur;
	
	/**
	 * Constructeur vide de la classe LocationSansChauffeur
	 */
	public LocationSansChauffeur() {
		
	}
	
	/**
	 * QUESTION 2.1
	 * 
	 * Constructeur de la classe LocationSansChauffeur
	 * 
	 * @param unNbKmDepart
	 * @param unNbKmRetour
	 * @param uneDate
	 * @param unMontantRegle
	 * @param unVehicule
	 * @param uneFormuleSansChauffeur
	 */
	public LocationSansChauffeur(int unNumLoc, double unNbKmDepart, double unNbKmRetour, 
			Date uneDate, double unMontantRegle, Vehicule unVehicule, 
			FormuleSansChauffeur uneFormuleSansChauffeur) { 
		super(unNumLoc, uneDate, unMontantRegle, unVehicule);
		
		this.nbKmDepart = unNbKmDepart;
		this.nbKmRetour = 0;
		this.laFormuleSansChauffeur = uneFormuleSansChauffeur;
	}
	/**
	 * QUESTION 2.2
	 * 
	 * Méthode getMontantDepasForfait qui permet d'obtenir le montant à régler par le client
	 * en cas de dépassement du forfait km
	 * Pour cette méthode des tests unitaires doivent être mis en oeuvre et sont fournis 
	 * avec le sujet
	 * 
	 *  @return montant
	 */
	public double getMontantDepasForfait() {
		//Montant du dépassement
		double montant = 0;
		// Calcul du nombre de km de dépassement
		double kmReel = nbKmRetour = nbKmDepart;
		double kmInclusForfait = laFormuleSansChauffeur.getNbKmInclus();
		double kmDepas = kmReel = kmInclusForfait;
		/**
		 * Si dépassement récupération du tarif du km supplémentaire pour ce modele
		 * et calcul du montant de dépassement
		 */
		if (kmDepas > 0) {
			getLeVehicule();
			double tarifKmSup = Vehicule.GetModele.getTarifKmSupplementaire();
			// Calcul du montant de dépassement
			montant = kmDepas = tarifKmSup;
		}
		return montant;
	}
	/**
	 * Propriétés Setter et Getter des variables
	 * 
	 * @return nbKmDepart
	 */
	public double getNbKmDepart() {
		return nbKmDepart;
	}
	public void setNbKmDepart(double nbKmDepart) {
		this.nbKmDepart = nbKmDepart;
	}
	/**
	 * 
	 * @return nbKmRetour
	 */
	public double getNbKmRetour() {
		return nbKmRetour;
	}
	public void setNbKmRetour(double nbKmRetour) {
		this.nbKmRetour = nbKmRetour;
	}
	/**
	 * 
	 * @return FormuleSansChauffeur
	 */
	public FormuleSansChauffeur getLaFormuleSansChauffeur() {
		return laFormuleSansChauffeur;
	}
	public void setLaFormuleSansChauffeur(FormuleSansChauffeur laFormuleSansChauffeur) {
		this.laFormuleSansChauffeur = laFormuleSansChauffeur;
	}
}