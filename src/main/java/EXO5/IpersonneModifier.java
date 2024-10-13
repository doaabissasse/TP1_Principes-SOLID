package EXO5;

import java.time.LocalDate;

public interface IAnniversaire {
    String getNom();
    LocalDate getDateNaissance();
    int calculerAge();
    void envoyerMessage(String message);
}
