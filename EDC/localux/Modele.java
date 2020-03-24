package localux;

public class Modele {
	/**
	 * Variables de la classe Modele
	 */
	private int id;
	private String libelle;
	public Double tarifKmSupplementaire;
	
	/**
	 * Constructeur vide de la classe Modele
	 */
	public Modele() {
		
	}
	/**
	 * Constrcteur de la classe Modele
	 */
	public Modele(int unId, String unLibelle, Double unTarifKmSupp) {
		this.id = unId;
		this.libelle = unLibelle;
		this.tarifKmSupplementaire = unTarifKmSupp;
	}
	
	/**
	 * Méthodes mutateur(SET) et accesseurs(GET)
	 * @return id
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * Retourne le tarif du KM supplementaire
	 * 
	 * @return tarifKmSupplementaire
	 */
	public Double getTarifKmSupplementaire() {
		return tarifKmSupplementaire;
	}
	public void setTarifKmSupplementaire(Double tarifKmSupplementaire) {
		this.tarifKmSupplementaire = tarifKmSupplementaire;
	}
}
