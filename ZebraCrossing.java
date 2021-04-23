import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZebraCrossing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZebraCrossing extends RoadObjects
{
    /**
     * Act - do whatever the ZebraCrossing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean adder = true;
    
    public void act() 
    {
        // Add your action code here.
        mover();
    } 
    
    public void mover()
    {
        setLocation(getX(),getY() + levels());
        if(adder)
        {
            int r = 1 + Greenfoot.getRandomNumber(3);
            if(r == 1)
            {
                getWorld().addObject(new Man(),192 , getY());
            }
            
            if(r == 2)
            {
                getWorld().addObject(new Girl(),192 , getY());
            }
            
            if(r == 3)
            {
                getWorld().addObject(new Man(),192 , getY());
                getWorld().addObject(new Girl(),190 , getY());
            }
            
            adder = false;
        }
        
        if(isAtEdge())
        {
          removeTouching(Man.class);
          removeTouching(Girl.class);
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
