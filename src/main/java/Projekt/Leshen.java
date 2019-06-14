package Projekt;

public class Leshen extends AUnit implements ISpecial {

    public Leshen() {
        this.setHP(130);
        this.setDmgDown(20);
        this.setDmgUp(25);

    }

    @Override
    public void special() {
        if(getHP()>100){
            setDmgDown(30);
            setDmgUp(35);
        }
    }
}
