package Projekt;

/**
 * Obiekt <code>Drowner</code> dziedziczący po klasie <code>AUnit</code>. Twory obiekty jednego z potworów.
 */
public class Drowner extends AUnit implements ISpecial{
    /**
     *Konstruktor przypisujący stałe wartości klasy <code>Drowner</code>
     */
    public Drowner()
    {
        this.setHP(40);
        this.setDmgUp(13);
        this.setDmgDown(8);

    }
    /**
     * Klasa ustalająca specjalną umiejętność obiektu <code>Drowner</code>, która zwięeksza obrażenia poniżej pewnego progu <code>HP</code>.
     */
    public void special() {
        if(this.getHP()<20) {
            setDmgUp(15);
            setDmgDown(10);
        }
    }

}



