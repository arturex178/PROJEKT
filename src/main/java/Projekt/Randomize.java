package Projekt;

import java.util.Random;
/**
 * Klasa Randomize
 */
public class Randomize {
    /**
     * Konstruktor domyślny
     */
    public Randomize() {
    }

    /**
     * Funkcja rozlosowywuje liczby do tablice na podstawie których na mapie będą rozmieszczane obiekty
     * @param map tablica przechowująca liczby odpowiadające obiektom na mapie
     * @param size rozmiar tablicy
     */
    public void getRandomObjects(int[][] map, int size)
    {
        Random rnd = new Random();
        for (int x = 0; x < size; x++)
        {
            for (int y = 0; y < size; y++)
            {
                if(map.length>=1)
                map[x][y] = rnd.nextInt(101);
            }
        }
    }
}
