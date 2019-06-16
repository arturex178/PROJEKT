package Projekt;
import org.newdawn.slick.opengl.Texture;

import java.util.Random;

import static Projekt.Clock.Delta;
import static Projekt.Construct.drawTransparentQuad;
import static Projekt.Main.main;
import static Projekt.Main.mainMap;

public class Witcher extends AUnit{

    private int numberOfPotions = 0;
    private int width, height;
    private float speed;
    private Texture texture;
    public Witcher(Texture texture, int startPositionX, int startPositionY, int width, int height, float speed)
    {
        this.setHP(100);
        this.setDmgDown(9);
        this.setDmgUp(12);
        this.setPositionX(startPositionX);
        this.setPositionY(startPositionY);
        this.texture = texture;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }



    /*   public void Update() {
        if (first)
            first = false;
        else
        {
            if(destinationX*64 != getPositionX()*64)
            {
                setPositionX(Delta() * speed);
            }
            if(destinationY*64 != getPositionY()*64)
            {
                setPositionY(Delta() * speed);
            }
        }

    }
*/
    private Random rnd = new Random();
    public int getNumberOfPotions(){
        return this.numberOfPotions;
    }

    public void setNumberOfPotions(int numberOfPotions){
        this.numberOfPotions = numberOfPotions;
    }

    public boolean fight(AUnit enemy){

        while(this.getHP() > 0 && enemy.ifAlive()) {
            this.special();
            enemy.special();
            enemy.setHP(enemy.getHP() - this.decideDmg());
            this.setHP(this.getHP() - enemy.decideDmg());
        }
        return this.ifAlive();
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

    public void Draw()
    {
        drawTransparentQuad(texture, getPositionX()*64, getPositionY()*64, width, height);
    }

    public boolean interact(){
        boolean result;
            for(int i = 0; i < 400; i++)
            {
                if(mainMap.field[i] != null && mainMap.field[i].getPositionX() == this.getPositionX() &&
                        mainMap.field[i].getPositionY() == this.getPositionY())
                {
                    if(mainMap.field[i] instanceof AUnit && mainMap.field[i] != null){
                        result = fight((AUnit)mainMap.field[i]);
                        //System.out.println("After fight");
                        if(result){
                            mainMap.field[i] = null;
                        }
                        mainMap.MAP[getPositionX()][getPositionY()]=0;
                        return result;
                    }
                    if(mainMap.field[i] instanceof Potion) {
                    this.setNumberOfPotions(getNumberOfPotions() + 1);
                    //System.out.println("potion");
                        mainMap.MAP[getPositionX()][getPositionY()]=0;
                    return true;
                    }
                    if(mainMap.field[i] instanceof Sword) {
                        System.out.println("sword");
                        if((mainMap.field[i].getDmgUp() - mainMap.field[i].getDmgDown()) /2 >
                                (this.getDmgUp() - this.getDmgDown()) /2){
                            System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
                            this.setDmgUp(mainMap.field[i].getDmgUp());
                            this.setDmgDown(mainMap.field[i].getDmgDown());
                        }
                        mainMap.MAP[getPositionX()][getPositionY()]=0;

                    }
                    }
                }

            return true;
        }


}