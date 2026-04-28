import java.util.*;

public class exo3 {

    public static void main(String[] args) {
        
         
        
        Set<Integer> hashEntiers = new HashSet<>(
            Arrays.asList(10, 20, 30, 10, 20)
        );

        
        TreeSet<String> treeChaines = new TreeSet<>(
            Arrays.asList("apple", "banana", "cherry", "apple", "banana")
        );

        // test d'ajout de doublons 
        System.out.println("Ajout de doublons");
        boolean r1 = hashEntiers.add(20);         // 20 déjà là -> false
        boolean r2 = treeChaines.add("banana");   // "banana" déjà là -> false
        System.out.println("add(20) sur HashSet  : " + r1);
        System.out.println("add(banana) sur TreeSet : " + r2);

        // suppression de quelques éléments pour voir
        hashEntiers.remove(10);          
        treeChaines.remove("cherry");   
        System.out.println("\nHashSet après remove(10)     : " + hashEntiers);
        System.out.println("TreeSet après remove(cherry) : " + treeChaines);

        
        System.out.println("\nParcours HashSet (entiers) via Iterator ===");
        Iterator<Integer> itInt = hashEntiers.iterator();
        while (itInt.hasNext()) {
            System.out.print(itInt.next() + "  ");
        }
        System.out.println();

        // parcours du TreeSet : l'Iterator suit l'ordre naturel (alphabétique)
        System.out.println("\n=== Parcours TreeSet (chaînes) via Iterator ===");
        Iterator<String> itStr = treeChaines.iterator();
        while (itStr.hasNext()) {
            System.out.print(itStr.next() + "  ");
        }
        System.out.println();

        // affichage direct des ensembles – ça montre bien la différence d'ordre
        System.out.println("\n=== Contenu brut ===");
        System.out.println("HashSet (ordre indéfini) : " + hashEntiers);
        System.out.println("TreeSet (ordre naturel)  : " + treeChaines);

        // fonctions spécifiques au TreeSet : first() et last()
        // (HashSet ne les a pas car pas d'ordre)
        System.out.println("\n=== first() et last() du TreeSet ===");
        System.out.println("Premier élément : " + treeChaines.first());
        System.out.println("Dernier élément : " + treeChaines.last());
    }
}