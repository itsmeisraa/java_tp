import java.util.*;

public class exo2 {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>( //dup exists
            Arrays.asList("apple", "banana", "cherry", "apple", "banana")
        );

       
        Set<Integer> ensemble = new HashSet<>( //dup thrown away.
            Arrays.asList(10, 20, 30, 10, 20)
        );

       
        Map<String, Integer> map = new HashMap<>();
        map.put("apple",  1);
        map.put("banana", 2);
        map.put("cherry", 3);

        liste.add("date");               
        boolean ajouteDouble = ensemble.add(30); 
        System.out.println("Ajout doublon 30 : " + ajouteDouble);
        map.put("date", 4);               

        

        System.out.println("\n Parcours de la liste (for-each)");
        for (String s : liste) {
            System.out.println(s);
        }

        System.out.println("\n Parcours de l'ensemble (Iterator)");
        Iterator<Integer> it = ensemble.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nParcours de la map (for-each entrySet)");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

       

        
        Collections.sort(liste);
        System.out.println("\n--- Liste triée ---");
        System.out.println(liste);

       
        int somme = 0;
        for (int v : ensemble) somme += v;
        System.out.println("\nSomme de l'ensemble : " + somme);

        // Vérifier si la map contient la clé "cherry"
        System.out.println("\nLa map contient 'cherry' ? " + map.containsKey("cherry"));
        if (map.containsKey("cherry")) {
            System.out.println("Valeur de 'cherry' : " + map.get("cherry"));
        }
    }
}