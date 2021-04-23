import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends RoadObjects
{
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
            levelSpeed = 7;
        }
        return levelSpeed;
    }
}
