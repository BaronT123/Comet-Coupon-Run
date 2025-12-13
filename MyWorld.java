import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
       
        super(700, 700, 1); 
        
  
        prepare();
    }
    
    private void prepare(){
        Counter counter = new Counter();
        
        addObject(Left_Car.getInstance(),135,550);
        addObject(Right_Car.getInstance(),481,550);
        
        addObject(counter,344,56);
        settings_button sb = new settings_button("settings_button_re.jpeg.jpg",new SettingsWorld());
        addObject(sb, 600,150);
    }
    public void addPizza(){
        addObject(new pizza2(), randomNumber(125,125),0);
    }
    public void addPizza2(){
        addObject(new pizza2(), randomNumber(210,210),0);
    }
    public void addPizza3(){
        addObject(new pizza2(), randomNumber(490,490),0);
    }
    public void addPizza4(){
        addObject(new pizza2(), randomNumber(560,560),0);
    }
public void addObstacle(){
        addObject(new obstacle(), randomNumber(125,125),0);
    }
    public void addObstacle2(){
        addObject(new obstacle(), randomNumber(210,210),0);
    }
    public void addObstacle3(){
        addObject(new obstacle(), randomNumber(490,490),0);
    }
    public void addObstacle4(){
        addObject(new obstacle(), randomNumber(560,560),0);
    }
    public void act(){
        if((Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
            addPizza();
            if(Greenfoot.getRandomNumber(250)<249 && !(Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
                addObstacle();
            }
        }
        if((Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
            addPizza2();
            if(Greenfoot.getRandomNumber(250)<249 && !(Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
                addObstacle2();
            }
        }
        if((Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
            addPizza3();
            if(Greenfoot.getRandomNumber(250)<249 && !(Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
                addObstacle3();
            }
        }
        if((Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
            addPizza4();
            if(Greenfoot.getRandomNumber(250)<249 && !(Greenfoot.getRandomNumber(275)<5)&&(Greenfoot.getRandomNumber(275)>220)){
                addObstacle4();
            }
        }

    }
    public int randomNumber(int start, int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal + start;
    }
}
