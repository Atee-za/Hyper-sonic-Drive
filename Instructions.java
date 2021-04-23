import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean buttonAdded = false;
    public Instructions()
    {
        getImage().scale(150,80);
    }
    
    public void act() 
    {
        // Add your action code here.
        
       if(Greenfoot.mouseClicked(this))
         {
           //>>>>>>show instructions!!!!!!!!!<<<<<<<<<<
           setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
           setImage(new GreenfootImage("Instructions."+
           "\n\n *Use arrows Left, Right, Up and down to control your car."+
           "\n *Try to avoid bumping into the blue cars coming towards you."+
           "\n *To proceed to next stage reach atleast score 45."+
           "\n *In Stage 2 and 3 you can bump into the ambulance to gain +1 life."+
           "\n *Try not to kill the pedestrains and animals crossing."+
           "\n\n Good Luck!", 34,Color.BLACK, Color.WHITE));
           buttonAdded = true;
         } 
       
       if(buttonAdded)
         {
             /** add backbutton keh**/
             getWorld().addObject(new Back(),920 , 431);
             buttonAdded = false;
         }
    }    
    
    public void resetImage()
    {
        /** code to chage the button back to instructions **/
         setImage("instructions.png");
         getImage().scale(150,80);
         setLocation(79,561);
    }
}
