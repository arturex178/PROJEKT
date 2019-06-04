package Projekt;

public class Ghoul extends AUnit{



    public Ghoul()
    {
        this.setHP(70);
        this.setDmgDown(12);
        this.setDmgUp(20);
    }

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

