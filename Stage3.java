import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage3 extends World
{
    
    /**
     * Constructor for objects of class Stage3.
     * 
     */
    public Stage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        setPaintOrder(Congra.class, GameOver.class, CarMain.class, OpponentCar1.class, Score.class, Ambulence.class, Man.class, Girl.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

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

        WhiteLine2 whiteline2 = new WhiteLine2();
        addObject(whiteline2,274,40);
        WhiteLine2 whiteline22 = new WhiteLine2();
        addObject(whiteline22,348,53);
        WhiteLine2 whiteline23 = new WhiteLine2();
        addObject(whiteline23,408,60);
        whiteline2.setLocation(268,40);
        whiteline22.setLocation(340,42);
        whiteline23.setLocation(414,43);
        WhiteLine2 whiteline24 = new WhiteLine2();
        addObject(whiteline24,275,145);
        WhiteLine2 whiteline25 = new WhiteLine2();
        addObject(whiteline25,353,153);
        WhiteLine2 whiteline26 = new WhiteLine2();
        addObject(whiteline26,433,158);
        WhiteLine2 whiteline27 = new WhiteLine2();
        addObject(whiteline27,277,254);
        WhiteLine2 whiteline28 = new WhiteLine2();
        addObject(whiteline28,363,261);
        WhiteLine2 whiteline29 = new WhiteLine2();
        addObject(whiteline29,428,265);
        WhiteLine2 whiteline210 = new WhiteLine2();
        addObject(whiteline210,278,360);
        WhiteLine2 whiteline211 = new WhiteLine2();
        addObject(whiteline211,363,369);
        WhiteLine2 whiteline212 = new WhiteLine2();
        addObject(whiteline212,431,375);
        WhiteLine2 whiteline213 = new WhiteLine2();
        addObject(whiteline213,282,472);
        WhiteLine2 whiteline214 = new WhiteLine2();
        addObject(whiteline214,375,481);
        WhiteLine2 whiteline215 = new WhiteLine2();
        addObject(whiteline215,436,484);
        whiteline2.setLocation(268,46);
        whiteline24.setLocation(267,137);
        whiteline27.setLocation(271,238);
        whiteline27.setLocation(267,235);
        whiteline210.setLocation(266,335);
        whiteline213.setLocation(266,433);
        whiteline22.setLocation(340,46);
        whiteline25.setLocation(341,138);
        whiteline28.setLocation(342,236);
        whiteline211.setLocation(343,337);
        whiteline214.setLocation(344,433);
        whiteline23.setLocation(414,47);
        whiteline26.setLocation(414,140);
        whiteline29.setLocation(413,241);
        whiteline212.setLocation(413,339);
        whiteline215.setLocation(413,437);
        whiteline214.setLocation(344,435);
        WhiteLine2 whiteline216 = new WhiteLine2();
        addObject(whiteline216,270,533);
        WhiteLine2 whiteline217 = new WhiteLine2();
        addObject(whiteline217,341,535);
        WhiteLine2 whiteline218 = new WhiteLine2();
        addObject(whiteline218,410,536);
        whiteline217.setLocation(343,535);
        whiteline218.setLocation(412,537);
        whiteline216.setLocation(266,534);
        CarMain carmain = new CarMain();
        addObject(carmain,452,530);

        ScorePic scorepic = new ScorePic();
        addObject(scorepic,61,115);
        Life life = new Life();
        addObject(life,115,238);
        life.setLocation(21,10);
        scorepic.setLocation(23,47);
        OpponentCar1 opponentcar1 = new OpponentCar1();
        addObject(opponentcar1,386,63);
        OpponentCar1 opponentcar12 = new OpponentCar1();
        addObject(opponentcar12,247,238);
        OpponentCar1 opponentcar13 = new OpponentCar1();
        addObject(opponentcar13,247,238);
        OpponentCar1 opponentcar14 = new OpponentCar1();
        addObject(opponentcar14,315,434);
        opponentcar13.setLocation(457,298);
        opponentcar12.setLocation(231,238);
        opponentcar1.setLocation(379,57);
        opponentcar14.setLocation(307,447);
        opponentcar13.setLocation(381,337);
        
        PlayPause playpause = new PlayPause();
        addObject(playpause,579,580);
    }
}
