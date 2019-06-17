package Projekt;
/**
 *klasa Main
 */
public class Main
{
    static public Map mainMap;

    /**
     * Metoda wykonawcza programu zapoczątkowująca proces symulacji
     */
    public static void main( String[] args )
    {
        mainMap = new Map();
        mainMap.randomizeMap();
        mainMap.Print();
        new Boot();

    }

}
