import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends RoadObjects
{
    /**
     * Act - do whatever the Pig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(3);
        setLocation(getX() + 1, getY() + levels());
        
        /** Play Pig sound */
        
        if(isTouching(CarMain.class))
         {
            /** Killed pigs counter getter **/
            CarMain car = getWorld().getObjects(CarMain.class).get(0);
            car.killedPigsCounts();
            
            getWorld().removeObject(this);
         }
        else
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
