package OC;

import java.util.ArrayList;

public abstract class Compte {
	protected ArrayList<Operation> operations;
    protected String id;
    protected String dateCreation;
    protected double montant;

    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }

    public void addOperation(Operation operation) {
        operation.execute(this);
    	this.operations.add(operation);
    }
    
    public abstract boolean augmenterMontant(double montant); 

    public abstract boolean diminuerMontant(double montant);
    
    public double getMontant() {
        return montant;
    }
}
