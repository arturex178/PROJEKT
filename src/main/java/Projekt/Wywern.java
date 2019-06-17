package Projekt;

/**
 * Obiekt <code>Wywern</code> dziedziczący po <code>Aunit</code> implemętujący interfejs <code>ISpecial</code>
 */
public class Wywern extends AUnit implements ISpecial{
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
     * Klasa ustalająca specjalną umiejętność obiektu <code>Wywern</code>
     */
    @Override
    public void special() {
        if(this.getHP()<50){
            setDmgUp(15);
            setDmgDown(10);
        }
    }

}
