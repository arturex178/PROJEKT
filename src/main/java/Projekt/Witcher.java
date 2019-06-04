package Projekt;

public class Witcher extends AUnit{

    public Witcher()
    {
        this.setHP(500);
        this.setDmgDown(9);
        this.setDmgUp(12);
    }



    public void fight(AUnit enemy){

        while(this.getHP() > 0 && enemy.getHP() > 0) {
            enemy.setHP(enemy.getHP() - this.decideDmg());
            this.setHP(this.getHP() - enemy.decideDmg());
            this.special();
            enemy.special();;
        }

    }

    @Override
    public void special() {



    }


}

