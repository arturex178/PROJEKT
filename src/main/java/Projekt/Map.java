package Projekt;

import static Projekt.Main.MAINSIZE;

public class Map {

    public int mainSize = 20;

    public Map()
    {
    }


    public int[][] MAP = new int[mainSize][mainSize];
    public AProperties[] field = new AProperties[mainSize * mainSize];



        public void randomizeMap () {
            Randomize createMap = new Randomize();
            createMap.getRandomObjects(MAP, mainSize);

       /*     for (int x = 0; x < mainSize; x++) {
                for (int y = 0; y < mainSize; y++) {
                    if (MAP.length >= 1)
                        System.out.print(MAP[x][y] + "  ");
                }
                System.out.println();
            }*/

            int currentPosition;
            int howMany = 0;

            for (int x = 0; x < mainSize; x++) {
                for (int y = 0; y < mainSize; y++) {
                    if (MAP.length >= 1) {
                        currentPosition = MAP[x][y];
                        if (currentPosition >= 50 && currentPosition < 66) {
                           // field[howMany] = new Drowner();
                           // field[howMany].setPositionX(x);
                           // field[howMany].setPositionY(y);
                            howMany++;

                        } else if (currentPosition >= 66 && currentPosition < 81) {

                            field[howMany] = new Ghoul();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);

                            howMany++;
                        } else if (currentPosition >= 81 && currentPosition < 91) {
                            field[howMany] = new Wywern();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;

                        }
                        else if (currentPosition >= 91 && currentPosition < 101) {

                            field[howMany] = new Leshen();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                        }
                    }
                }
            }
            System.out.println(field[4] instanceof Ghoul);
            System.out.println(field[4] instanceof Drowner);
            System.out.println(field[4] instanceof Wywern);
            System.out.println(field[4] instanceof Leshen);
        }
}




