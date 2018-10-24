import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Espacio extends World {

    private GreenfootSound sonidoDeFondo;
    private int tiempoJuego;
    private int tiempoGeneracionAsteroides;

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
    }

    private void generarEstrella() {
        Estrella estrella = new Estrella();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = -5;
        addObject(estrella, x, y);
    }
    
    public void act() {
        generarEstrella();
    }
}
