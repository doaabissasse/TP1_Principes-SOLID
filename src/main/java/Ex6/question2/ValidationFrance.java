package question2;

public class ValidationFrance implements Validation {
	public boolean peutBoireAlcool(int age) {
        return age >= 18;
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 13;
    }

    public boolean peutEtreEluMaire(int age) {
        return age >= 21;
    }
}
