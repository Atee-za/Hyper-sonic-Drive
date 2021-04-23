import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver(int score, int stage) 
    {
      // String level = getWorld().getClass().getName(); 
       setImage(new GreenfootImage("...Game Over..."+
        "\n Score = "+score+
        "\n Stage = "+stage, 54,Color.RED, Color.BLACK));
    }  
    
}
