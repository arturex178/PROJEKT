package Projekt;
import java.util.Random;
public class Witcher extends AUnit{

    private int numberOfPotions = 0;

    public Witcher()
    {
        this.setHP(500);
        this.setDmgDown(9);
        this.setDmgUp(12);
    }

    private Random rnd = new Random();
    public int getNumberOfPotions(){
        return this.numberOfPotions;
    }

    public void setNumberOfPotions(int numberOfPotions){
        this.numberOfPotions = numberOfPotions;
    }

    public void fight(AUnit enemy){

        while(this.getHP() > 0 && enemy.getHP() > 0) {
            this.special();
            enemy.special();
            enemy.setHP(enemy.getHP() - this.decideDmg());
            this.setHP(this.getHP() - enemy.decideDmg());
        }
//        if(enemy.getHP() == 0) {
  //          enemy.ifAlive() = false;
   //     } else ifAlive() = false;
    }

    @Override
    public void special()
    {

    }

    public void move()
    {
        switch (rnd.nextInt(4)){

        case 0:
            if(getPositionY() != 19){
                setPositionY(getPositionY() + 1);
            }
            else setPositionY(0);
            break;

        case 1:
            if(getPositionX() != 19){
                setPositionX(getPositionX() + 1);
            }
            else setPositionX(0);
            break;

        case 2:
            if(getPositionY() != 0){
                setPositionY(getPositionY() - 1);
            }
            else setPositionY(19);
            break;
        case 3:
            if(getPositionX() != 0){
                setPositionX(getPositionX() - 1);
            }
            else setPositionX(19);
        }
    }

    /*public void interact(AUnit object, Map map){

        for(int i = 0; i < 400; i++){
            if(map.field[i].getPositionX() == this.getPositionX() && map.field[i].getPositionY() == this.getPositionY())
            {
                if(map.field[i] instanceof AUnit){
                this.fight(map.field[i]);
                }
                if(map.field[i] instanceof Potion) {
                    this.setNumberOfPotions(getNumberOfPotions() + 1);
                }
                if(map.field[i] instanceof )

            }
            }

        }
            */

    }




