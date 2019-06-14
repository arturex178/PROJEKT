package Projekt;

public enum TileType
{

    Witcher("textures/Witcher_Texture.png", "PNG", true),
    Wywern("textures/Wywern_Texture.jpg", "JPG", true),
    Ghoul("textures/Ghoul_Texture.jpg", "JPG", true),
    Drowner("textures/Drowner_Texture.jpg", "JPG", true),
    Leshen("textures/Leshen_Texture.jpg", "JPG", true),
    Potion("textures/Potion.jpg", "JPG", true),
    Sword("textures/Sword_Texture.png", "PNG", true),
    Background("textures/Background_4.jpg", "JPG", true);

    String textureName;
    boolean buildable;
    String TYPE;

    TileType( String textureName, String TYPE, boolean buildable)
    {
        this.TYPE = TYPE;
        this.textureName = textureName;
        this.buildable = buildable;
    }
}
