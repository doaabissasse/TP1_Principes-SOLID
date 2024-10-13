package EXO5;

import java.time.LocalDate;
import java.util.List;

public interface IPersonne {
    String getNom();
    String getPrenom();
    LocalDate getDateNaissance();
    void setNom(String nom);
    void setPrenom(String prenom);
    void setDateNaissance(LocalDate dateNaissance);
    int calculerAge();
    void envoyerEmail(String message, List<String> dest);
    void envoyerSMS(String message,String tel);
}
