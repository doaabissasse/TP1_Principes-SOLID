package question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidationAge validationAge = new ValidationAge();

        System.out.println("Peut boire alcool (France, 18): " + validationAge.peutBoireAlcool(18, "France")); // true
        System.out.println("Peut boire alcool (USA, 18): " + validationAge.peutBoireAlcool(18, "USA")); // false
        System.out.println("Peut utiliser FesseBouk (Brésil, 14): " + validationAge.peutUtiliserFesseBouk(14, "Brésil")); // true
        System.out.println("Peut être élu maire (Japon, 25): " + validationAge.peutEtreEluMaire(25, "Japon")); // true
	}

}
