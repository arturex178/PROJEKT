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

public class Construct{

    final static int size = 20;


    public static void beginSession()
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


    public static void drawBackgroundQuad(Texture tex, int x , int y, int width, int height)
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

    public static void drawTexQuad(Texture tex, int x , int y, int width, int height)
    {
        tex.bind();
        glTranslatef( x, y, 0);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        glBegin(GL_QUADS);
        glTexCoord2f(0, 0);
        glVertex2i( 0, 0);
        glTexCoord2f(1, 0);
        glVertex2i( width, 0);
        glTexCoord2f(1, 1);
        glVertex2i( width, height);
        glTexCoord2f(0, 1);
        glVertex2i( 0, height);
        glEnd();
        glLoadIdentity();
    }

    public static Texture LoadTexture(String path, String fileType, boolean buildable)
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
