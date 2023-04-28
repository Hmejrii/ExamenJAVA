package Code;

import java.util.List;
import java.util.ArrayList;


public class Personne{
	    private String nom;
	    private String prenom;
	    private String adresse;
	    private String telephone;
	    private int age;
	    private String groupe;
	    private static List<Personne> listePersonnes = new ArrayList<>();
	    
	    
	   
	    
	

		public Personne(String nom, String prenom, String adresse, String telephone, int age,String groupe) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresse = adresse;
	        this.telephone = telephone;
	        this.age=age;
	        this.groupe=groupe;
	    }
	    

	    

		// Constructeur avec nom et prenom
	    public Personne(String nom, String prenom) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresse = "";
	        this.telephone = "";
	    }

	    // Constructeur avec nom, prenom et adresse
	    public Personne(String nom, String prenom, String adresse) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresse = adresse;
	        this.telephone = "";
	    }

	    // Constructeur sans paramètres
	    public Personne() {
	        this.nom = "";
	        this.prenom = "";
	        this.adresse = "";
	        this.telephone = "";
	    }

	    
	    // Méthodes d'ajout, de modification et de suppression et recherche  pour la classe Personne

	    public static void ajouterPersonne(Personne p) {
	    	listePersonnes.add(p);
	    }

	    public static void modifierPersonne(Personne personne, List<Personne> listePersonnes) {
	        int index = listePersonnes.indexOf(personne);
	        if (index >= 0) {
	            listePersonnes.set(index, personne);
	        }
	    }

	    public static void supprimerPersonne(Personne personne, List<Personne> listePersonnes) {
	        listePersonnes.remove(personne);
	    }
	
	    public void afficherListePersonnes() {
	        System.out.println("Liste des personnes : ");
	       
			for (int i = 0; i < listePersonnes.size(); i++) {
	            System.out.println(listePersonnes.get(i).toString());
	        }
	    }
	    
	   // affichage une personne appartenant à un groupe
	    public List<Personne> rechercheParGroupe(String nomGroupe) {
	        List<Personne> personnesDansGroupe = new ArrayList<Personne>();
	        for (Personne personne : listePersonnes) {
	            if (personne.getGroupe() != null && personne.getGroupe().equals(nomGroupe)) {
	                personnesDansGroupe.add(personne);
	            }
	        }
	        return personnesDansGroupe;
	    }
	    // Générer un rapport de tout les personnes enregistrées
	    public void genererRapport() {
	        System.out.println("Rapport complet des personnes enregistrées :");
	        System.out.println("---------------------------------------------------");
	        for (Personne personne : listePersonnes) {
	            System.out.println("Nom : " + personne.getNom());
	            System.out.println("Prénom : " + personne.getPrenom());
	            System.out.println("Adresse : " + personne.getAdresse());
	            System.out.println("Téléphone : " + personne.getTelephone());
	            System.out.println("Age : " + personne.getAge());
	            // ajouter d'autres informations spécifiques à chaque type de personne (si nécessaire)
	            System.out.println("---------------------------------------------------");
	        }
	    }

	    
	    
	    

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public String getAdresse() {
	        return adresse;
	    }

	    public void setAdresse(String adresse) {
	        this.adresse = adresse;
	    }

	    public String getTelephone() {
	        return telephone;
	    }

	    public void setTelephone(String telephone) {
	        this.telephone = telephone;
	    }
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getGroupe() {
			return groupe;
		}


		public void setGroupe(String groupe) {
			this.groupe = groupe;
		}


		@Override
		public String toString() {
			return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone
					+ ", age=" + age + "]";
		}
	    
	    
	   
	    
	}


