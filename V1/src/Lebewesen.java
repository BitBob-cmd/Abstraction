/**
 * Haelt das Grundverhalten eines Lebewesens
 *
 * Abstrakte Methode gibLaut.
 *
 * @author n1k
 * @version 2017.0.0.1
 */
public abstract class Lebewesen {
    // Attribute
    private boolean lebt;

    // Konstructor, give them live!
    public Lebewesen(){
        this.lebt = true;
    }

    // Get if alive
    public boolean isLebt() {
        return lebt;
    }

    // Set alive
    public void setLebt(boolean lebt) {
        this.lebt = lebt;
    }
    // Abstract method, make some noise!!!
    public abstract String gibLaut();
}
