import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends RoadObjects
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(levels() - 3);
        int zebY = ((ZebraCrossing) getWorld().getObjects(ZebraCrossing.class).get(0)).getY();
        setLocation(getX(),zebY);
        
        if(isTouching(CarMain.class))
        {
            /** Killed girls counter getter **/
            CarMain car = getWorld().getObjects(CarMain.class).get(0);
            car.killedPedestrainCounts();
            
            
            Greenfoot.playSound("manScreem.wav");
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
            levelSpeed = 6; //Keep it 6 to avoid error
        }
        return levelSpeed;
    }
}
