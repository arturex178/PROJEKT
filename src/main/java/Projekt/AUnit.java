package Projekt;

import java.util.Random;

public abstract class AUnit extends AProperties implements ISpecial {


    Random rnd = new Random();

    @Override
    public boolean ifAlive()
    {
        if (this.getHP()>0) return true;
        else return false;
    }

    @Override
    public int decideDmg()
    {
        return this.getDmgDown() + rnd.nextInt(this.getDmgUp()-this.getDmgDown()+1);
    }

}

