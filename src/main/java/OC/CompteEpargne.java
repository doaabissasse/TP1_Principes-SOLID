package OC;

public class CompteEpargne extends Compte {

	public CompteEpargne(String id, String dateCreation) {
		super(id, dateCreation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean augmenterMontant(double montant) {
		// TODO Auto-generated method stub
        this.montant += montant * 0.05; 
        return true;
	}

	@Override
	public boolean diminuerMontant(double montant) {
		if (this.montant >= montant * 0.1 &&
	            java.time.LocalDate.now().getYear() > Integer.parseInt(this.dateCreation.split("/")[2])) {
	            this.montant -= montant * 0.1;
	            return true;
	        }
	        return false;
	}
	
	
}
