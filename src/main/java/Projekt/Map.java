package Projekt;
import java.util.Random;

import static Projekt.Main.sizeX;
import static Projekt.Main.sizeY;


public class Map {
    Random rnd = new Random();
    public int[][] MAP = new int[sizeX][sizeY];
    public AProperties[] field = new AProperties[sizeX * sizeY];
    private int howManyMonsters;

        public void randomizeMap () {
            Randomize createMap = new Randomize();
            createMap.getRandomObjects(MAP, sizeX, sizeY);

            int currentPosition;
            int howMany=0;

            for (int x = 0; x < field.length; x++)
            {
                field[x] = null;
            }
            howManyMonsters = 0;
            for (int x = 0; x < MAP.length; x++) {
                for (int y = 0; y < MAP[x].length; y++) {
                    if (MAP.length >= 1) {
                        currentPosition = MAP[x][y];
                        if (currentPosition >= 50 && currentPosition < 66) {
                            field[howMany] = new Drowner();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                            howManyMonsters++;
                        } else if (currentPosition >= 70 && currentPosition < 81) {

                            field[howMany] = new Ghoul();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                            howManyMonsters++;
                        } else if (currentPosition >= 80 && currentPosition < 91) {

                            field[howMany] = new Leshen();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                            howManyMonsters++;
                        }  else if (currentPosition >= 95 && currentPosition < 101) {
                            field[howMany] = new Wywern();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                        }
                        if(currentPosition >=5 && currentPosition <25){
                            field[howMany] = new Potion();
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                            howManyMonsters++;
                        }
                        if(currentPosition >=35 && currentPosition <50){
                            int dmgDown;
                            dmgDown = 10 + rnd.nextInt(41);
                            field[howMany] = new Sword(dmgDown + rnd.nextInt(10)+5,dmgDown);
                            System.out.println(field[howMany].getDmgUp() + "    " + field[howMany].getDmgDown());
                            field[howMany].setPositionX(x);
                            field[howMany].setPositionY(y);
                            howMany++;
                        }
                    }
                }
            }
        }

        public int getHowManyMonsters()
        {
            return howManyMonsters;
        }
}




