package ID;

public class LoginGeneratorEnseignent implements LoginGenerator {
	private Enseignent enseignent;

    public LoginGeneratorEnseignent(Enseignent enseignent) {
        this.enseignent = enseignent;
    }

	@Override
	public String genererLogin() {
        return this.enseignent.getPrenom() + this.enseignent.getNom() + this.enseignent.getGrade() + "usms.ma";
	}

}
