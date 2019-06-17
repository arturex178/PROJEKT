package Projekt;

public class Main
{
    static public Map mainMap;

    public static void main( String[] args )
    {
        mainMap = new Map();
        mainMap.randomizeMap();
        mainMap.Print();
        new Boot();

    }

}
