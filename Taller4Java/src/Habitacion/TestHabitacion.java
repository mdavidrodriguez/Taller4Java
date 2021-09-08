package Habitacion;

public class TestHabitacion {
    public static void main(String[] args) {
        
        Habitacion A = new Habitacion();
        imprimirHabitacion(A);
        
        Habitacion B = new Habitacion(4,3,2);
        imprimirHabitacion(B);
    }
    
    public static void  imprimirHabitacion(Habitacion h){
        System.out.println("Largo: " + h.getLargo());
        System.out.println("Ancho: " +h.getAncho());
        System.out.println("Alto: " + h.getAlto());
        System.out.println("Tapizado: " + h.cantidadTapizado());
        System.out.println("Enchape: " + h.cantidadEnchape());
        System.out.println("-----------------------------");
    }
}