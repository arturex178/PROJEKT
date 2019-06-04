package Projekt;


public abstract class AProperties{

    private int HP;
    private int DmgUp;
    private int DmgDown;
    private int positionX;
    private int positionY;

    public AProperties(){}

    public void setHP(int HP){
        this.HP=HP;
    }
    public int getHP(){
        return HP;
    }

    public void setDmgUp(int DmgUp){

        this.DmgUp=DmgUp;
    }
    public int getDmgUp(){

        return DmgUp;
    }

    public void setDmgDown(int DmgDown){

        this.DmgDown=DmgDown;
    }
    public int getDmgDown(){

        return DmgDown;
    }


    public void setPositionX(int positionX)
    {
        this.positionX = positionX;
    }
    public int getPositionX()
    {
        return this.positionX;

    }
    public void setPositionY(int positionY)
    {
        this.positionY = positionY;
    }
    public int getPositionY()
    {
        return this.positionY;
    }


}

