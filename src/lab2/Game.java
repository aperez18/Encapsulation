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
    private final int ATTACK = 1;
    private final int DEFEND = 2;
    private final int FLEE = 3;
    private final int QUIT = 4;
    private int damage;
    private boolean playerTurn;
    private boolean gameOver;
    private GameCharacter character;
    
    public Game(){
        playerTurn = true;
        //character = new GameCharacter("Player 1");
    }
    
    public boolean isPlayerTurn(){
        return playerTurn;
    }
    
    public boolean isGameOver(){
        return gameOver;
    }
    
    public void executePlayerDecision(int playerDecision){
        if(playerDecision == ATTACK){
            calculateDamage();
            damageCharacter(character, damage);
        }else if(playerDecision == DEFEND){
            damage = 0;
        }else if(playerDecision == FLEE){
            loseLife(character);
        }else if(playerDecision == QUIT){
            destroyCharacter(character);
        }
    }
    
    private void calculateDamage(){
        damage = 25;
    }
    
    private void damageCharacter(GameCharacter character, int damageAmount){
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
    
    private void loseLife(GameCharacter character){
        character.setCharacterLives(character.getCharacterLives()-1);
    }
    
    private void destroyCharacter(GameCharacter character){
        System.out.println(character.getCharacterName() + " has no more lives remaining! GAME OVER.");
    }
}
