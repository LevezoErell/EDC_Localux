package localux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vehicule {
	 public static final String GetModele = null;
	 private String immatriculation;
	 private Date dateAchat;
	 private Modele leModele;
	 //QUESTION 2.4 : Ajout de l'attribut privé
	 private ArrayList<LocationSansChauffeur> lesLocationsSansChauffeur;
	 
	 public Vehicule() {
		 
	 }
	 /**
	  * Constructeur de la classe véhicule
	  */
	 public Vehicule(String uneImmat, Date uneDate, Modele unModele) {
		 this.immatriculation = uneImmat;
		 this.dateAchat = uneDate;
		 this.leModele = unModele;
		 this.lesLocationsSansChauffeur = new ArrayList<LocationSansChauffeur>();
	 }
	 /**
	  * QUESTION 2.4
	  * 
	  * Ajout d'une nouvelle location sans chauffeur
	  * et total des déplacements pour ce véhicule
	  */
	 public void AddLocationSansChauffeur(LocationSansChauffeur location) {
		 this.lesLocationsSansChauffeur.add(location);
	 }
	 public double GetTotalDepasForfait() {
		 double total = 0;
		 foreach(LocationSansChauffeur location in lesLocationsSansChauffeur)
		 {
			// LocationSansChauffeur location;
			total += location.getMontantDepasForfait();
		 }
		 return total;
	 }
	 
	 
	 /**
	  * Méthodes mutateurs(SET) et accesseurs(GET)
	  */
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Modele getLeModele() {
		return leModele;
	}
	public void setLeModele(Modele leModele) {
		this.leModele = leModele;
	}
	public List<LocationSansChauffeur> getLesLocationsSansChauffeur() {
		return lesLocationsSansChauffeur;
	}
	public void setLesLocationsSansChauffeur(List<LocationSansChauffeur> lesLocationsSansChauffeur) {
		this.lesLocationsSansChauffeur = lesLocationsSansChauffeur;
	}

}
