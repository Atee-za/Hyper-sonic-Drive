import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulence extends Cars
{
    /**
     * Act - do whatever the Ambulence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ambulence()
    {
        turn(180);
    }
    
    public void act() 
    {
        // Add your action code here.
         mover();
    }   
    
     public void mover()
    {
       setLocation(getX(),getY() + levels() + 1);
        
       if(isAtEdge())
        {
          getWorld().removeObject(this);  
        } 
    }
    
    public int levels()
    {
        int levelSpeed = 3;
        if(getWorld().getClass().getName() == "Stage2")
        {
            levelSpeed = 5;
        }
        
        if(getWorld().getClass().getName() == "Stage3")
        {
            levelSpeed = 6;
        }
        return levelSpeed;
    }
    
}
