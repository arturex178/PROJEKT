package Projekt;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static Projekt.Construct.*;
import static Projekt.Main.mainMap;


public class Boot{

    int currentPosition;
    boolean result = true;
    boolean first = true;

    public Boot() {
        beginSession(20);

        Tile WitcherTile = new Tile(0,0,64,64,TileType.Witcher);
        Tile SwordTile = new Tile(0,0,64,64,TileType.Sword);
        Tile DrownerTile = new Tile(0,0,64,64,TileType.Drowner);
        Tile WywernTile = new Tile(0,0,64,64,TileType.Wywern);
        Tile LeshenTile = new Tile(0,0,64,64,TileType.Leshen);
        Tile GhoulTile = new Tile(0,0,64,64,TileType.Ghoul);
        Tile PotinTile = new Tile(0,0,64,64,TileType.Potion);
        Tile Background = new Tile(0,0,2064,2064,TileType.Background);
        Texture background_4 = LoadTexture("textures/Background_4.jpg", "JPG", true);

        Witcher witcher = new Witcher(WitcherTile.getTexture(),10, 10, 64, 64, 1f);
        System.out.println("HP" + witcher.getHP());
        while (!Display.isCloseRequested()) {
            //drawBackgroundQuad(background_4, 0,0,2064,2064);
            Background.Draw(0,0);
                for (int x = 0; x < 20; x++) {
                    for (int y = 0; y < 20; y++) {
                        if (mainMap.MAP.length >= 1) {


                            currentPosition = mainMap.MAP[x][y];
                            if (currentPosition >= 50 && currentPosition < 66) {
                                DrownerTile.Draw(64 * x, 64 * y);
                            } else if (currentPosition >= 66 && currentPosition < 81) {
                                GhoulTile.Draw(64 * x, 64 * y);
                            } else if (currentPosition >= 81 && currentPosition < 91) {
                                LeshenTile.Draw(64 * x, 64 * y);
                            } else if (currentPosition >= 91 && currentPosition < 101) {
                                WywernTile.Draw(64 * x, 64 * y);
                            } else if(currentPosition >0 && currentPosition <25){
                                PotinTile.Draw(64 * x,64 * y);
                            } else if(currentPosition >=25 && currentPosition <50) {
                                SwordTile.Draw(64 * x,64 * y);
                            }
                        }
                    }
                }
                if(result)
                {
                    Clock.update();
                    witcher.Draw();
                    witcher.move();
                    System.out.println(witcher.getPositionX() + "  " + witcher.getPositionY() + "<- witcher");
                    result = witcher.interact();
                    System.out.println("HP" + witcher.getHP());
                }
                else
                {
                    if(first)
                    {
                        Display.destroy();
                        Sys.alert("Result", "Witcher is dead!");
                        System.exit(0);
                        first = false;
                    }
                }

                Display.update();
                Display.sync(1);

        }
        Display.destroy();
    }
}


//          witcher.Update();
//         if(witcher.getPositionX()==witcher.destinationX && witcher.getPositionY()==witcher.destinationY)
