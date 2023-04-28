package Code;


public class Directeur extends Personne {
    private String dateDebutMandat;

    private String domaine;
    private double salaire;
    private String bureau;
    
	public Directeur(String nom, String prenom, String adresse, String telephone, int age,String groupe, String dateDebutMandat,
			String domaine, double salaire, String bureau) {
		super(nom, prenom, adresse, telephone, age,groupe);
		this.dateDebutMandat = dateDebutMandat;
		this.domaine = domaine;
		this.salaire = salaire;
		this.bureau = bureau;
	}
	public Directeur() {
		super();}
		
	public Directeur(String nom, String prenom, String adresse, String telephone, int age,String groupe) {
		super(nom, prenom, adresse, telephone, age,groupe);
	
	}
	public Directeur(String nom, String prenom, String adresse) {
		super(nom, prenom, adresse);
	
	}
	public Directeur(String nom, String prenom) {
		super(nom, prenom);
		
	}
	public String getDateDebutMandat() {
		return dateDebutMandat;
	}
	public void setDateDebutMandat(String dateDebutMandat) {
		this.dateDebutMandat = dateDebutMandat;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getBureau() {
		return bureau;
	}
	public void setBureau(String bureau) {
		this.bureau = bureau;
	}
	@Override
	public String toString() {
		return "Directeur [dateDebutMandat=" + dateDebutMandat + ", domaine=" + domaine + ", salaire=" + salaire
				+ ", bureau=" + bureau + "]";
	}

   
}