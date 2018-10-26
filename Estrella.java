import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Estrella extends Actor {

    private int velocidad;

    public Estrella() {
        GreenfootImage imagen = new GreenfootImage(6,6);
        imagen.setColor(Color.WHITE);
        imagen.drawLine(0, imagen.getHeight()/2, imagen.getWidth(), imagen.getHeight()/2);
        imagen.drawLine(imagen.getWidth()/2, 0, imagen.getWidth()/2, imagen.getHeight());
        setImage(imagen);
        
        velocidad = Greenfoot.getRandomNumber(8) + 3;
    }
    
    public void mover() {
        setLocation(getX(), getY() + velocidad);
    }

    public void act() {
        mover();
        if( getY() >= getWorld().getHeight() ) {
            getWorld().removeObject(this);
        }
    }    
}
