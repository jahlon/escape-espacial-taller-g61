
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Espacio extends World {
    
    private GreenfootSound sonidoDeFondo;
    private int tiempo;
    private int tiempoGeneracionAsteroides;
    private SimpleTimer timerAsteroide;
    private Asteroide asteroide;
    private Nave nave;
    private Counter contador;
    private Boton botonRetry;
    
    public Espacio() {    
        super(800, 600, 1, false); 
        
        // Configurar fondo negro
        GreenfootImage fondo = getBackground();
        fondo.setColor(Color.BLACK);
        fondo.fill();
        
        // Asignar el orden en que se pintan los objetos
        setPaintOrder(Boton.class, Counter.class, Nave.class, Asteroide.class, Estrella.class);
        timerAsteroide = new SimpleTimer();
        tiempoGeneracionAsteroides = 1000;
        
    }
    
    public void generarAsteroide() {
        if (timerAsteroide.millisElapsed() > tiempoGeneracionAsteroides) {
            timerAsteroide.mark();
            int y = -5;
            int x = Greenfoot.getRandomNumber(getWidth());
            asteroide = new Asteroide();
            asteroide.turnTowards(nave.getX(), nave.getY());
            addObject (asteroide, x, y);
        }
    }
    
    public void act() {
        generarAsteroide();
    }
}
