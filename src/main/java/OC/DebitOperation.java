package OC;

public class DebitOperation extends Operation {

	public DebitOperation(double montant) {
		super(montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Compte compte) {
		// TODO Auto-generated method stub
        compte.augmenterMontant(montant);

	}
	
	
}
