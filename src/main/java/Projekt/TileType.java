package Projekt;

/**
 * Klasa typu enumerate, przechowująca najważniejsze dane dotyczące załadowanie tekstury do pamięci operacyjnej
 */
public enum TileType
{

    Witcher("textures/Witcher_Texture_Aure.png", "PNG"),
    Wywern("textures/Wyvern_Texture_Aure.png", "PNG"),
    Ghoul("textures/Ghoul_Texture_Aure.png", "PNG"),
    Drowner("textures/Drowner_Texture.jpg", "JPG"),
    Leshen("textures/Leshen_Texture.jpg", "JPG"),
    Potion("textures/Potion_Texture.png", "PNG"),
    Sword("textures/Sword_Texture_Aure.png", "PNG"),
    Background("textures/Background_4.jpg", "JPG");

    /**
     * Zmienna typu String określająca ścieżkę do tekstury
     */
    String textureName;
    /**
     * Zmienna typu string określająca rozszerzenie pliku tekstury
     */
    String TYPE;

    /**
     * Konstruktor
     * @param textureName nazwa
     * @param TYPE
     */
    TileType( String textureName, String TYPE)
    {
        this.TYPE = TYPE;
        this.textureName = textureName;
    }
}
