import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends RoadObjects
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      // Add your action code here.
      int speed = 2;
      setLocation(getX(), getY() + speed); 
      
        if(isAtEdge())
       {
         getWorld().removeObject(this);
       }
      
    }  
    
}
