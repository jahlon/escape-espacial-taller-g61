import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nave extends Actor {

    public static final int VELOCIDAD = 5;
    private Explosion explosion;
    public void mover(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-VELOCIDAD,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+VELOCIDAD,getY());
        } if(Greenfoot.isKeyDown("up") && getY()>=0 ){
            setLocation(getX(),getY()-VELOCIDAD);
        } 
        if( Greenfoot.isKeyDown("down") && 
        getY()< getWorld().getHeight() ) {
            setLocation(getX(),getY()+VELOCIDAD);
        }
    }

    public void trasladar(){  
        int x = getX();
        int y = getY();
        if(getX()>=getWorld().getWidth() -2){
            setLocation(1,y);
        }
        if(getX()<=0){
            setLocation(getWorld().getWidth(),y);
        }      
    }

    public void act() {
        mover();
        trasladar();
    }    
}
