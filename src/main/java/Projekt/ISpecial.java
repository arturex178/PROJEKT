package Projekt;

    /**
    * interfejs zawierający deklaracje metod specjalnych dal każdej klasy implementującej
     * i metody towarzyszące interakcji
    */
    public interface ISpecial {
    /**
     *Implementacja funkcji special, która określa specialne umiejętności obiektów.
     */
    public void special();
    /**
     *Implementacja funkcji ifAlive, która zwraca wartości boolean określajace, czy <code>HP</code> obiiektu jest dodatnie.
     * @return zwraca czy obiekt żyje, czy nie
     */
    public boolean ifAlive();
    /**
     *Implementacja funkcji decideDmg, która losuje obrażenia obiektu.
     * @return zwraca wylosowane obrażenia
     */
    public int decideDmg();

}
