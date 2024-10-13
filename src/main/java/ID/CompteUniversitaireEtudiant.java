package ID;

public class CompteUniversitaireEtudiant {
    private Etudiant etudiant;
    private String login;

    public CompteUniversitaireEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
        this.login = new LoginGeneratorEtudiant(etudiant).genererLogin();
    }
    
    public String getLogin() {
        return login;
    }
}
