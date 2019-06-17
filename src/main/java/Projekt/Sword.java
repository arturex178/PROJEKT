package Projekt;
/**
Obiekt <code>Sword</code> dziedziczący po <code>Aproperties</code>
 */
public class Sword extends AProperties{
    /**
     * Konstruktor klasy <code>Sword</code>
     * @param DmgUp Maksymalne obrażenia miecza
     * @param DmgDown Minimalne obrażnia miecza
     */
    public Sword(int DmgUp, int DmgDown)
    {
        this.setDmgUp(DmgUp);
        this.setDmgDown(DmgDown);
    }

}

