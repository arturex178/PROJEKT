package Projekt;


import org.newdawn.slick.opengl.Texture;

/**
 * Klasa <code>AProperties</code> po której dziedziczy <code>AUnit</code> , <code>Sword</code> , <code>Potion</code>
  */
public abstract class AProperties{

    private int HP;
    private int DmgUp;
    private int DmgDown;
    private int positionX;
    private int positionY;

    /**
     * Konstruktor domyślny
     */
    public AProperties(){}

    /**
     * ustawia HP obiektu
     * @param HP odpowiada za HP obiektu
     */
    public void setHP(int HP){
        this.HP=HP;
    }

    /**
     * Zwraca HP obiektu
     * @return zwraca HP obiektu
     */
    public int getHP(){
        return HP;
    }

    /**
     * Ustawia maksymalne obrażenia obiektu
     * @param DmgUp odpowiada za maksymalne obrażenia obiektu
     */
    public void setDmgUp(int DmgUp){

        this.DmgUp=DmgUp;
    }

    /**
     * Zwraca maksymalne obrażenia obiektu
     * @return Zwraca maksymalne obrażenia obiektu
     */
    public int getDmgUp(){

        return DmgUp;
    }

    /**
     * Ustawia minimalne obrażenia obiektu
     * @param DmgDown odpowiada za minimalne obrażenia obiektu
     */
    public void setDmgDown(int DmgDown){

        this.DmgDown=DmgDown;
    }

    /**
     * Zwraca minimalne obrażenia obiektu
     * @return Zwraca minimalne obrażenia obiektu
     */
    public int getDmgDown(){

        return DmgDown;
    }

    /**
     * Ustawia pozycję obiektu na mapie(współrzędna x)
     * @param positionX odpowiada za pozycję obiektu na mapie(współrzędna x)
     */
    public void setPositionX(int positionX)
    {
        this.positionX = positionX;
    }

    /**
     * Zwraca pozycję obiektu na mapie (współrzędna x)
     * @return Zwraca pozycję obiektu na mapie (współrzędna x)
     */
    public int getPositionX()
    {
        return this.positionX;

    }

    /**
     * Ustawia pozycję obiektu na mapie (współrzędna Y)
     * @param positionY odpowiada za pozycję obiektu na mapie (współrzędna Y)
     */
    public void setPositionY(int positionY)
    {
        this.positionY = positionY;
    }

    /**
     * Zwraca pozycję obiektu na mapie (współrzędna Y)
     * @return Zwraca pozycję obiektu na mapie (współrzędna Y)
     */
    public int getPositionY()
    {
        return this.positionY;
    }


}

