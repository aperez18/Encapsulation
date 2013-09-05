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
    
    /*public void takeDamage(int damageAmount){
        // validate damage amount
        if(getCharacterHp() <= damageAmount){
            loseLife();
            System.out.println(getCharacterLives() + " lives remaining.");
            if(getCharacterLives() == 0){
                destroyCharacter();
            }
        }else{
            characterHp-= damageAmount;
        }
    }
    
    public void gainLife(){
        if(characterLives < MAX_LIVES){
            characterLives++;
        }
    }
    
    public void loseLife(){
        characterLives--;
    }
    
    private void destroyCharacter(){
        System.out.println(getCharacterName() + " has no more lives remaining! GAME OVER.");
    }*/
}
