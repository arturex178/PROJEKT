package Projekt;

import java.util.Random;

public class Randomize {

    public Randomize() {
    }

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
