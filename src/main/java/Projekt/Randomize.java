package Projekt;

import java.util.Random;
/**
 * Klasa odpowiadająca za losowanie obiektów na mapie
 */
public class Randomize {
    /**
     * Konstruktor domyślny
     */
    public Randomize() {
    }

    /**
     * Funkcja rozlosowywuje liczby do tablicy na podstawie których na mapie będą rozmieszczane obiekty
     * @param map tablica przechowująca liczby odpowiadające obiektom na mapie
     * @param sizeX ilość wierzy tablicy
     * @param sizeY ilość kolumn tablicy
     */
    public void getRandomObjects(int[][] map, int sizeX, int sizeY)
    {
        Random rnd = new Random();
        for (int x = 0; x < sizeX; x++)
        {
            for (int y = 0; y < sizeY; y++)
            {
                if(map.length>=1)
                map[x][y] = rnd.nextInt(101);
            }
        }
    }
}
