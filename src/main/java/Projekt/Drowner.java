package Projekt;

import org.newdawn.slick.opengl.Texture;

import static Projekt.Clock.Delta;
import static Projekt.Construct.drawTransparentQuad;

public class Drowner extends AUnit implements ISpecial{

    private int width, height;
    private float x, y, speed;
    private Texture texture;
    private boolean first = true;


    public Drowner(Texture texture, float startPositionX, float startPositionY, int width, int height, float speed)
    {
        this.setHP(40);
        this.setDmgUp(13);
        this.setDmgDown(8);
        this.x = startPositionX;
        this.y = startPositionY;
        this.texture = texture;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void Update()
    {
        if(first)
            first = false;
        else
            x += Delta() * speed;
    }


    public void special() {
        if(this.getHP()<20) {
            setDmgUp(15);
            setDmgDown(10);
        }
    }

    public void Draw()
    {
        drawTransparentQuad(texture, x, y, width, height);
    }

}



