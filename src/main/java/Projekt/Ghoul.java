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
     * Klasa ustalająca specjalną umiejętność obiektu <code>Ghoul</code>, która zwiększa <code>HP</code> obiektu co turę.
     */
    @Override
    public void special() {


        if(this.getHP()<30)
        {
            this.setHP(this.getHP()+3);
        }
        else
            this.setHP(this.getHP()+1);

    }



}

