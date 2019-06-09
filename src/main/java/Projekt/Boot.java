package Projekt;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static Projekt.Construct.*;
import static Projekt.Main.mainMap;


public class Boot {


    int currentPosition;

    public Boot() {
        beginSession();

        Texture WywernTex = LoadTexture("textures/Wywern_Texture.jpg", "JPG");
        Texture DrownerTex = LoadTexture("textures/Drowner_Texture.jpg", "JPG");
        Texture GhoulTex = LoadTexture("textures/Ghoul_Texture.jpg", "JPG");
        Texture LeshenTex = LoadTexture("textures/Leshen_Texture.jpg", "JPG");
        Texture background_1 = LoadTexture("textures/Background_1.png", "PNG");
        Texture background_2 = LoadTexture("textures/Background_2.png", "PNG");

        while (!Display.isCloseRequested()) {

            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 20; y++) {
                    if (mainMap.MAP.length >= 1) {
                        currentPosition=mainMap.MAP[x][y];

                        if (currentPosition >= 50 && currentPosition < 66) {

                            drawTexQuad(DrownerTex, y * 64, x * 64, 64, 64);

                        } else if (currentPosition >= 66 && currentPosition < 81) {
                            drawTexQuad(GhoulTex, y * 64, x * 64, 64, 64);
                        } else if (currentPosition >= 81 && currentPosition < 91) {
                            drawTexQuad(LeshenTex, y * 64, x * 64, 64, 64);
                        } else if (currentPosition >= 91 && currentPosition < 101) {
                            drawTexQuad(WywernTex, y * 64, x * 64, 64, 64);
                        }
                        else drawTexQuad(background_2, y * 64, x * 64, 64, 64);

                    }

                }
            }

            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }
}


