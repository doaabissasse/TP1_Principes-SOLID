package exo1;

public class Main {
    public static void main(String[] args) {
        Produit produit1 = new Produit();
        produit1.setLibele("telephone");
        produit1.setPrix(3002);

        Facture facture = new Facture(1);
        facture.addProduit(produit1,5);

        Facture.setTVA(0.3);

        facture.getTotal();
        facture.getTotalTTC();

        //Impression de la facture
        ImpressionFacture impression =new ImpressionFactureImp();
        impression.Imprimerfacture(facture);

        //sauvgarde dans une file
        sauvgardefactureFile file =new sauvgardefactureFile();
        file.saveFacture(facture);


    }
}