package Projekt;

public class Map {

    public int mainSize;


    public Map(int mainSize) {
         this.mainSize = mainSize;
    }

    public AProperties[] field = new AProperties[mainSize * mainSize];

    public void randomizeMap() {

        Randomize createMap = new Randomize();
        int[][] map = new int[mainSize][mainSize];
        createMap.getRandomObjects(map, mainSize);

        int currentPosition;
        int howMany = 0;

        for (int x = 0; x < mainSize; x++)
        {
            for (int y = 0; y < mainSize; y++)
            {

                currentPosition = map[x][y];

                if (currentPosition >= 50 && currentPosition < 66)
                {
                    field[howMany] = new Drowner();
                    field[howMany].setPositionX(x);
                    field[howMany].setPositionY(y);
                    howMany++;

                }
                if (currentPosition >= 66 && currentPosition < 81)
                {
                    field[howMany] = new Ghoul();
                    field[howMany].setPositionX(x);
                    field[howMany].setPositionY(y);
                    howMany++;

                }
                if (currentPosition >= 81 && currentPosition < 91)
                {
                    field[howMany] = new Wywern();
                    field[howMany].setPositionX(x);
                    field[howMany].setPositionY(y);
                    howMany++;

                }
                if (currentPosition >= 91 && currentPosition < 101)
                {
                    field[howMany] = new Leshen();
                    field[howMany].setPositionX(x);
                    field[howMany].setPositionY(y);
                    howMany++;

                }

            }
        }

    }
}

