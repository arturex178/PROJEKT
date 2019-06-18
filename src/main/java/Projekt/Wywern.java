package Projekt;

/**
 * Obiekt <code>Wywern</code> dziedziczący po <code>Aunit</code>
 */
public class Wywern extends AUnit{
    /**
     *Konstruktor przypisujący stałe wartości klasy <code>Wywern</code>
     */
    public Wywern()
    {
        this.setHP(200);
        this.setDmgDown(20);
        this.setDmgUp(35);
        }

    /**
     * Klasa ustalająca specjalną umiejętność obiektu <code>Wywern</code>, która zwiększa rozrzut możliwych obrażeń poniżej pewnego progu <code>HP</code>.
     */
    @Override
    public void special() {
        if(this.getHP()<50){
            setDmgUp(45);
            setDmgDown(1);
        }
    }

}
