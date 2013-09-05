/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Andy
 */
public class GameCharacter {
    private String characterName;
    private final int MAX_HP = 100;
    private final int MAX_LIVES = 3;
    private int characterHp;
    private int characterLives;
    private Weapon weapon;
    private Spec specialty;
    
    public GameCharacter(String characterName){
        this.characterName = characterName;
        characterHp = MAX_HP;
        characterLives = MAX_LIVES;
    }

    public int getMAX_HP() {
        return MAX_HP;
    }

    public int getMAX_LIVES() {
        return MAX_LIVES;
    }
    
    public int getCharacterHp(){
        return characterHp;
    }
    
    public int getCharacterLives(){
        return characterLives;
    }
    
    public String getCharacterName(){
        return characterName;
    }
    
    public void setCharacterHp(int characterHp){
        this.characterHp = characterHp;
    }

    public void setCharacterLives(int characterLives) {
        this.characterLives = characterLives;
    }
    
    public void setLoadout(){
        setWeapon();
        setSpec();
    }
    
    private void setWeapon(){
        //logic to choose weapon
    }
    
    private void setSpec(){
        //logic to choose spec
    }
}
