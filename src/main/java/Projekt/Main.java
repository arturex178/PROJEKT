package Projekt;

import javax.swing.*;

/**
 *klasa Main
 */
public class Main
{
    static int sizeX = 20;
    static int sizeY = 15;
    static int witcherHP;
    static public Map mainMap;

    public static void main( String[] args )
    {
        do
        {
            witcherHP = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Podaj początokową liczbę punktów życia Wiedźmina (min. 300):"));
        }while(witcherHP < 300);
        do {
            sizeX = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Podaj długość mapy (min - 7 ; max 30)"));
        }while (sizeX < 7 && sizeX > 30);
        do {
            sizeY = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Podaj szerokość mapy (min - 7 ; max 15"));
        }while (sizeY < 7 && sizeY > 15);

        mainMap = new Map();
        mainMap.randomizeMap();
        new Boot();

    }

}
