package OC;

// Principe SOLID non respecté : Open Closed Principe

/* les classes Compte et Operation ne sont pas fermées à la modification parce qu'à chaque fois 
qu'on ajoute un nouveau type de compte ou d'une opération ,
on doit modifier dans le code.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compteCourant = new CompteCourant("123", "01/01/2020");
        Compte compteEpargne = new CompteEpargne("456", "01/01/2020");

        // Création des opérations
        Operation debitOp = new DebitOperation(1000);
        Operation creditOp = new CreditOperation(500);

        // Ajout d'opérations sur le compte courant
        compteCourant.addOperation(creditOp);  // Crédit
        compteCourant.addOperation(debitOp);   // Débit

        System.out.println("Montant compte courant : " + compteCourant.getMontant());

        // Ajout d'opérations sur le compte épargne
        compteEpargne.addOperation(creditOp);  // Crédit avec bonus
        compteEpargne.addOperation(debitOp);   // Débit avec conditions

        System.out.println("Montant compte épargne : " + compteEpargne.getMontant());
	}

}
