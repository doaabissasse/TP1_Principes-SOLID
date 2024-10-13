package OC;

public class CreditOperation extends Operation {

	public CreditOperation(double montant) {
		super(montant);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void execute(Compte compte) {
        compte.diminuerMontant(montant);
    }

    

}
