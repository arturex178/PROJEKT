package Projekt;

import java.util.Random;

/**
 * Klasa <code>AUnit</code> dziedziczy po <code>AProperties</code> jest nadklasą dla <code>Witcher</code> , <code>Drowner</code> , <code>Ghoul</code> , <code>Leshen</code> , <code>Wywern</code> , oraz implementuje <code> ISpecial</code>
  */
public abstract class AUnit extends AProperties implements ISpecial {


    Random rnd = new Random();

    /**
     * Sprawdza czy obiekt jest żyjący(czy ma dodatnie HP)
     * @return true albo false w zależności czy obiekt żyje
     */
    @Override
    public boolean ifAlive()
    {
        if (this.getHP()>0) return true;
        else return false;
    }

    /**
     * Losuje obrażenia z przedziału
     * @return zwraca ostateczną liczbę obrażeń
     */
    @Override
    public int decideDmg()
    {
        return (this.getDmgDown() + rnd.nextInt((this.getDmgUp() - this.getDmgDown())+1));
    }

}

