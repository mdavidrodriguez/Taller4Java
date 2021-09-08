package Habitacion;

public class Habitacion {
    
    private double largo, ancho, alto;
    
    public Habitacion(){
    }
    
    public Habitacion(double largo, double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

 
    public void setLargo(double largo) {
        this.largo = largo;
    }


    public double getAncho() {
        return ancho;
    }

 
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

 
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double cantidadEnchape(){
        return this.ancho*this.largo;
    }
    
    public double cantidadTapizado(){
        
        return 2*(this.alto*this.ancho) + 2 * (this.alto*this.largo);
    }
    
}