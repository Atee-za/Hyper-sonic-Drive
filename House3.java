import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class House3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House3 extends Houses
{
    /**
     * Act - do whatever the House3 wants to do. This method is called whenever
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
         //x = Greenfoot.getRandomNumber(30) + 20;
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
