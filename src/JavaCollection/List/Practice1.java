package JavaCollection.List;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("One");
        ls.add("Two");
        ls.add("Three");
        ls.add("Four");


        // Initial list
        System.out.println(ls);
        System.out.println(ls.size());

        // Voeg een item toe op een specifieke index
        ls.add(4, "five");
        System.out.println("After adding five: " + ls);

        // krijg een item via index
        String item1 = ls.get(2);
        System.out.println("Getting an item via an index: " + item1);

        //Verwijder een item via index
        ls.remove(1);
        System.out.println("After removing an item via an index: " + ls);

        //Verwijder een item via object
        ls.remove("Three");
        System.out.println("After removing an item via object: " + ls);

        // Controleer of een item in de lijst staat
        boolean containsOne = ls.contains("One");
        System.out.println("Contain one: " + containsOne);

        // Verkrijg de index van de lijst
        int indexOfOne = ls.indexOf("One");
        System.out.println("Index of One: " + indexOfOne);

        // Verkrijg de grotte van de lijst
        int si = ls.size();
        System.out.println("Size of the list: " + si);

        // Controleer of de lijst leeg is
        boolean isEmpty = ls.isEmpty();
        System.out.println("Is the list empyt? " + isEmpty);


    }


}
