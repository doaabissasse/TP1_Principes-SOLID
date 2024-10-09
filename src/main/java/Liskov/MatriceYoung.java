package Liskov;

import java.util.ArrayList;

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
public class MatriceYoung  extends ArrayList<Object> {
    private static final int INF = Integer.MAX_VALUE;
    private int n;
    private int m;
    public MatriceYoung(int n , int m ) {
        super(n);
        this.n=n;
        this.m = m;
        for (int i = 0; i < n; n++){
            this.add(new ArrayList<Integer>(m));
            for (int j = 0; j < m; j++){
                this.setElement(i,j,INF);
            }
        }
    }
    public int extraireMin(){
        /*Aucun élément n'est inséré dans le tableau*/
        if(this.getElement(0,0) == INF ){
            return INF;
        }
        else{
            int min = this.getElement(0,0);
            equilibrerTableau(0,0);
            return min;
        }
    }
    @Override
    public boolean add(Object o){
        int key = (Integer)(o);
        if (getElement(n - 1, m-1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }
        // Insérer la clé dans la dernière position (case en bas à droite)
        this.setElement(n-1, m-1, key);
        // Maintenir la propriété du tableau de Young
        int i = n - 1;
        int j = m - 1;
        while (i > 0 || j > 0) {
            int top = (i > 0) ? this.getElement(i - 1,j-1) : INF;
            int left = (j > 0) ? this.getElement(i - 1,j) : INF;

            if (key < top && key < left) {
                break;  // Key is in the right place
            } else if (top < left) {
                this.setElement(i - 1,j, top);
                i--;
            } else {
                this.setElement(i - 1,j, left);
                j--;
            }
        }
        this.setElement(i - 1,j,key);
        return true;
    }
    // Fonction pour rétablir la propriété du tableau de Young après l'extraction du minimum
    private void equilibrerTableau(int i , int j){
        int down = (i + 1 < n) ? this.getElement(i + 1,j) : INF;
        int right = (j + 1 < m) ? this.getElement(i,j + 1) : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            this.setElement(i,j,down);
            equilibrerTableau(i + 1, j);
        } else {
            this.setElement(i,j,right);
            equilibrerTableau(i, j + 1);
        }
    }
    public void printTabbleau(){
        for(int i = 0; i < n; i++){
            for(int j= 0; j< m; j++){

                if(this.getElement(i,j)==INF){
                    System.out.print("INF" + ";");
                }
                else{
                    System.out.print(this.getElement(i,j) + ";");
                }
            }
            System.out.println();
        }
    }
    private int getElement(int i,int j){
        return ((ArrayList<Integer>) this.get(i)).get(j);
    }
    private void setElement(int i, int j , int valeur){
        ((ArrayList<Integer>) this.get(i)).set(j,valeur);
    }
}