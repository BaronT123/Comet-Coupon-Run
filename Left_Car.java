import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Left_Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Left_Car extends Actor
{
    /**
     * Act - do whatever the Left_Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private static Left_Car instance;  // Singleton instance
    private int speed;

   
    private Left_Car() {
        speed = 0;
    }

    
    public static Left_Car getInstance() {
        if (instance == null) {
            instance = new Left_Car();
        }
        return instance;
    }
    public void act()
    {
        checkKey();
        collectPizza();
        hitObstacle();
        
    }
    public void checkKey(){
        if (Greenfoot.isKeyDown("A")){
            if(getX()>=130){
                setLocation(getX()-9,getY());
            }
        }
        if (Greenfoot.isKeyDown("D")){
            if(getX()<=220){
                setLocation(getX()+9,getY());
            }
        }
    }
    public void collectPizza(){
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
            MyWorld myWorld=(MyWorld)getWorld();
            Game_over gameover = new Game_over();
            myWorld.addObject(gameover, myWorld.getWidth()/2,myWorld.getHeight()/2);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
        return true;
    }
}
