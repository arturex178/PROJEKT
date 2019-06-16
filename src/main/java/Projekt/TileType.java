package Projekt;

public enum TileType
{

    Witcher("textures/Witcher_Texture_Aure.png", "PNG", true),
    Wywern("textures/Wyvern_Texture_Aure.png", "PNG", true),
    Ghoul("textures/Ghoul_Texture_Aure.png", "PNG", true),
    Drowner("textures/Drowner_Texture.jpg", "JPG", true),
    Leshen("textures/Leshen_Texture.jpg", "JPG", true),
    Potion("textures/Potion_Texture.png", "PNG", true),
    Sword("textures/Sword_Texture_Aure.png", "PNG", true),
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
