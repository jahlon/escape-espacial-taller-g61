import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nave extends Actor {

    public static final int VELOCIDAD = 5;

    private Explosion explosion;

    public void explotarNave() {
        if (isTouching(Asteroide.class)) {
            int Y = getY();
            int X = getX();

            getImage().clear();

            explosion = new Explosion();
            explosion.setLocation(X,Y);
            explosion.animar();

            getWorld().removeObject(this);
        }
    }

    public void act() {
        explotarNave();
    }    
}
