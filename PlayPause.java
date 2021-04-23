import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayPause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayPause extends Buttons
{
   /**
     * Act - do whatever the PlayPause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayPause()
    {
        getImage().scale(40, 40);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Stage1.backgroundMusic.isPlaying() && Greenfoot.mouseClicked(this))
        {
           Stage1.backgroundMusic.pause();
        }
        else
        if(Stage1.backgroundMusic.isPlaying() == false && Greenfoot.mouseClicked(this))
        {
            Stage1.backgroundMusic.play();
        }
   }    
}
