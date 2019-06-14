package Projekt;

public class Potion extends AProperties
{
    public Potion()
    {
        this.setHP(20);
    }

    void heal(Witcher witcher){
        if(witcher.getHP()<100 && witcher.getNumberOfPotions()>0){
            witcher.setHP(witcher.getHP() + this.getHP());
        }
    }
}
