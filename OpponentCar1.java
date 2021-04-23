import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpponentCar1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpponentCar1 extends Cars
{
    /**
     * Act - do whatever the OpponentCar1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean playing = true;
    public OpponentCar1()
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
       setLocation(getX(),getY() + (levels() + 2));
       
       if(getOneIntersectingObject(OpponentCar1.class) != null)
        {
          setLocation(randomX(),0 + 3);
        }
        
       if(isAtEdge())
        {
          setLocation(randomX(),0 + 3);  
        } 
    }
    
    public int randomX()
    {
      int rx = 192 + Greenfoot.getRandomNumber(257); 
      return rx;
    }
    
    public int levels()
    {
        int level = 3;
        if(getWorld().getClass().getName() == "Stage2")
        {
            level = 4;
        }
        
        if(getWorld().getClass().getName() == "Stage3")
        {
            level = 7;
        }
        return level;
    }
}
