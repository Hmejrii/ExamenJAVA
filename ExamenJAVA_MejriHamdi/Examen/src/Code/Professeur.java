package Code;

import java.util.Arrays;

public class Professeur extends Personne {
    private String matiere;
    private double salaire;
    private int anneeExperience;
    private String[] diplomes;
    
    
    
    
    
    
	public Professeur(String nom, String prenom, String adresse, String telephone, int age,String groupe, String matiere,
			double salaire, int anneeExperience, String[] diplomes) {
		super(nom, prenom, adresse, telephone, age,groupe);
		this.matiere = matiere;
		this.salaire = salaire;
		this.anneeExperience = anneeExperience;
		this.diplomes = diplomes;
	}
	public Professeur() {
		super();
	
	}
	public Professeur(String nom, String prenom, String adresse, String telephone, int age,String groupe) {
		super(nom, prenom, adresse, telephone, age,groupe);
		
	}
	public Professeur(String nom, String prenom, String adresse) {
		super(nom, prenom, adresse);
	
	}
	public Professeur(String nom, String prenom) {
		super(nom, prenom);
		
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getAnneeExperience() {
		return anneeExperience;
	}
	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}
	public String[] getDiplomes() {
		return diplomes;
	}
	public void setDiplomes(String[] diplomes) {
		this.diplomes = diplomes;
	}
	@Override
	public String toString() {
		return "Professeur [matiere=" + matiere + ", salaire=" + salaire + ", anneeExperience=" + anneeExperience
				+ ", diplomes=" + Arrays.toString(diplomes) + "]";
	}
  
   
   
    
    
    
    
}