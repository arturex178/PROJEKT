package Projekt;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import static Projekt.Construct.*;
import static Projekt.Main.*;

/**
 * Klasa, której konstruktor podejmuje sekwencyjne wykonywanie motod
 * dotyczących interakcji obiektu klasy <code>Witcher</code>, jego poruszania się i drukowania na mapę akutalnie istniejących obiektów.
 */
public class Boot{

    private int currentPosition;
    private boolean result = true;
    private boolean first = true;

    /**
     * Konstruktor inicjalizujący akcję obiektu kalsy <code>Witcher</code>
     */
    public Boot() {
        beginSession(sizeX, sizeY);

        Tile WitcherTile = new Tile(0,0,64,64,TileType.Witcher);
        Tile SwordTile = new Tile(0,0,64,64,TileType.Sword);
        Tile DrownerTile = new Tile(0,0,64,64,TileType.Drowner);
        Tile WywernTile = new Tile(0,0,64,64,TileType.Wywern);
        Tile LeshenTile = new Tile(0,0,64,64,TileType.Leshen);
        Tile GhoulTile = new Tile(0,0,64,64,TileType.Ghoul);
        Tile PotinTile = new Tile(0,0,64,64,TileType.Potion);
        Tile Background = new Tile(0,0,2*sizeX*64,2*sizeY*64,TileType.Background);

        Witcher witcher = new Witcher(WitcherTile.getTexture(),5, 5, 64, 64);
        System.out.println("HP" + witcher.getHP());

        while (!Display.isCloseRequested()) {

            Background.Draw(0,0);
                for (int x = 0; x < mainMap.MAP.length; x++) {
                    for (int y = 0; y < mainMap.MAP[x].length ; y++) {
                        if (mainMap.MAP.length >= 1) {


                            currentPosition = mainMap.MAP[x][y];
                            if (currentPosition >= 50 && currentPosition < 66) {
                                DrownerTile.Draw(64 * x, 64 * y);
                            } else if (currentPosition >= 70 && currentPosition < 81) {
                                GhoulTile.Draw(64 * x, 64 * y);
                            } else if (currentPosition >= 80 && currentPosition < 91) {
                                LeshenTile.Draw(64 * x, 64 * y);
                            } else if (currentPosition >= 95 && currentPosition < 101) {
                                WywernTile.Draw(64 * x, 64 * y);
                            } else if(currentPosition >=5 && currentPosition <25){
                                PotinTile.Draw(64 * x,64 * y);
                            } else if(currentPosition >=35 && currentPosition <50) {
                                SwordTile.Draw(64 * x,64 * y);
                            }
                        }
                    }
                }
                if(result)
                {

                    witcher.Draw();
                    witcher.move();
                    System.out.println(witcher.getPositionX() + "    " + witcher.getPositionY());
                    result = witcher.interact();
                    System.out.println("HP" + witcher.getHP());
                }
                else
                {
                    if(first)
                    {
                        Display.destroy();
                        Sys.alert("Result", "Witcher is dead!  Witcher killed: " + witcher.getHowManyKilled() + " monsters.");
                        System.exit(0);
                        first = false;
                    }
                }
                if(witcher.getHowManyKilled() > mainMap.getHowManyMonsters()*0.3)
                {
                    mainMap.randomizeMap();
                }

                Display.update();
                Display.sync(1);

        }
        Display.destroy();
    }
}
