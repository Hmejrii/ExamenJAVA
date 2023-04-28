package Code;

public class etudiant extends Personne {
    public String numeroEtudiant;
    private boolean diplome;
    private double moyenne;
    private String niveau;
    

  

    public etudiant() {
		super();
		
	}

	public etudiant(String nom, String prenom, String adresse, String telephone, int age,String groupe, String numeroEtudiant,boolean diplome, double moyenne, String niveau) {
		super(nom, prenom, adresse, telephone, age,groupe);
		this.numeroEtudiant=numeroEtudiant;
		this.diplome=diplome;
		this.moyenne=moyenne;
		this.niveau=niveau;
		
	}

	public etudiant(String nom, String prenom, String adresse) {
		super(nom, prenom, adresse);
	}

	public etudiant(String nom, String prenom) {
		super(nom, prenom);
		
	}

	public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(String numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

	public boolean isDiplome() {
		return diplome;
	}

	public void setDiplome(boolean diplome) {
		this.diplome = diplome;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
    
    
    
    
}
