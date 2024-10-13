package ID;

public class CompteUniversitaireEnseignent {
    private Enseignent enseignent;
    private String login;

    public CompteUniversitaireEnseignent(Enseignent enseignent) {
        this.enseignent = enseignent;
        this.login = new LoginGeneratorEnseignent(enseignent).genererLogin();
    }
    
    public String getLogin() {
        return login;
    }
}
