package Projekt;

import static Projekt.Construct.drawTransparentQuad;

public class TileGrid
{
    public Tile[][] map;

    public TileGrid()
    {
        map = new Tile[20][20];
    }


    public void Draw()
    {
        Tile t;
        for(int i=0; i<map.length; i++)
        {
            for(int j=0; j<map.length; j++)
            {
                t = map[i][j];
                if(t instanceof Tile)
                drawTransparentQuad(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
            }
        }
    }

    public void putTiles(int[][] map)
    {

        for(int i=0; i<map.length; i++)
        {
            for(int j=0; j<map.length; j++)
            {
                if (map.length >= 1) {
                    int t = map[i][j];

                    if (t >= 50 && t < 66) {
                        this.map[i][j] = new Tile(j*64, i*64, 64,64, TileType.Drowner);
                    } else if (t >= 66 && t < 81) {
                        this.map[i][j] = new Tile(j*64, i*64, 64,64, TileType.Witcher);
                    } else if (t >= 81 && t < 91) {
                        this.map[i][j] = new Tile(j*64, i*64, 64,64, TileType.Wywern);
                    } else if (t >= 91 && t < 101) {
                        this.map[i][j] = new Tile(j*64, i*64, 64,64, TileType.Leshen);
                    }

                }
            }
        }
    }
}
