package Projekt;

/**
 * Obiekt <code>Leshen</code> dziedziczący po <code>AUnit</code>.
 */
public class Leshen extends AUnit implements ISpecial {
    /**
     * Konstruktor klasy <code>Leshen</code> ustawiający wartości cech obiektu
     */
    public Leshen() {
        this.setHP(130);
        this.setDmgDown(20);
        this.setDmgUp(25);

    }

    /**
     * Klasa ustalająca specjalną umiejętność obiektu <code>Leshen</code>, która zwiększa obrażenia powyżej pewnego progu <code>HP</code>.
     */
    @Override
    public void special() {
        if(getHP()>100){
            setDmgDown(30);
            setDmgUp(35);
        }
    }
}
