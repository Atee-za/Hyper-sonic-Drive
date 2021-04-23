import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (Athenkosi Zono) 
 * @version (1 November 2018)
 */
public class Explosion extends Actor
{
    GifImage myGif = new GifImage("explosion-animation-1.gif");
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long startedTime;
    long currentTime;
    public Explosion()
    {
      startedTime = System.currentTimeMillis();  
    }
    
    public void act() 
    {
        myGif.getCurrentImage().scale(40, 40);
        setImage(myGif.getCurrentImage());
        currentTime = System.currentTimeMillis();
        if(((currentTime - startedTime) / 1000) >= 1)
        {
             getWorld().removeObject(this);
        }
    }    
}
