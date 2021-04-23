import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pavement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pavement extends RoadObjects
{
    /**
     * Act - do whatever the Pavement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Pavement()
    {
        turn(90);
    }
    boolean rotate = true;
    
    public void act() 
    {
        // Add your action code here.
        mover();
    }    
    
     public void mover()
    {
       setLocation(getX(),getY() + levels());
        
       if(isAtEdge())
        {
          setLocation(getX(),0);  
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
            levelSpeed = 7;
        }
        return levelSpeed;
    }
}
