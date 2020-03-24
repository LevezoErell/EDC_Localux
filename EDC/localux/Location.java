package localux;

import java.util.Date;

/**
 * @author erell
 *
 * Classe publique Location
 */
abstract class Location {
	private int numLocation;
	public Date dateLocation;
	public double montantRegle;
	public Vehicule leVehicule;
	

	/**
	 * Création d'un constructeur vide car Java insére automatiquement un appek au constructeur
	 * sans argument de la "superclasse" (ici Location)
	 * 
	 * Erreur lors de la compilation si Location n'avait pas eu de constructeur vide
	 */
	public Location() {
		
	}
	
	/**
	 * Constructeur de la classe Location
	 * 
	 * @param unNumLoc
	 * @param uneDate
	 * @param unMontantRegle
	 * @param unVehicule
	 */
	public Location(int unNumLoc, Date uneDate, double unMontantRegle, Vehicule unVehicule) {
		this.numLocation = unNumLoc;
		this.dateLocation = uneDate;
		this.montantRegle = unMontantRegle;
		this.leVehicule = unVehicule;
		
	}
	
	
	/**
	 * Méthodes getter et setter des variables
	 */
	public int getNumLocation() {
		return numLocation;
	}

	public void setNumLocation(int numLocation) {
		this.numLocation = numLocation;
	}

	public Date getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}
	
	/**
	 * 
	 * @return montantRegle montant total réglé par le client
	 */
	public double getMontantRegle() {
		return montantRegle;
	}

	public void setMontantRegle(double montantRegle) {
		this.montantRegle = montantRegle;
	}

	/**
	 * 
	 * @return leVehicule concerné par la location
	 */
	public Vehicule getLeVehicule() {
		return leVehicule;
	}

	public void setLeVehicule(Vehicule leVehicule) {
		this.leVehicule = leVehicule;
	}
	
}
