package question2;

/* Single responsability principle
La classe ValidationAge gère toujours plusieurs responsabilités (vérifications d'âge pour différentes actions)
, ce qui peut être amélioré. 
*/

/* Opened Closed Principe
 Cette approche n'est pas totalement conforme à l'OCP, car chaque fois que nous souhaitons ajouter 
 ou modifier une règle d'âge pour une nouvelle région, nous devons modifier la classe existante.
*/

public interface Validation {
	boolean peutBoireAlcool(int age);
    boolean peutUtiliserFesseBouk(int age);
    boolean peutEtreEluMaire(int age);
}
