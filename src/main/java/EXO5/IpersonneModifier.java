package EXO5;

import java.time.LocalDate;

public interface IpersonneModifier {
    String getNom();
    LocalDate getDateNaissance();
    int calculerAge();
    void envoyerMessage(String message);
}
