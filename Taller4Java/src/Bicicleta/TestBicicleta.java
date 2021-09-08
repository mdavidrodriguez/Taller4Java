package Bicicleta;

import java.util.Scanner;

public class TestBicicleta {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        Bicicleta b = new Bicicleta();
        b.setVelocidad(12);
        b.setPlato(4);
        b.setPiñon(2);
        imprimirInfoBicicleta(b);
        System.out.print("Velocidad: ");
        int x = entrada.nextInt();
        System.out.print("Plato: ");
        int z = entrada.nextInt();
        System.out.print("Piñon: ");
        int s = entrada.nextInt();

        Bicicleta a = new Bicicleta();
        a.setVelocidad(12);
        a.setPlato(4);
        a.setPiñon(2);
        a.setVelocidad2(x);
        a.setPlato2(z);
        a.setPiñon2(s);
        imprimirInfoBicicleta2(a);
             
    }
    
        public static void imprimirInfoBicicleta(Bicicleta r){
        System.out.println("Velocidad: "+ r.getVelocidad());
        System.out.println("Plato: "+ r.getPlato());
        System.out.println("Piñon: "+ r.getPiñon());
        System.out.println("Aceleracion: "+ r.calculaAceleracion());
        System.out.println("Frenado: "+ r.calculoFreno());
        System.out.println("-----------------------------------");
    
        }
        
        public static void imprimirInfoBicicleta2(Bicicleta u){
        System.out.println("-----------------------------------");
        System.out.println("Nueva Velocidad: "+ u.getVelocidad2());
        System.out.println("Nuevo Plato: "+ u.getPlato2());
        System.out.println("Nuevo Piñon: "+ u.getPiñon2());
        System.out.println("Nueva Aceleracion: "+ u.calculaAceleracion2());
        System.out.println("Nuevo Frenado: "+ u.calculoFreno2());
        System.out.println("-----------------------------------");
    
        }
}