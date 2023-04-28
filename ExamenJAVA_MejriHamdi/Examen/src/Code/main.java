package Code;
import java.io.*;
import java.util.*;


public class main {

	public static void main(String[] args) {
		
		
		// Instanciation de 5 objets de la classe Personne
		Personne p1 = new Personne("Durand", "Jean", "10 rue du Paradis", "0102030405", 30,"A");
        Personne p2 = new Personne("Dupont", "Marie", "5 rue des Lilas", "0607080910", 25,"B");
        Personne p3 = new Personne("Martin", "Pierre", "18 avenue des Champs-Elysées", "0203040506", 40,"B");
        Personne p4 = new Personne("Leclerc", "Sophie", "12 rue de la Paix", "0708091011", 22,"C");
        Personne p5 = new Personne("Dubois", "Luc", "7 rue de la Liberté", "0506070809", 5,"C");

		// Instanciation de 5 objets de la classe Etudiant
        etudiant e1 = new etudiant("Dupont", "Marie", "5 rue des Lilas", "0607080910", 25,"c","123456", true, 14.5, "Licence");
        etudiant e2 = new etudiant("Martin", "Pierre", "18 avenue des Champs-Elysées", "0203040506", 40,"c", "789101", false, 10.0, "Master");
        etudiant e3 = new etudiant("Leclerc", "Sophie", "12 rue de la Paix", "0708091011", 22,"c", "234567", true, 13.0, "Licence");
        etudiant e4 = new etudiant("Dubois", "Luc", "7 rue de la Liberté", "0506070809", 50,"c", "891011", false, 11.5, "Master");
        etudiant e5 = new etudiant("Durand", "Jean", "10 rue du Paradis", "0102030405", 30,"b", "345678", true, 12.0, "Licence");

		// Instanciation de 5 objets de la classe Professeur
   //     Professeur pr1 = new Professeur("Smith", "John", "12 Rue de la Paix", "0612345678", 35, "Mathématiques", 3500.0, 5, new String[]{"Doctorat en Mathématiques", "CAPES"});
    //    Professeur pr2 = new Professeur("Dupont", "Marie", "6 Rue des Lilas", "0678901234", 45, "Physique-Chimie", 4500.0, 15, new String[]{"Doctorat en Physique", "Agrégation de Physique"});
    //    Professeur pr3 = new Professeur("Martin", "Julie", "8 Rue de la Liberté", "0645678901", 40, "Histoire-Géographie", 4200.0, 8, new String[]{"Doctorat en Histoire", "CAPES"});
     //   Professeur pr4 = new Professeur("Dubois", "Lucas", "3 Rue de la République", "0698765432", 30, "Informatique", 3000.0, 2, new String[]{"Master en Informatique"});
      //  Professeur pr5 = new Professeur("Leclerc", "Camille", "16 Avenue des Champs-Élysées", "0634567890", 50, "Langues Étrangères", 5000.0, 20, new String[]{"Doctorat en Langues Étrangères", "Agrégation de Langues"});
    	// Instanciation de 5 objets de la classe Prospect 
        
   //     Prospect prosp1 = new Prospect("Dupont", "Marie", "123 rue de la Victoire", "01 23 45 67 89", 30, "12/04/2023", "Intéressé", "Chef de projet", 50000.0);
    //    Prospect prosp2 = new Prospect("Durand", "Pierre", "456 avenue des Lilas", "02 34 56 78 90", 40, "15/04/2023", "A relancer", "Développeur", 40000.0);
      //  Prospect prosp3 = new Prospect("Martin", "Lucie", "789 boulevard des Roses", "03 45 67 89 01", 25, "20/04/2023", "Pas intéressé", "Commercial", 45000.0);
       // Prospect prosp4 = new Prospect("Garcia", "Antoine", "147 rue des Champs", "04 56 78 90 12", 35, "25/04/2023", "En attente de réponse", "Ingénieur R&D", 55000.0);
      //  Prospect prosp5 = new Prospect("Lefebvre", "Sophie", "258 avenue du Parc", "05 67 89 01 23", 28, "30/04/2023", "Non disponible pour l'instant", "Designer", 35000.0);
     // Instanciation de 5 objets de la classe directeur 
        
      //  Directeur d1 = new Directeur("Smith", "John", "15 rue de la Paix", "01 23 45 67 89", 45, "01/01/2020", "Finance", 8000.0, "Bureau A");
      //  Directeur d2 = new Directeur("Garcia", "Maria", "20 avenue des Champs-Élysées", "01 45 67 89 01", 50, "01/01/2021", "Marketing", 10000.0, "Bureau B");
     //   Directeur d3 = new Directeur("Lee", "Jae-Ho", "10-1 Gangnam-gu", "010-1234-5678", 55, "01/01/2019", "Technologie", 12000.0, "Bureau C");
      //  Directeur d4 = new Directeur("Müller", "Hans", "Am Bahnhof 5", "+49 1234 56789", 60, "01/01/2018", "Ressources humaines", 9000.0, "Bureau D");
       // Directeur d5 = new Directeur("Tanaka", "Yuki", "3-2-1 Shibuya", "03-1234-5678", 47, "01/01/2017", "Ventes", 11000.0, "Bureau E");

        // Instanciation de 5 objets de la classe secretaire  
      //  Secretaire s1 = new Secretaire("Dupont", "Marie", "1 rue des Lilas", "01 23 45 67 89", 35, "RH", "Bureau A", 2, "Anglais");
     //   Secretaire s2 = new Secretaire("Martin", "Sophie", "15 avenue des Champs-Elysées", "06 12 34 56 78", 27, "Commercial", "Bureau B", 1, "Espagnol");
      //  Secretaire s3 = new Secretaire("Durand", "Julie", "8 rue de la Paix", "04 56 78 90 12", 41, "Comptabilité", "Bureau C", 5, "Allemand");
       // Secretaire s4 = new Secretaire("Lefebvre", "Caroline", "12 avenue Victor Hugo", "03 45 67 89 01", 29, "Marketing", "Bureau D", 3, "Italien");
       // Secretaire s5 = new Secretaire("Girard", "Emilie", "4 rue de la Liberté", "07 23 45 67 89", 33, "Informatique", "Bureau E", 4, "Russe");
		
        try {
            FileWriter writer = new FileWriter("personnes.txt");

            // Ecriture de chaque instance dans le fichier
            writer.write(p1.toString() + "\n\n");
            writer.write(p2.toString() + "\n\n");
            writer.write(p3.toString() + "\n\n");
            writer.write(p4.toString() + "\n\n");
            writer.write(p5.toString() + "\n\n");
            
            writer.write(e1.toString() + "\n\n");
            writer.write(e2.toString() + "\n\n");
            writer.write(e3.toString() + "\n\n");
            writer.write(e4.toString() + "\n\n");
            writer.write(e5.toString() + "\n\n");

         //   writer.write(pr1.toString() + "\n\n");
          //  writer.write(pr2.toString() + "\n\n");
           // writer.write(pr3.toString() + "\n\n");
            //writer.write(pr4.toString() + "\n\n");
          //  writer.write(pr5.toString() + "\n\n");
            
          //  writer.write(d1.toString() + "\n\n");
           // writer.write(d2.toString() + "\n\n");
          //  writer.write(d3.toString() + "\n\n");
          //  writer.write(d4.toString() + "\n\n");
          //  writer.write(d5.toString() + "\n\n");
            
          //  writer.write(s1.toString() + "\n\n");
           // writer.write(s2.toString() + "\n\n");
           // writer.write(s3.toString() + "\n\n");
           // writer.write(s4.toString() + "\n\n");
           // writer.write(s5.toString() + "\n\n");
            
            

            // Fermeture du FileWriter
            writer.close();

            System.out.println("Les instances ont été écrites dans le fichier avec succès !");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de l'écriture dans le fichier : " + e.getMessage());
        }
    
	
		
		
		
     

        List<Personne> listePersonnes = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                int choix = 0;
                
                while (choix != 4) {
                    System.out.println("Menu principal");
                    System.out.println("1. Ajouter une personne");
                    System.out.println("2. Modifier une personne");
                    System.out.println("3. Supprimer une personne");
                    System.out.println("4. Quitter");
                    
                    System.out.print("Choix : ");
                    choix = scanner.nextInt();
                    
                    Scanner sc = null;
					switch (choix) {
                        case 1:
                            // Ajouter une personne
                        	
                        	
                        	String nom ="", prenom="", adresse="", telephone="";
                        	int age;

                        	System.out.println("Entrez le nom de la personne : ");
                        	nom = scanner.nextLine();

                        	System.out.println("Entrez le prenom de la personne : ");
                        	prenom = scanner.nextLine();

                        	System.out.println("Entrez l'adresse de la personne : ");
                        	adresse = scanner.nextLine();

                        	System.out.println("Entrez le telephone de la personne : ");
                        	telephone = scanner.nextLine();

                        	System.out.println("Entrez l'age de la personne : ");
                        	age = scanner.nextInt();

     //                   	Personne personne = new Personne(nom, prenom, adresse, telephone, age);
         //               	personne.ajouterPersonne(personne);
                        	System.out.println("Personne ajoutée avec succès !");
                        	
                        	
                            break;
                        case 2:
                            // Modifier une personne
                        	// Demander l'index de la personne à modifier
                        	System.out.println("Saisir l'index de la personne à modifier :");
                        	int index = sc.nextInt();

                        	// Vérifier si l'index est valide
                        	if (index >= 0 && index < listePersonnes.size()) {
                        	    // Récupérer la personne correspondante
                        	    Personne p = listePersonnes.get(index);
                        	    
                        	    // Afficher les informations de la personne avant la modification
                        	    System.out.println("Personne avant modification :");
  //                      	    personne.toString();
                        	    
                        	    // Demander les nouvelles informations de la personne
                        	    System.out.println("Saisir le nouveau nom :");
                        	    String nomM = sc.next();
                        	    System.out.println("Saisir le nouveau prénom :");
                        	    String prenomM = sc.next();
                        	    System.out.println("Saisir la nouvelle adresse :");
                        	    String adresseM = sc.next();
                        	    System.out.println("Saisir le nouveau numéro de téléphone :");
                        	    String telephoneM = sc.next();
                        	    System.out.println("Saisir le nouvel âge :");
                        	    int ageM = sc.nextInt();
                        	    
                        	    // Modifier les informations de la personne
 //                       	    personne.setNom(nom);
  //                      	    personne.setPrenom(prenom);
  //                      	    personne.setAdresse(adresse);
  //                      	    personne.setTelephone(telephone);
  //                      	    personne.setAge(age);
                        	    
                        	    // Afficher les informations de la personne après la modification
                        	    System.out.println("Personne après modification :");
//                        	    personne.toString();
                        	} else {
                        	    System.out.println("Index invalide.");
                        	}

                       
                            break;
                        case 3:
                            
                        	// Demander le nom de la personne à supprimer
                        	System.out.println("Veuillez saisir le nom de la personne à supprimer :");
                        	String nomASupprimer = scanner.nextLine();

                        	// Chercher la personne correspondante dans la liste
                        	Personne personneASupprimer = null;
                        	for (Personne p : listePersonnes) {
                        	    if (p.getNom().equals(nomASupprimer)) {
                        	        personneASupprimer = p;
                        	        break;
                        	    }
                        	}

                        	// Vérifier si la personne a été trouvée et la supprimer
                        	if (personneASupprimer != null) {
                        	    listePersonnes.remove(personneASupprimer);
                        	    System.out.println("La personne a été supprimée avec succès.");
                        	} else {
                        	    System.out.println("Aucune personne trouvée avec ce nom.");
                        	}

                        	
                        	
                        	
                            break;
                        case 4:
                            // Quitter
                            System.out.println("Au revoir !");
                            break;
                        default:
                            System.out.println("Choix invalide !");
                    }
                    
                    System.out.println();
                }
                
                scanner.close();
            }
        }

		
		
		
	

