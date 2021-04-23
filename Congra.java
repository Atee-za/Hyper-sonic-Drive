import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Congra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congra extends Actor
{
    /**
     * Act - do whatever the Congra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Congra() 
    {
        setImage(new GreenfootImage("Congratulations you have completed the game!!"+
        "\n Pussy.", 33,Color.WHITE, Color.BLACK));
        //Greenfoot.stop();
    }    
}
