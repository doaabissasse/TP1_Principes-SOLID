package question1;

public class ValidationAge {
	
		public boolean peutBoireAlcool(int age, String region) {
	        switch (region.toLowerCase()) {
	            case "france":
	                return age >= 18;
	            case "usa":
	                return age >= 21;
	            case "br�sil":
	                return age >= 18;
	            case "japon":
	                return age >= 20;
	            // Ajouter d'autres r�gions si n�cessaire
	            default:
	                return false; 
	        }
		}

	    public boolean peutUtiliserFesseBouk(int age, String region) {
	        switch (region.toLowerCase()) {
	            case "france":
	                return age >= 13;
	            case "usa":
	                return age >= 13; 
	            case "br�sil":
	                return age >= 14;
	            case "japon":
	                return age >= 15;
	            // Ajouter d'autres r�gions si n�cessaire
	            default:
	                return false; 
	        }
	    }

	    public boolean peutEtreEluMaire(int age, String region) {
	        switch (region.toLowerCase()) {
	            case "france":
	                return age >= 21;
	            case "usa":
	                return age >= 18; 
	            case "br�sil":
	                return age >= 18; 
	            case "japon":
	                return age >= 25; 
	            // Ajouter d'autres r�gions si n�cessaire
	            default:
	                return false; 
	        }
	    }

}
