package OC;

public abstract class Operation {
	protected double montant;

    public Operation(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public abstract void execute(Compte compte);
}
