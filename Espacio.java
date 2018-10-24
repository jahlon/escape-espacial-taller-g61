
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Espacio extends World {
    
    private GreenfootSound sonidoDeFondo;
    private int tiempoJuego;
    private int tiempoGeneracionAsteroides;
    private SimpleTimer timer = new SimpleTimer();
    private Nave nave;
    private Counter contador;
    private Boton botonRetry;
    
    public Espacio() {    
        super(800, 600, 1); 
        
        // Configurar fondo negro
        GreenfootImage fondo = getBackground();
        fondo.setColor(Color.BLACK);
        fondo.fill();
        
        // Asignar el orden en que se pintan los objetos
        setPaintOrder(Boton.class, Counter.class, Nave.class, Asteroide.class, Estrella.class);
    }
    
    public void pasoTiempoGenerarAsteroide() {
        timer.mark();
        if (timer.millisElapsed() > 1000 && Greenfoot.isKeyDown("space")){
            generarAsteroide();
            timer.mark();
        }
    }
    
    public void generarAsteroide() {
        Asteroide asteroide = new Asteroide();
    }
}
