import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Asteroide extends Actor {
    private int velocidad;
    private Nave nave;
    public void act() {
        moverAsteroide();
        World mundo = getWorld();
        int x = getX();
        int y = getY();
        int alto = mundo.getHeight();
        int ancho = mundo.getWidth();
        if (y == alto) {
            mundo.removeObject(this);
        }
        
        if(x == ancho || x == 0) {
            mundo.removeObject(this);
        }
    }    
    
    public Asteroide() {
        velocidad = Greenfoot.getRandomNumber(8 - 3 + 1) + 3;
    }
    
    public void moverAsteroide() {
        move(velocidad);
        
    }
}
