package Liskov;

public class Test {
    public static void main(String[] args) {
        MatriceYoung matrice = new MatriceYoung(2, 2);
        System.out.println("Début de l'insertion...");
        matrice.add(2);
        matrice.add(1);
        matrice.add(8);
        matrice.add(4);

        System.out.println("Tableau de Young après insertion:");
        matrice.printTabbleau();

        System.out.println("Extraction du minimum: " + matrice.extraireMin());
        System.out.println("Tableau après extraction:");
        matrice.printTabbleau();
    }
}
