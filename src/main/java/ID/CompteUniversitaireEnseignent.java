package ID;

public class CompteUniversitaireEnseignent {
    private Enseignent enseignent;
    private String login;

    public CompteUniversitaireEnseignent(Enseignent enseignent) {
        super();
        this.enseignent = enseignent;
    }
    public void genererLogin(){
        String login = this.enseignent.getPrenom()+this.enseignent.getNom() + this.enseignent.getGrade()+"usms.ma";
        this.login = login;
    }
}