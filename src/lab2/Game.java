/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Andy
 */
public class Game {
    private String gameTitle;
    private boolean playerTurn;
    private boolean gameOver;
    //private GameCharacter enemy;
    
    public Game(){
        playerTurn = true;
        //enemy = new GameCharacter("Enemy");
    }
    
    public boolean isPlayerTurn(){
        return playerTurn;
    }
    
    public boolean isGameOver(){
        return gameOver;
    }
    
    public void damageCharacter(GameCharacter character, int damageAmount){
        // validate damage amount
        if(character.getCharacterHp() <= damageAmount){
            loseLife(character);
            System.out.println(character.getCharacterLives() + " lives remaining.");
            if(character.getCharacterLives() == 0){
                destroyCharacter(character);
            }
        }else{
            character.setCharacterHp((character.getCharacterHp()-damageAmount));
        }
    }
    
    private void gainLife(GameCharacter character){
        if(character.getCharacterLives() < character.getMAX_LIVES()){
            character.setCharacterLives(character.getCharacterLives()+1);
        }
    }
    
    private void loseLife(GameCharacter character){
        character.setCharacterLives(character.getCharacterLives()-1);
    }
    
    private void destroyCharacter(GameCharacter character){
        System.out.println(character.getCharacterName() + " has no more lives remaining! GAME OVER.");
    }
}
