package Projekt;

import org.newdawn.slick.opengl.Texture;

import static Projekt.Construct.LoadTexture;
import static Projekt.Construct.drawTransparentQuad;

/**
 * Klasa, której obiekty przechowują tekstury i paramety opisujące położenie i wymiary bloczka
 */
public class Tile
{
    private int x, y, width, height;
    private Texture texture;

    /**
     * Konstruktor
     * @param x -pierwszy parametr określający rozmieszczenie tekstury w bloczku
     * @param y -drugi parametr określający rozmieszczenie tekstury w bloczku
     * @param width opisuje szerokość bloczka
     * @param height opisuje wysokość bloczka
     * @param type określa typ
     */
    public Tile(int x, int y, int width, int height, TileType type)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.texture = LoadTexture(type.textureName, type.TYPE);
    }

    /**
     * Motoda rozszerzająca ogólną statyczną metode <code>drawTransparentQuad</code>, zyskując możliwość ładwego jej wykorzystania
     * obiektom typu <code>Tile</code> zadając parametry położenia
     * @param x pierwszy parametr określający rozmieszczenie tekstury w bloczku
     * @param y drugi parametr określający rozmieszczenie tekstury w bloczku
     */
    public void Draw(int x, int y)
    {
        drawTransparentQuad(texture, x, y, width, height);
    }

    /**
     * Metoda pozwalająca dostnie obiekt typu Texture
     * @return
     */
    public Texture getTexture() {
        return texture;
    }

}
