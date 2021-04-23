import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarMain here.
 * 
 * @author (Athenkosi Zono) 
 * @version (1 November 2018)
 */
public class CarMain extends Cars
{
    /**
     * Act - do whatever the CarMain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int life = 4;
    int score;
    int stageNum;
    int killedPigsCount;
    int killedElephantCount;
    int killedPedestrainCount;
    boolean isOn = false;
    public void act() 
    {
        // Add your action code here.
        mover();
        adder();
        roadRules();
        scores();
        stages();
    }    
    
    public void mover()
    {
        if(Greenfoot.isKeyDown("Up"))
        {
          setLocation(getX(), getY() - 3);  
        }
        
        if(Greenfoot.isKeyDown("Down"))
        {
          setLocation(getX(), getY() + 4);  
        }
        
        if(Greenfoot.isKeyDown("Left"))
        {
          move(-3);  
        }
        
        if(Greenfoot.isKeyDown("Right"))
        {
          move(3);  
        }
        
        cheatCode();
    }
    
    public void adder()
    {
        //Code for house 1
        int randomHouse1 = Greenfoot.getRandomNumber(1900);
        if(randomHouse1 <= 7 ) // && isOn)
          {
            //House1 w = new House1();
            getWorld().addObject(new House1(),45 , 10);
            //isOn = false;
          }
          
        //Code for house 2  
        int randomHouse2 = Greenfoot.getRandomNumber(1900);
         if(randomHouse2 <= 7 ) // && isOn)
          {
            //House1 w = new House1();
            getWorld().addObject(new House2(),580 , 10);
            //isOn = false;
          }
          
        //Code for house 3
        int randomHouse3 = Greenfoot.getRandomNumber(1900);
         if(randomHouse3 <= 7 ) // && isOn)
          {
            //House1 w = new House1();
            getWorld().addObject(new House3(),525 , 10);
            //isOn = false;
          }
        
         //Code for score
         int randomScore = Greenfoot.getRandomNumber(4000);
         if(randomScore < 25)
          {
            //House1 w = new House1();
            int rx = 192 + Greenfoot.getRandomNumber(257);
            getWorld().addObject(new Score(),rx , 0);
            //isOn = false;
          }
    }
    
    public void roadRules()
    {
        
        if(isTouching(OpponentCar1.class))
          {
            //explosion here
            getWorld().addObject(new Explosion(),getX() , getY());
            //play Sound bang >>>>>>>><<<<<<<<<
            Greenfoot.playSound("bang.wav");
            removeTouching(OpponentCar1.class); 
            life --;
            Greenfoot.delay(7);
            setLocation(400, 550);
            
            int rx = 192 + Greenfoot.getRandomNumber(257);
            getWorld().addObject(new OpponentCar1(),rx , 0);
          }
        
        if(isTouching(Pavement.class))
          {
            /**Play Sound bang */
            Greenfoot.playSound("bang.wav");
            life --;
            Greenfoot.delay(10);
            setLocation(400, 550); 
          }
        
        if(isTouching(Score.class))
          {
            /**Play soung coin eaten  */
            Greenfoot.playSound("coin.wav");
            removeTouching(Score.class);
            score += 3;
            
          }
          
        if(isTouching(Ambulence.class))
        {
            removeTouching(Ambulence.class);
            life ++;
        }
    }
    
    public void scores()
    {
        getWorld().showText(" = "+life,50,10);
        getWorld().showText(" = "+score,50, 47);
        
        if(score >= 15 && !isOn)
        {
           getWorld().addObject(new FinishLine(),335 , 0);
           isOn = true;
        }
        
        if(life <= 0 )
         {
           /**Pass Score and StageNum to gameOver Actor  **/
           getWorld().addObject(new GameOver(score, stageNum),getWorld().getWidth()/2,getWorld().getHeight()/2);
           //Pass Record details when game is over
           getWorld().addObject(new Record(score,killedElephantCount, killedPigsCount , killedPedestrainCount),75,515);
           /**Greenfoot.playSound("GameOvaaaa.whatwhat"); **/
           Stage1.backgroundMusic.stop();
           Greenfoot.delay(5);
           Greenfoot.playSound("gameOver.mp3");
           Greenfoot.delay(550);
           
           
           
           
           MyWorld m = new MyWorld();  
           Greenfoot.setWorld(m);
           Greenfoot.stop();
         }
        
        if(isTouching(FinishLine.class))
         {
           Greenfoot.playSound("nextStage.wav");
           stageOrder();
         }
    }
    
    public void higherLevels()
    {
        //Code for zebra crossing
        int randomZebraCrossing = Greenfoot.getRandomNumber(19000);
        if(randomZebraCrossing <= 20 ) // && isOn)
          {
            getWorld().addObject(new ZebraCrossing(),332 , 10);
          }
        
        //Code to add Tree
        int randomTree = Greenfoot.getRandomNumber(1900);
        if(randomTree <= 15 ) // && isOn)
          {
            getWorld().addObject(new Tree(),145 , 10);
          }
          
        // Code to add Ambulance
        int randomAmbu = Greenfoot.getRandomNumber(19000);
        if(randomAmbu <= 9 ) // && isOn)
          {
            int rx = 192 + Greenfoot.getRandomNumber(257); 
            getWorld().addObject(new Ambulence(),rx , 0);
          }
        
        // Code to add Pig
        int randomPig = Greenfoot.getRandomNumber(10000);
        if(randomPig <= 9 ) // && isOn)
          { 
             int ry = 50 + Greenfoot.getRandomNumber(257); 
             getWorld().addObject(new Pig(),140, ry);
          }
        
        // Code to add Elephant
        int randomElephant = Greenfoot.getRandomNumber(10000);
        if(randomElephant <= 9 ) // && isOn)
          { 
             int ry = 50 + Greenfoot.getRandomNumber(257); 
             getWorld().addObject(new Elephant(),500, ry);
          }
       
    }
    
    private void stages()
    {
        if(getWorld().getClass().getName() == "Stage2" || getWorld().getClass().getName() == "Stage3")
        {
            higherLevels();
        }
        
        if(getWorld().getClass().getName() == "Stage1")
             { 
               stageNum = 1;
             }
             else
             if(getWorld().getClass().getName() == "Stage2")
             { 
               stageNum = 2;
             }
             else
             if(getWorld().getClass().getName() == "Stage3")
             {
               stageNum = 3;
             }
    }
    
    public String stageOrder()
    {
        String thisStage = "";
         if(getWorld().getClass().getName() == "Stage1")
             { 
               getWorld().showText("Congratulations, Get ready for next stage",306,40);  
               Greenfoot.delay(100);  
               Stage2 s = new Stage2();  
               Greenfoot.setWorld(s);
             }
             else
             if(getWorld().getClass().getName() == "Stage2")
             { 
               getWorld().showText("Congratulations, Get ready for next stage",306,40);  
               Greenfoot.delay(100);  
               Stage3 s = new Stage3();  
               Greenfoot.setWorld(s);
             }
             else
             if(getWorld().getClass().getName() == "Stage3")
             {
               //>>>>>>><<<<<<<<<Congratulations<<<<<<>>>>>>> Show only text
               getWorld().addObject(new Congra(),getWorld().getWidth()/2, getWorld().getHeight()/2);
               setLocation(576,300);
               
               getWorld().addObject(new Record(score,killedElephantCount, killedPigsCount , killedPedestrainCount),75,515);
               
               /**Show animation cracker>><<<<<<<<<<<<<<*/
               getWorld().addObject(new Cracker(),Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
               getWorld().addObject(new Cracker(),Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
               
             }
         return thisStage;
    }
    
    public void killedElephantCounts()
    {
        killedElephantCount ++;
    }
    
    public void killedPigsCounts()
    {
        killedPigsCount ++;
    }
    
    public void killedPedestrainCounts()
    {
        killedPedestrainCount ++;
    }
    
    private void cheatCode()
    {
        if(Greenfoot.isKeyDown("Shift") && Greenfoot.isKeyDown("Z"))
        {
            score = 36;
        }
    }
    
}
