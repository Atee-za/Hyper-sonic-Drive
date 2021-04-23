import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Buttons
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long startedTime;
    long currentTime;
    boolean play = true;
    boolean kickstart = false;
    GreenfootSound backgroundMusic = new GreenfootSound("StartSound.mp3");
    public Start()
    {
        GreenfootImage start = getImage();
        start.scale(250,250);
        setImage(start);
        
        //backgroundMusic.playLoop();
    }
    
    public void act() 
    {
        // Add your action code here.
        
        if(play)
         {
           backgroundMusic.playLoop();
           play = false;
         }
        
        if(Greenfoot.mouseClicked(this))
           {
             startedTime = System.currentTimeMillis();
             kickstart = true;
           }
           
        if(kickstart)
          {
             starterCount();
             currentTime = System.currentTimeMillis();
          }
        
    }
    
    public void starterCount()
    {
        getWorld().showText("Start in "+(4 - ((currentTime - startedTime)/1000))+" sec", getWorld().getWidth()/2, getWorld().getHeight()/2);
        if(((currentTime - startedTime) / 1000) >= 5)
        {
            backgroundMusic.stop();
            Stage1 s = new Stage1();
            Greenfoot.setWorld(s);
        }
        
    }
}
