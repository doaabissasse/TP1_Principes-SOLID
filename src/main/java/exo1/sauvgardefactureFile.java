package exo1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class sauvgardefactureFile {

    public void saveFacture(Facture facture) {
        try {
            // create a FileWriter object with the file name
            String file = "Facture".concat(String.valueOf(facture.getId()));
            FileWriter writer = new FileWriter(file);
            writer.write(facture.getId());
            // write the string to the file
            for (Map.Entry mapentry : facture.getProduits().entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() );
            }
            writer.write("Prix = " + facture.getTotal());
            writer.write("PrixTTC = " + facture.getTotalTTC());
            // close the writer
            writer.close();

            System.out.println("Successfully wrote text to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
