import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteLine extends RoadObjects
{
    /**
     * Act - do whatever the WhiteLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover();
    }    
    
    public void mover()
    {
        int speed = 3;
        setLocation(getX(),getY() + speed);
        
        if(isAtEdge())
        {
          setLocation(getX(), 10);  
        }
    }
    
}
