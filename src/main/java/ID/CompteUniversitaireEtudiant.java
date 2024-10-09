package ID;

public class CompteUniversitaireEtudiant {
    private Etudiant etudiant;
    private String login;

    public CompteUniversitaireEtudiant(Etudiant etudiant) {
        super();
        this.etudiant = etudiant;
    }
    public void genererLogin(){
        String login = this.etudiant.getPrenom().charAt(0)+this.etudiant.getNom() + "usms.ac.ma";
        this.login = login;
    }
}