import java.util.Arrays;
import java.util.Random;

public class exo1 {

    //Déclaration
    public static int[] initialiserTableau() {
        int[] tab = new int[10];
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100) + 1; 
        }
        return tab;
    }

    //Parcourir le tableau
    public static void parcourirTableau(int[] tab) {
        System.out.println("Parcours du tableau");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }

    //  Copier le tableau
    public static void copierTableau(int[] original) {
        int[] copie = new int[original.length];
        System.arraycopy(original, 0, copie, 0, original.length);
        
        System.out.println("Vérification des copies");
        System.out.println("Original : " + Arrays.toString(original));
        System.out.println("Copie    : " + Arrays.toString(copie));
        System.out.println("Identiques ? " + Arrays.equals(original, copie));
    }

    //Trier le tableau
    public static int[] trierTableau(int[] tab) {
        int[] trie = tab.clone();
        Arrays.sort(trie);
        System.out.println("Tableau trié");
        System.out.println(Arrays.toString(trie));
        return trie;
    }

    //Recherche dans le tableau 
    public static void rechercherValeur(int[] tabTrie, int valeur) {
        System.out.println("Recherche de " + valeur);
        int index = Arrays.binarySearch(tabTrie, valeur);
        if (index >= 0) {
            System.out.println("Valeur " + valeur + " trouvée à l'index " + index);
        } else {
            System.out.println("Valeur " + valeur + " non trouvée dans le tableau.");
        }
    }

    //main
    public static void main(String[] args) {
        int[] tab     = initialiserTableau();
        parcourirTableau(tab);
        copierTableau(tab);
        int[] tabTrie = trierTableau(tab);
        rechercherValeur(tabTrie, 50);
    }
}