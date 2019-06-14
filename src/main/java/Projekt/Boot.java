package Projekt;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static Projekt.Construct.*;
import static Projekt.Main.mainMap;


public class Boot {


    int currentPosition;

    public Boot() {
        beginSession();


        Tile WitcherTile = new Tile(0,0,64,64,TileType.Witcher);
        Tile SwordTile = new Tile(0,0,64,64,TileType.Sword);
        Tile DrownerTile = new Tile(0,0,64,64,TileType.Drowner);

  /*      Texture WywernTex = LoadTexture("textures/Wywern_Texture.jpg", "JPG");
        Texture DrownerTex = LoadTexture("textures/Drowner_Texture.jpg", "JPG");
        Texture LeshenTex = LoadTexture("textures/Leshen_Texture.jpg", "JPG");

        Texture SwordTex = LoadTexture("textures/Sword_3.png", "PNG");
        Texture WitcherTex = LoadTexture("textures/Witcher_Texture.png", "PNG");
*/

        Texture background_4 = LoadTexture("textures/Background_4.jpg", "JPG", true);

        Drowner drowner = new Drowner(DrownerTile.getTexture(),10*64, 10*64, 64, 64, 5f);


        while (!Display.isCloseRequested()) {

            drawBackgroundQuad(background_4, 0,0,2064,2064);
            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 20; y++) {
                    if (mainMap.MAP.length >= 1) {
                        currentPosition=mainMap.MAP[x][y];

                        if (currentPosition >= 50 && currentPosition < 66) {
                           // DrownerTile.Draw(64*x,64*y);
                        } else if (currentPosition >= 66 && currentPosition < 81) {
                            WitcherTile.Draw(64*x,64*y);
                        } else if (currentPosition >= 81 && currentPosition < 91) {
                            SwordTile.Draw(64*x,64*y);
                         //   drawTexQuad(LeshenTex, y * 64, x * 64, 64, 64);
                        } else if (currentPosition >= 91 && currentPosition < 101) {
                         //   drawTexQuad(WywernTex, y * 64, x * 64, 64, 64);
                        }
                        //else drawTexQuad(background_2, y * 64, x * 64, 64, 64);

                    }

                }
            }

            Clock.update();
            drowner.Draw();
            drowner.Update();


            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }
}


