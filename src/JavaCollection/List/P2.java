package JavaCollection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P2 {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 3, 7));

        System.out.println("Originele lijst: " + ls);

        // Sorteer de lijst
        Collections.sort(ls);
        System.out.println("Gesorteerde lijst: " + ls);

        // Draai de lijst om
        Collections.reverse(ls);
        System.out.println("Omgekeerde lijst: " + ls);

        //Zoek de grootste waarde
        int max = Collections.max(ls);
        System.out.println("Grootste waarde van de lijst: " + max);

        // Zoek de kleinste waarde
        int min = Collections.min(ls);
        System.out.println("Kleinste waarde van de lijst: " + min);

        // Schud de lijst willekeurig
        Collections.shuffle(ls);
        System.out.println("Geschudde lijst: " + ls);

        // Tel hoe vaak het getaal 3 voorkomt
        int count = Collections.frequency(ls,3);
        System.out.println("Aantal keren dat 3 voorkomt: " + count);

        // Maak een onwijzigbare (read-only) versie van de lijst
        List<Integer> readOnlyList = Collections.unmodifiableList(ls);
        System.out.println("Read only lijst: " + readOnlyList);

        // Toevoegen naar de lijst
        ls.add(10);
        System.out.println("Na toevoegen een waarde naar de lijst: " + ls);


    }
}
