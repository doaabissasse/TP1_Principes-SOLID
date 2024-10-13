package question1;

public class ValidationAge {
	
		public boolean peutBoireAlcool(int age, String region) {
	        switch (region.toLowerCase()) {
	            case "france":
	                return age >= 18;
	            case "usa":
	                return age >= 21;
	            case "brésil":
	                return age >= 18;
	            case "japon":
	                return age >= 20;
	            // Ajouter d'autres régions si nécessaire
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
	            case "brésil":
	                return age >= 14;
	            case "japon":
	                return age >= 15;
	            // Ajouter d'autres régions si nécessaire
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
	            case "brésil":
	                return age >= 18; 
	            case "japon":
	                return age >= 25; 
	            // Ajouter d'autres régions si nécessaire
	            default:
	                return false; 
	        }
	    }

}
