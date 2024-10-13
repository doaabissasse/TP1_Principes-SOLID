package OC;

public class CompteCourant extends Compte {

	public CompteCourant(String id, String dateCreation) {
		super(id, dateCreation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean augmenterMontant(double montant) {
		// TODO Auto-generated method stub
        this.montant += montant;
        return true;
	}

	@Override
	public boolean diminuerMontant(double montant) {
		// TODO Auto-generated method stub
        this.montant -= montant;
        return true;
	}
	
	

}
