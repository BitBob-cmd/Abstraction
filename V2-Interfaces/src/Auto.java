/**
 * Ein Auto das auch geräusche abgeben kann
 *
 * @author n1k
 * @version 2017.0.0.1
 */
public class Auto implements Hoerbar {
    // Attribute

    // Konstruktor der nichts kann/macht
    public Auto(){};

    @Override
    public String gibLaut() {
        return "Brumm";
    }
}
