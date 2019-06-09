package Projekt;

public class Main
{
    final static int MAINSIZE= 20;
    static public Map mainMap;

    public static void main( String[] args )
    {
        mainMap = new Map();
        mainMap.randomizeMap();
        new Boot();

    }

}
