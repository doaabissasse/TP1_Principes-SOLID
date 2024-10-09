package exo1;

import java.util.Map;

public class ImpressionFactureImp implements ImpressionFacture{

    @Override
    public void Imprimerfacture(Facture facture) {
        double prix;
        for (Map.Entry<Produit, Integer> mapentry : facture.getProduits().entrySet()) {
            prix = mapentry.getKey().getPrix() * mapentry.getValue().doubleValue();
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }
}
