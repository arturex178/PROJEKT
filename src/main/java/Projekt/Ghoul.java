package Projekt;

public class Ghoul extends AUnit{
    /**
     * Obiekt <code>Ghoul</code> dziedziczący po <code>AUnit</code>
     */
    public Ghoul()
    {
        this.setHP(70);
        this.setDmgDown(12);
        this.setDmgUp(20);
    }

    /**
     * Klasa ustalająca specjalną umiejętność obiektu <code>Ghoul</code>
     */
    @Override
    public void special() {   //Standardowe leczenie +1 na ture, gdy poniżej 30HP leczenie +3 na ture


        if(this.getHP()<30)
        {
            this.setHP(this.getHP()+3);
        }
        else
            this.setHP(this.getHP()+1);

    }



}

