import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cracker extends Actor
{
    GifImage myGif = new GifImage("CongraCracker.gif");
    /**
     * Act - do whatever the Cracker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
