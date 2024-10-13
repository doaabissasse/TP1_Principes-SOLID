package Liskov;

import static java.lang.Integer.MAX_VALUE;


/*Un tableau de Young (ou tableau de Young-Ferrers) est une disposition d'entiers dans un tableau de cases,
 où les lignes et les colonnes sont ordonnées de manière croissante.
Plus formellement, un tableau de Young remplit ces deux conditions :
 */
/*Les nombres dans chaque ligne sont disposés dans un ordre croissant, c'est-à-dire que
 chaque élément dans une ligne est inférieur ou égal à celui qui le suit.
 */
/*Les nombres dans chaque colonne sont également disposés dans un ordre croissant, c'est-à-dire
que chaque élément dans une colonne est inférieur ou égal à celui qui se trouve en dessous.
 */
/*Le tableau de Young doit implementer deux opérations : Extraire Min et inserer, il faut garder les deux
conditions valables aprs chaque opération.
 */
 /*Exemple :
        1  2  3
        2  4  5
        6  7  8

  */
public class MatriceYoung {
    private static final int INF = Integer.MAX_VALUE;
    private int n;
    private int m;
    private int[][] matrice;

    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrice = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrice[i][j] = INF;
            }
        }
    }

    public int extraireMin() {
        if (matrice[0][0] == INF) {
            return INF; // Aucun élément à extraire
        } else {
            int min = matrice[0][0];
            matrice[0][0] = INF;
            equilibrerTableau(0, 0);
            return min;
        }
    }

    public boolean add(int key) {
        if (matrice[n - 1][m - 1] != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        // Insérer la clé à la dernière position disponible
        matrice[n - 1][m - 1] = key;
        int i = n - 1;
        int j = m - 1;

        // Remonter la clé pour maintenir les propriétés du tableau de Young
        while ((i > 0 && matrice[i - 1][j] > matrice[i][j]) || (j > 0 && matrice[i][j - 1] > matrice[i][j])) {
            // Si l'élément du dessus est plus grand, permuter avec lui
            if (i > 0 && matrice[i - 1][j] > matrice[i][j]) {
                int temp = matrice[i - 1][j];
                matrice[i - 1][j] = matrice[i][j];
                matrice[i][j] = temp;
                i--; // Remonter dans la matrice
            } else if (j > 0 && matrice[i][j - 1] > matrice[i][j]) {
                // Si l'élément de gauche est plus grand, permuter avec lui
                int temp = matrice[i][j - 1];
                matrice[i][j - 1] = matrice[i][j];
                matrice[i][j] = temp;
                j--; // Aller à gauche dans la matrice
            }
        }

        return true;
    }


    // Fonction pour rétablir la propriété du tableau de Young après l'extraction du minimum
    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? matrice[i + 1][j] : INF;
        int right = (j + 1 < m) ? matrice[i][j + 1] : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            matrice[i][j] = down;
            equilibrerTableau(i + 1, j);
        } else {
            matrice[i][j] = right;
            equilibrerTableau(i, j + 1);
        }
    }

    public void printTabbleau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrice[i][j] == INF) {
                    System.out.print("INF" + ";");
                } else {
                    System.out.print(matrice[i][j] + ";");
                }
            }
            System.out.println();
        }
    }

}
