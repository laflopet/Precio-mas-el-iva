public class EjercicioPrecioIva {

    public static void main(String[] args) {
        // IVA del 19%
        float precio = 3232.54f;
        float resultado = productoIva(precio);
        System.out.println("el valor del producto es de: " + precio + "\nel valor del producto + el iva es de: " + resultado);

    }
    static float productoIva(float precio){
        return precio * 1.19f;
    }
}
