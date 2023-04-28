package Code;



public class Prospect extends Personne {
    private String dateDeContact;
    private String commentaire;
    private String poste;
    private double budget;
    
    
    
	public Prospect(String nom, String prenom, String adresse, String telephone, int age,String groupe, String dateDeContact,
			String commentaire, String poste, double budget) {
		super(nom, prenom, adresse, telephone, age,groupe);
		this.dateDeContact = dateDeContact;
		this.commentaire = commentaire;
		this.poste = poste;
		this.budget = budget;
	}
	public Prospect() {
		super();
		
	}
	public Prospect(String nom, String prenom, String adresse, String telephone, int age,String groupe) {
		super(nom, prenom, adresse, telephone, age,groupe);
		
	}
	public Prospect(String nom, String prenom, String adresse) {
		super(nom, prenom, adresse);
	
	}
	public Prospect(String nom, String prenom) {
		super(nom, prenom);

	}
	public String getDateDeContact() {
		return dateDeContact;
	}
	public void setDateDeContact(String dateDeContact) {
		this.dateDeContact = dateDeContact;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Prospect [dateDeContact=" + dateDeContact + ", commentaire=" + commentaire + ", poste=" + poste
				+ ", budget=" + budget + "]";
	}
  
	
	


}