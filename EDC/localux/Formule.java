package localux;

abstract class Formule {
	/**
	 * Variables
	 */
	 public int id;
	 public String libelle;
	 
	 /**
	  * Constructeur vide
	  */
	 public Formule() {
		 
	 }
	 /**
	  * Constructeur
	  * 
	  * @param unId
	  * @param unLibelle
	  */
	 public Formule(int unId, String unLibelle) {
		 this.id = unId;
		 this.libelle = unLibelle;
	 }
	 /**
	  * Mutateurs et accesseurs
	  * @return id
	  */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	 
	 
}