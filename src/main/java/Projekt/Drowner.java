package Projekt;

public class Drowner extends AUnit implements ISpecial{

    public Drowner()
    {
        this.setHP(40);
        this.setDmgUp(13);
        this.setDmgDown(8);

    }

    public void special() {
        if(this.getHP()<20) {
            setDmgUp(15);
            setDmgDown(10);
        }
    }

}



