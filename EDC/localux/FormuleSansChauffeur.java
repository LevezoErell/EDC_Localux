package localux;

public class FormuleSansChauffeur extends Formule {
	/**
	 * Variables
	 */
	private int duree; //Duree de la location en heures
	private Double nbKmInclus; //Forfait Kilométrique
	
	/**
	 * Constructeur vide
	 */
	public FormuleSansChauffeur() {
		
	}
	
	/**
	 * Constructeur
	 * @param unId
	 * @param unLibelle
	 * @param uneDuree
	 * @param unNbKmInclus
	 */
	public FormuleSansChauffeur(int unId, String unLibelle, int uneDuree, Double unNbKmInclus) {
		this.duree = uneDuree;
		this.nbKmInclus = unNbKmInclus;
	}
	
	/**
	 * Méthodes accesseurs et mutateurs
	 */
	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Double getNbKmInclus() {
		return nbKmInclus;
	}

	public void setNbKmInclus(Double nbKmInclus) {
		this.nbKmInclus = nbKmInclus;
	}

}
