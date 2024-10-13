package ID;

public class LoginGeneratorEtudiant implements LoginGenerator {
	private Etudiant etudiant;

    public LoginGeneratorEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
	@Override
	public String genererLogin() {
        return this.etudiant.getPrenom().charAt(0) + this.etudiant.getNom() + "usms.ac.ma";
	}

}
