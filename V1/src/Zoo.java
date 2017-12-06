import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Lebewesen> zoo = new ArrayList<>();

        // füge Katze hinzu 3x
        zoo.add(new Katze());
        zoo.add(new Katze());
        zoo.add(new Katze());

        // füge Hunde hinzu 2x
        zoo.add(new Hund());
        zoo.add(new Hund());

        // füge Wellesittiche 4x
        zoo.add(new Wellensittich());
        zoo.add(new Wellensittich());
        zoo.add(new Wellensittich());
        zoo.add(new Wellensittich());

        Iterator<Lebewesen> iterator = zoo.iterator();

        int vb = 0;
        int zb = 0;
        while(iterator.hasNext()){
            Lebewesen l = iterator.next();
            if(l instanceof Vierbeiner)
                vb++;
            if(l instanceof Zweibeiner)
                zb++;
            System.out.println(l.gibLaut());
        }
        System.out.println("Es sind " + vb + " Vierbeiner und " + zb + " Zweibeiner im Zoo.");
    }
}
