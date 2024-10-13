package OC;

// Principe SOLID non respect� : Open Closed Principe

/* les classes Compte et Operation ne sont pas ferm�es � la modification parce qu'� chaque fois 
qu'on ajoute un nouveau type de compte ou d'une op�ration ,
on doit modifier dans le code.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compteCourant = new CompteCourant("123", "01/01/2020");
        Compte compteEpargne = new CompteEpargne("456", "01/01/2020");

        // Cr�ation des op�rations
        Operation debitOp = new DebitOperation(1000);
        Operation creditOp = new CreditOperation(500);

        // Ajout d'op�rations sur le compte courant
        compteCourant.addOperation(creditOp);  // Cr�dit
        compteCourant.addOperation(debitOp);   // D�bit

        System.out.println("Montant compte courant : " + compteCourant.getMontant());

        // Ajout d'op�rations sur le compte �pargne
        compteEpargne.addOperation(creditOp);  // Cr�dit avec bonus
        compteEpargne.addOperation(debitOp);   // D�bit avec conditions

        System.out.println("Montant compte �pargne : " + compteEpargne.getMontant());
	}

}
