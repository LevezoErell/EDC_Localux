package localux;

public class FormuleAvecChauffeur extends Formule {
	/**
	 * Variables
	 */
	private String lieu;
	private Double tarif;
	
	/**
	 * Constructeur vide
	 */
	public FormuleAvecChauffeur(){
		
	}
	/**
	 * Constructeur de la classe FormuleAvecChauffeur qui appelle le constructeur
	 * de la classe mère grâce à super(...)
	 */
	public FormuleAvecChauffeur (int unId, String unLibelle, 
			String unLieu, Double unTarif){
		super(unId, unLibelle); 
		
		this.lieu = unLieu;
		this.tarif = unTarif;
	}
	/**
	 * Accesseurs et mutateurs
	 * 
	 */
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Double getTarif() {
		return tarif;
	}
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}
	
	
}
