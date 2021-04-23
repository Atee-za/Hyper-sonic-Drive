import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{

    /**
     * Constructor for objects of class Stage2.
     * 
     */
    
    public Stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(612, 600, 1); 
        setPaintOrder(Congra.class, GameOver.class, CarMain.class, OpponentCar1.class, Score.class, Ambulence.class, Man.class, Girl.class);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WhiteLine2 whiteline2 = new WhiteLine2();
        addObject(whiteline2,263,68);
        WhiteLine2 whiteline22 = new WhiteLine2();
        addObject(whiteline22,271,140);
        WhiteLine2 whiteline23 = new WhiteLine2();
        addObject(whiteline23,281,214);
        WhiteLine2 whiteline24 = new WhiteLine2();
        addObject(whiteline24,275,297);
        WhiteLine2 whiteline25 = new WhiteLine2();
        addObject(whiteline25,283,400);
        WhiteLine2 whiteline26 = new WhiteLine2();
        addObject(whiteline26,276,478);
        WhiteLine2 whiteline27 = new WhiteLine2();
        addObject(whiteline27,286,567);
        WhiteLine2 whiteline28 = new WhiteLine2();
        addObject(whiteline28,381,80);
        WhiteLine2 whiteline29 = new WhiteLine2();
        addObject(whiteline29,390,165);
        WhiteLine2 whiteline210 = new WhiteLine2();
        addObject(whiteline210,384,254);
        WhiteLine2 whiteline211 = new WhiteLine2();
        addObject(whiteline211,395,368);
        WhiteLine2 whiteline212 = new WhiteLine2();
        addObject(whiteline212,379,482);
        WhiteLine2 whiteline213 = new WhiteLine2();
        addObject(whiteline213,388,576);
        WhiteLine2 whiteline214 = new WhiteLine2();
        addObject(whiteline214,384,577);
        whiteline213.setLocation(284,564);
        whiteline26.setLocation(284,484);
        whiteline25.setLocation(284,394);
        whiteline24.setLocation(285,307);
        whiteline23.setLocation(285,219);
        whiteline22.setLocation(283,128);
        whiteline2.setLocation(283,45);
        whiteline212.setLocation(380,395);
        whiteline27.setLocation(380,483);
        whiteline214.setLocation(381,565);
        whiteline28.setLocation(378,42);
        whiteline29.setLocation(379,129);
        whiteline210.setLocation(380,219);
        whiteline211.setLocation(380,307);
        CarMain carmain2 = new CarMain();
        addObject(carmain2,350,551);
        carmain2.setLocation(337,550);

        Pavement pavement = new Pavement();
        addObject(pavement,505,568);
        Pavement pavement2 = new Pavement();
        addObject(pavement2,499,537);
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
        Pavement pavement24 = new Pavement();
        addObject(pavement24,174,75);
        Pavement pavement25 = new Pavement();
        addObject(pavement25,175,38);
        pavement2.setLocation(171,571);
        pavement10.setLocation(171,530);
        pavement15.setLocation(171,485);
        pavement16.setLocation(171,441);
        pavement17.setLocation(172,392);
        pavement18.setLocation(172,341);
        pavement19.setLocation(172,292);
        pavement20.setLocation(172,237);
        pavement21.setLocation(171,182);
        pavement22.setLocation(171,123);
        pavement23.setLocation(172,63);
        pavement25.setLocation(172,22);

        ScorePic scorepic = new ScorePic();
        addObject(scorepic,61,115);
        Life life = new Life();
        addObject(life,115,238);
        life.setLocation(21,10);
        scorepic.setLocation(23,47);
        OpponentCar1 opponentcar1 = new OpponentCar1();
        addObject(opponentcar1,341,70);
        OpponentCar1 opponentcar12 = new OpponentCar1();
        addObject(opponentcar12,233,364);
        OpponentCar1 opponentcar13 = new OpponentCar1();
        addObject(opponentcar13,456,580);
        OpponentCar1 opponentcar14 = new OpponentCar1();
        addObject(opponentcar14,450,262);
        PlayPause playpause = new PlayPause();
        addObject(playpause,579,580);
    }
}
