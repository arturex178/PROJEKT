package Projekt;

import org.newdawn.slick.opengl.Texture;

import static Projekt.Construct.LoadTexture;
import static Projekt.Construct.drawTransparentQuad;

public class Tile
{
    private int x, y, width, height;
    private Texture texture;
    private TileType type;

    public Tile(int x, int y, int width, int height, TileType type)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.texture = LoadTexture(type.textureName, type.TYPE, type.buildable);
    }

    public void Draw(int x, int y)
    {
        drawTransparentQuad(texture, x, y, width, height);
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Texture getTexture() {
        return texture;
    }

}
