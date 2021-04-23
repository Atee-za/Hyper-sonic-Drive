import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (Athenkosi Zono) 
 * @version (1 November 2018)
 */
public class Stage1 extends World
{
    public static final GreenfootSound backgroundMusic = new GreenfootSound("backGround.mp3");
    //GreenfootSound backgroundMusic = new GreenfootSound("backGround.mp3");
    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
       
       backgroundMusic.playLoop();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WhiteLine whiteline = new WhiteLine();
        addObject(whiteline,340,76);
        WhiteLine whiteline2 = new WhiteLine();
        addObject(whiteline2,343,198);
        WhiteLine whiteline3 = new WhiteLine();
        addObject(whiteline3,342,340);
        WhiteLine whiteline4 = new WhiteLine();
        addObject(whiteline4,347,489);
        WhiteLine whiteline5 = new WhiteLine();
        addObject(whiteline5,346,74);
        whiteline3.setLocation(341,427);
        whiteline2.setLocation(341,310);
        whiteline.setLocation(341,190);
        whiteline5.setLocation(340,75);
        whiteline4.setLocation(340,545);
        CarMain carmain = new CarMain();
        addObject(carmain,416,559);
        OpponentCar1 opponentcar1 = new OpponentCar1();
        addObject(opponentcar1,417,50);
        OpponentCar1 opponentcar12 = new OpponentCar1();
        addObject(opponentcar12,228,296);
        OpponentCar1 opponentcar13 = new OpponentCar1();
        addObject(opponentcar13,304,513);
        OpponentCar1 opponentcar14 = new OpponentCar1();
        addObject(opponentcar14,462,230);
        opponentcar1.setLocation(387,50);
        opponentcar12.setLocation(235,338);
        Pavement pavement = new Pavement();
        addObject(pavement,505,568);
        Pavement pavement2 = new Pavement();
        addObject(pavement2,499,537);
        pavement.setLocation(497,568);
        pavement2.setLocation(497,537);
        Pavement pavement3 = new Pavement();
        addObject(pavement3,501,514);
        Pavement pavement4 = new Pavement();
        addObject(pavement4,499,476);
        Pavement pavement5 = new Pavement();
        addObject(pavement5,502,441);
        Pavement pavement6 = new Pavement();
        addObject(pavement6,502,406);
        Pavement pavement7 = new Pavement();
        addObject(pavement7,503,369);
        Pavement pavement8 = new Pavement();
        addObject(pavement8,506,319);
        Pavement pavement9 = new Pavement();
        addObject(pavement9,506,268);
        Pavement pavement10 = new Pavement();
        addObject(pavement10,501,223);
        Pavement pavement11 = new Pavement();
        addObject(pavement11,500,174);
        Pavement pavement12 = new Pavement();
        addObject(pavement12,506,141);
        Pavement pavement13 = new Pavement();
        addObject(pavement13,502,101);
        Pavement pavement14 = new Pavement();
        addObject(pavement14,502,58);
        pavement14.setLocation(497,45);
        pavement.setLocation(499,565);
        pavement13.setLocation(497,101);
        pavement12.setLocation(497,154);
        pavement11.setLocation(497,201);
        pavement9.setLocation(497,247);
        pavement8.setLocation(498,296);
        pavement7.setLocation(498,351);
        pavement6.setLocation(499,407);
        pavement4.setLocation(498,461);
        pavement3.setLocation(497,512);
        pavement.setLocation(498,565);
        pavement5.setLocation(496,1);
        pavement10.setLocation(171,522);
        Pavement pavement15 = new Pavement();
        addObject(pavement15,177,486);
        Pavement pavement16 = new Pavement();
        addObject(pavement16,178,440);
        Pavement pavement17 = new Pavement();
        addObject(pavement17,178,395);
        Pavement pavement18 = new Pavement();
        addObject(pavement18,176,352);
        Pavement pavement19 = new Pavement();
        addObject(pavement19,180,307);
        Pavement pavement20 = new Pavement();
        addObject(pavement20,176,263);
        Pavement pavement21 = new Pavement();
        addObject(pavement21,177,218);
        Pavement pavement22 = new Pavement();
        addObject(pavement22,175,165);
        Pavement pavement23 = new Pavement();
        addObject(pavement23,176,121);
        Pavement pavement25 = new Pavement();
        addObject(pavement25,175,38);
        pavement25.setLocation(172,3);
        pavement25.setLocation(172,2);
        pavement23.setLocation(172,95);
        pavement22.setLocation(172,149);
        pavement21.setLocation(172,197);
        pavement20.setLocation(172,253);
        pavement19.setLocation(171,307);
        pavement19.setLocation(172,308);
        pavement18.setLocation(172,353);
        pavement17.setLocation(172,399);
        pavement16.setLocation(171,447);
        pavement15.setLocation(171,489);
        pavement10.setLocation(171,530);
        pavement23.setLocation(172,63);
        pavement22.setLocation(171,123);
        pavement21.setLocation(171,182);
        pavement15.setLocation(171,485);
        pavement16.setLocation(171,441);
        pavement17.setLocation(172,392);
        pavement18.setLocation(172,341);
        pavement19.setLocation(172,292);
        pavement20.setLocation(172,237);
        pavement2.setLocation(171,571);
        Life life = new Life();
        addObject(life,20,22);
        life.setLocation(16,12);
        ScorePic scorepic = new ScorePic();
        addObject(scorepic,24,60);
        scorepic.setLocation(18,48);
        pavement25.setLocation(171,14);
        PlayPause playpause = new PlayPause();
        addObject(playpause,579,580);
    }
}
