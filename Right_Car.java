import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Right_Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Right_Car extends Actor
{
    /**
     * Act - do whatever the Left_Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static Right_Car instance;  // Singleton instance
    private int speed;

    // Private constructor to prevent direct instantiation
    private Right_Car() {
        speed = 0;
    }

    // Method to access the Singleton instance
    public static Right_Car getInstance() {
        if (instance == null) {
            instance = new Right_Car();
        }
        return instance;
    }
    public void act()
    {
        checkKey();
        collectPizza2();
        hitObstacle();
    }
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>=490){
                setLocation(getX()-9,getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<=560){
                setLocation(getX()+9,getY());
            }
        }
    }
    public void collectPizza2(){
        Actor p = getOneIntersectingObject(pizza2.class);
        if(p!=null){
            Greenfoot.playSound("collect-points-190037.mp3");
            MyWorld myWorld=(MyWorld)getWorld();
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.addScore();
            getWorld().removeObject(p);
        }
        
    }
    public boolean hitObstacle(){
        Actor o = getOneIntersectingObject(obstacle.class);
        if(o!=null){
            Greenfoot.playSound("game-over-arcade-6435.mp3");
            Greenfoot.stop();
            MyWorld myWorld=(MyWorld)getWorld();
            Game_over gameover = new Game_over();
            myWorld.addObject(gameover, myWorld.getWidth()/2,myWorld.getHeight()/2);
            getWorld().removeObject(this);
            
        }
        return true;
    }
}
