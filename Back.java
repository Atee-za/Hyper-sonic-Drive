import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Buttons
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Back()
    {
        getImage().scale(50, 50);
         // setLocation(920,431);
    }
    
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
           {
              Instructions instr = getWorld().getObjects(Instructions.class).get(0);
              instr.resetImage();
           }
    }    
}
