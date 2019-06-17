package Projekt;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;
import java.io.IOException;
import java.io.InputStream;
import static org.lwjgl.opengl.GL11.*;

/**
 * Obiekt <code>Construct</code> zawiera motodę torzącą okno na mapę, ładowania tekstur oraz drukowania graficznych reprezentacji obiektów na mapie
 *
 */
public class Construct{

    /**
     * Metoda tworząca okno o nazwie "Simulation" o odpowiednich rozmiarach
     * @param size opisuje długość i szerokość okna mapy
     */
    public static void beginSession(int size)
    {
        Display.setTitle("Simulation");
        try {
            Display.setDisplayMode(new DisplayMode( size*64, size*64));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, size*64, size*64, 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
        glEnable(GL_TEXTURE_2D);
    }

    /**
     * Funkcja pozwalająca drukowanie graficznej reprezentacji obiektów na mapie
     * @param tex obiekt typu Texture, który przechowuje konkretną tksturę
     * @param x położenie bloczka na maoie na osi X
     * @param y położenie bloczka na mapie na osi Y
     * @param width szerokość bloczka w pikselach
     * @param height wysokość bloczka w pikselach
     */
    public static void drawTransparentQuad(Texture tex, float x , float y, int width, int height)
    {
        tex.bind();
        glTranslatef( x, y, 0);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        glBegin(GL_QUADS);
        glTexCoord2f(0, 0);
        glVertex2f(0,0);
        glTexCoord2f(1, 0);
        glVertex2f(width,0);
        glTexCoord2f(1, 1);
        glVertex2f(width,height);
        glTexCoord2f(0, 1);
        glVertex2f(0,height);
        glEnd();
        glLoadIdentity();

    }

    /**
     * Metoda pobierająca tekstury do programu z pamięci dysku twardego
     * @param path ścieżka oisująca lokalne położenie tekstury
     * @param fileType rozszerzenie pliku tekstury
     * @return zwraca oiekt typu Texture
     */
    public static Texture LoadTexture(String path, String fileType)
    {
        Texture tex = null;

        InputStream in = ResourceLoader.getResourceAsStream(path);
        try {
            tex = TextureLoader.getTexture(fileType, in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tex;
    }
}
