package Producto;


public class TestProducto {
    public static void main(String[] args) {
        
        Producto miProducto=new Producto();
        miProducto.setCodigo(5978);
        miProducto.setPCompra(50.00);
        miProducto.setPUtilidad(0.5);
        imprimirInfoProducto(miProducto);
    }
    
    
        public static void imprimirInfoProducto(Producto r){
        System.out.println("Codigo de producto: "+ r.getCodigo());
        System.out.println("Precio de compra: "+ r.getPCompra());
        System.out.println("Precio de utilidad: "+ r.getPUtilidad());
        System.out.println("Precio de venta: "+ r.calcularPVenta());
        System.out.println("-----------------------------------");
    }
    
}