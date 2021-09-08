package Triangulo;
public class TestTriangulo {
    
    public static void main(String[] args) {
        
        Triangulo T = new Triangulo();
        T.setBase(40);
        T.setAltura(20);
        T.setladoA(18);
        T.setladoB(18);
        T.setladoC(9);
        T.setanguloA(20);
        T.setanguloB(30);
        
        imprimirInfoTriangulo(T); 
    }
    
   public static void imprimirInfoTriangulo(Triangulo r){
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Longitud lados iguales: "+ r.calcularlongitud());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("El angulo vertice es de: " + r.calcularAngulovertice());
        System.out.println("-----------------------------------");
    }
}