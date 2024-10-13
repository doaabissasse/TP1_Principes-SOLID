package ID;

// Single responsability principe
// Elimination du couplage fort

/*
 Classes CompteUniversitaireEtudiant et CompteUniversitaireEnseignent : Chacune de ces classes 
 g�re � la fois les informations du compte et la g�n�ration de login. Cela signifie qu'elles ont deux 
 responsabilit�s : g�rer le compte de l'�tudiant ou de l'enseignant et g�n�rer un login.
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant etudiant = new Etudiant("Boudehane", "Salma", 12345);
        CompteUniversitaireEtudiant compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        System.out.println("Login �tudiant : " + compteEtudiant.getLogin());

        // Cr�ation d'un enseignant
        Enseignent enseignent = new Enseignent("Hafidi", "Imad", "Professeur");
        CompteUniversitaireEnseignent compteEnseignant = new CompteUniversitaireEnseignent(enseignent);
        System.out.println("Login enseignant : " + compteEnseignant.getLogin());
	}

}
