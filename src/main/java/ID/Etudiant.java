package ID;

public class Etudiant {
    private String nom;
    private String prenom;
    private Integer numero;

    public Etudiant(String nom, String prenom, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getNumero() {
        return numero;
    }
}
