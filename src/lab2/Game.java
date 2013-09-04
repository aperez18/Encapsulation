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
    
    
}
