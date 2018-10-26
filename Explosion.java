import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Explosion extends Actor {
    public static final int TOTAL_IMAGENES = 25;
    public static final int ITERACIONES_ANIMACION = 10;
    private GreenfootSound sonido;
    private GreenfootImage[] imagenes;
    private int indiceImagenes;
    private int contadorIteraciones;

    public Explosion(){
        imagenes = new GreenfootImage[TOTAL_IMAGENES];

        for(int i = 0; i < TOTAL_IMAGENES; i++){
            imagenes[i] = new GreenfootImage("explosion/explosion" + i + ".png");

        }
        setImage(imagenes[0]);
    }

    public void animar(){
        if(contadorIteraciones >= ITERACIONES_ANIMACION){

            if (indiceImagenes < TOTAL_IMAGENES - 1){           
                indiceImagenes++;
            } else{
                indiceImagenes = 0;            
            }
            setImage(imagenes[indiceImagenes]);
            contadorIteraciones = 0;
        }else {
            contadorIteraciones++;
        }
    }

    public void act() {
        animar();
    }    
}
