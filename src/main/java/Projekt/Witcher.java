package Projekt;

import org.newdawn.slick.opengl.Texture;
import java.util.Random;
import static Projekt.Construct.drawTransparentQuad;
import static Projekt.Main.mainMap;

/** Obiekt <code>Witcher</code> reprezentuje witchera, jest to podklasa klasy <code>AUnit</code>. Obiekt klasy <code> Witcher </code> jest głównym obiektem symulacji, od jego zachowania zależy jej przebieg
 */
public class Witcher extends AUnit{
    /**
     * Odpowiada za przechowanie liczby mikstur leczniczych, których obiekt klasy <code>Witcher</code> używa aby zwiększyć ilość <code>HP</code>
     */
    private int numberOfPotions = 0;
    /**
     * Odpowiada za rozmiary grafiki reprezentującej obiekt klasy <code>Witcher</code>
     */
    private int width, height;
    private Texture texture;
    /**
     * Zlicza ilość pokonanych potworów
     */
    private int howManyKilled = 0;

    Potion potion = new Potion();

    /**
     * @param texture przechowuje teksturę Witcher

     * @param startPositionX
     * Odpowiada za pozycje startową witchera na mapie(oś X)
     * @param startPositionY
     * Odpowiada za pozycje startową witchera na mapie(oś Y)
     * @param width
     * Rozmiar grafiki reprezentującej witchera(szerokość)
     * @param height
     * Rozmiar grafiki reprezentującej witchera(wysokość)
     */
    public Witcher(Texture texture, int startPositionX, int startPositionY, int width, int height)
    {
        this.setHP(1000);
        this.setDmgDown(9);
        this.setDmgUp(12);
        this.setPositionX(startPositionX);
        this.setPositionY(startPositionY);
        this.texture = texture;
        this.width = width;
        this.height = height;
    }

    /**
     * Zwraca ilość pokonanych potworów
     * @return ilość pokonanych potworów
     */
    public int getHowManyKilled() {
        return howManyKilled;
    }

    /**
     * Ustawia ilość pokonanych potworów
     * @param howManyKilled ilość pokonanych potworów
     */
    public void setHowManyKilled(int howManyKilled) {
        this.howManyKilled = howManyKilled;
    }
    private Random rnd = new Random();

    /**
     * Zwraca ilość posiadanych mikstur
     * @return ilość posiadanych mikstur
     */
    public int getNumberOfPotions(){
        return this.numberOfPotions;
    }

    /**
     * Ustawia ilość posiadanych mikstur
     * @param numberOfPotions ilość posiadanych mikstur
     */
    public void setNumberOfPotions(int numberOfPotions){
        this.numberOfPotions = numberOfPotions;
    }

    /**
     * Funkcja walki pomiędzy witcherem i potworem, kończy się w przypadku gdy <code>HP</code> któregoś z dwóch obiektów spadnie do zera.
     * @param enemy wprowadzenie przeciwnika, który wywodzi się z klasy <code>AUnit</code> do walki
     * @return sprawdzenie czy Witcher żyje(ma dodatnie HP)
     */
    public boolean fight(AUnit enemy){

        while(this.getHP() > 0 && enemy.ifAlive()) {
            this.special();
            enemy.special();
            enemy.setHP(enemy.getHP() - this.decideDmg());
            this.setHP(this.getHP() - enemy.decideDmg());
        }
        return this.ifAlive();
    }

    /**
     * Determinuje specjalną umiejętność witchera(używanie mikstur w trakcie walki aby zwiększyć <code>HP</code>)
     */
    @Override
    public void special()
    {
        if( numberOfPotions > 0)
        {
            this.setHP(this.getHP() + potion.getHP());
            numberOfPotions--;
            System.out.println("potion");
        }
    }

    /**
     * Funkcja odpowiada za ruch obiektu klasy <code>Witcher</code> po mapie poprzez losowanie jednego z 8 możliwych kierunków. Gdy obiekt będzie chciał wyjść poza tablice, zostanie przeniesiony na jej drugą stronę
     */
    public void move()
    {
        switch (rnd.nextInt(8)){

            case 0:
                if(getPositionY() != 19){
                    setPositionY(getPositionY() + 1);
                }
                else setPositionY(0);
                break;

            case 1:
                if(getPositionX() != 19){
                    setPositionX(getPositionX() + 1);
                }
                else setPositionX(0);
                break;

            case 2:
                if(getPositionY() != 0){
                    setPositionY(getPositionY() - 1);
                }
                else setPositionY(19);
                break;
            case 3:
                if(getPositionX() != 0){
                    setPositionX(getPositionX() - 1);
                }
                else setPositionX(19);
                break;
            case 4:
                if(getPositionX() != 19 && getPositionY() != 0){
                setPositionX(getPositionX() + 1);
                setPositionY(getPositionY() + 1);
            }
                else if(getPositionX() == 19 && getPositionY() != 0){
                setPositionX(0);
                setPositionY(getPositionY() + 1);
            }
            else if(getPositionX() != 19 && getPositionY() == 0){
                setPositionX(getPositionX() + 1);
                setPositionY(19);
            }
            else if(getPositionX() == 19 && getPositionY() == 0){
                setPositionX(0);
                setPositionY(19);
            }
            break;
            case 5:
                if(getPositionX() != 19 && getPositionY() != 19){
                setPositionX(getPositionX() + 1);
                setPositionY(getPositionY() - 1);
            }
                else if(getPositionX() == 19 && getPositionY() != 19){
                setPositionX(0);
                setPositionY(getPositionY() - 1);
            }
            else if(getPositionX() != 19 && getPositionY() == 19){
                setPositionX(getPositionX() + 1);
                setPositionY(0);
            }
            else if(getPositionX() == 19 && getPositionY() == 19){
                setPositionX(0);
                setPositionY(0);
            }
            break;
            case 6:
                if(getPositionX() != 0 && getPositionY() != 19){
                setPositionX(getPositionX() - 1);
                setPositionY(getPositionY() + 1);
            }
                else if(getPositionX() == 0 && getPositionY() != 19){
                setPositionX(19);
                setPositionY(getPositionY() + 1);
            }
            else if(getPositionX() != 0 && getPositionY() == 19){
                setPositionX(getPositionX() - 1);
                setPositionY(0);
            }
            else if(getPositionX() == 0 && getPositionY() == 19){
                setPositionX(19);
                setPositionY(0);
            }
            break;
            case 7:
                if(getPositionX() != 0 && getPositionY() != 0){
                setPositionX(getPositionX() - 1);
                setPositionY(getPositionY() - 1);
            }
                else if(getPositionX() == 0 && getPositionY() != 0){
                setPositionX(19);
                setPositionY(getPositionY() - 1);
            }
            else if(getPositionX() != 0 && getPositionY() == 0){
                setPositionX(getPositionX() - 1);
                setPositionY(19);
            }
            else if(getPositionX() == 0 && getPositionY() == 0){
                setPositionX(19);
                setPositionY(19);
            }
            break;
        }

    }
    /**
    Uogólnina metoda <code>drawTransparentQuad</code> dla klasy Witcher
     */
    public void Draw()
    {
        drawTransparentQuad(texture, getPositionX()*64, getPositionY()*64, width, height);
    }

    /**
     * Funkcja odpowiada za dobranie odpowiedniej interakcji obiektu klasy <code>Witcher</code> z zawartością pola na którym stanie w zależności od typu
     * @return zwraca true jeśli <code>Witcher</code> żyje(dodatnie <code>HP</code>)
     */
    public boolean interact(){

        boolean result;
            for(int i = 0; i < 400; i++)
            {
                if(mainMap.field[i] != null && mainMap.field[i].getPositionX() == this.getPositionX() &&
                        mainMap.field[i].getPositionY() == this.getPositionY())
                {
                    if(mainMap.field[i] instanceof AUnit && mainMap.field[i] != null){
                        result = fight((AUnit)mainMap.field[i]);
                        if(result){
                            mainMap.field[i] = null;
                            setHowManyKilled(getHowManyKilled() + 1);
                        }
                        mainMap.MAP[getPositionX()][getPositionY()]=0;
                        return result;
                    }
                    if(mainMap.field[i] instanceof Potion) {
                    this.setNumberOfPotions(getNumberOfPotions() + 1);
                        mainMap.MAP[getPositionX()][getPositionY()]=0;
                    return true;
                    }
                    if(mainMap.field[i] instanceof Sword) {
                        if((mainMap.field[i].getDmgUp() + mainMap.field[i].getDmgDown()) /2 >
                                (this.getDmgUp() + this.getDmgDown()) /2){
                            this.setDmgUp(mainMap.field[i].getDmgUp());
                            this.setDmgDown(mainMap.field[i].getDmgDown());
                        }
                        mainMap.MAP[getPositionX()][getPositionY()]=0;

                    }
                    }
                }

            return true;
        }


}