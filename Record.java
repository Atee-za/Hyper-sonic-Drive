import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record extends Actor
{
    /**
     * Act - do whatever the Record wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long startedTime;
    long currentTime;
    public Record(int score, int elephants, int pigs, int pedestrains) 
    {
      // String level = getWorld().getClass().getName(); 
       setImage(new GreenfootImage("Game Record."+
       "\n Score = "+score+
       "\n \n You have killed"+
        "\n Pigs = "+pigs+
        "\n Elephants = "+elephants+
        "\n Pedestrains = "+pedestrains, 24,Color.YELLOW, Color.BLACK));
        
      startedTime = System.currentTimeMillis();
    } 
    
    public void act()
    {
        currentTime = System.currentTimeMillis();
        if(((currentTime - startedTime) / 1000) >= 10)
        {
           MyWorld m = new MyWorld();  
           Greenfoot.setWorld(m);
           Greenfoot.stop();
        }
    }
    
}
