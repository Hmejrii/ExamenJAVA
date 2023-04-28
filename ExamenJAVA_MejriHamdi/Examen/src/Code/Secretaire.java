package Code;

public class Secretaire extends Personne {
    private String service;
    private String bureau;
    private int anciennete;
    private String langue;
	public Secretaire(String nom, String prenom, String adresse, String telephone, int age,String groupe, String service,
			String bureau, int anciennete, String langue) {
		super(nom, prenom, adresse, telephone, age,groupe);
		this.service = service;
		this.bureau = bureau;
		this.anciennete = anciennete;
		this.langue = langue;
	}
	public Secretaire() {
		super();
	
	}
	public Secretaire(String nom, String prenom, String adresse, String telephone, int age,String groupe) {
		super(nom, prenom, adresse, telephone, age,groupe);
	
	}
	public Secretaire(String nom, String prenom, String adresse) {
		super(nom, prenom, adresse);
	
	}
	public Secretaire(String nom, String prenom) {
		super(nom, prenom);
	
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getBureau() {
		return bureau;
	}
	public void setBureau(String bureau) {
		this.bureau = bureau;
	}
	public int getAnciennete() {
		return anciennete;
	}
	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	@Override
	public String toString() {
		return "Secretaire [service=" + service + ", bureau=" + bureau + ", anciennete=" + anciennete + ", langue="
				+ langue + "]";
	}

    
    
    
}