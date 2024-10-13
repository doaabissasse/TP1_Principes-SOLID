package ID;

// Single responsability principe
// Elimination du couplage fort

/*
 Classes CompteUniversitaireEtudiant et CompteUniversitaireEnseignent : Chacune de ces classes 
 gère à la fois les informations du compte et la génération de login. Cela signifie qu'elles ont deux 
 responsabilités : gérer le compte de l'étudiant ou de l'enseignant et générer un login.
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant etudiant = new Etudiant("Boudehane", "Salma", 12345);
        CompteUniversitaireEtudiant compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        System.out.println("Login étudiant : " + compteEtudiant.getLogin());

        // Création d'un enseignant
        Enseignent enseignent = new Enseignent("Hafidi", "Imad", "Professeur");
        CompteUniversitaireEnseignent compteEnseignant = new CompteUniversitaireEnseignent(enseignent);
        System.out.println("Login enseignant : " + compteEnseignant.getLogin());
	}

}
