import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Hoerbar> zoo = new ArrayList<>();

        // füge Katze hinzu 3x
        zoo.add(new Katze());
        zoo.add(new Katze());
        zoo.add(new Katze());

        // füge Hunde hinzu 2x
        zoo.add(new Hund());
        zoo.add(new Hund());

        // füge Wellesittiche hinzu 4x
        zoo.add(new Wellensittich());
        zoo.add(new Wellensittich());
        zoo.add(new Wellensittich());
        zoo.add(new Wellensittich());

        // fügt 1x Auto dem Zoo hinzu
        zoo.add(new Auto());

        Iterator<Hoerbar> iterator = zoo.iterator();

        int vb = 0;
        int zb = 0;
        int at = 0;
        while(iterator.hasNext()){
            Hoerbar x = iterator.next();
            if(x instanceof Vierbeiner)
                vb++;
            if(x instanceof Zweibeiner)
                zb++;
            if(x instanceof Auto)
                at++;
            System.out.println(x.gibLaut());
        }
        System.out.println("Es sind " + vb + " Vierbeiner und " + zb + " Zweibeiner im Zoo. " + at +" Zoowächter-Auto" +
                " gibt es im Zoo auch noch.");
    }
}
