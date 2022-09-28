import java.util.Scanner;

public class intento2 {
    public static void main(String[] args) {

        Scanner precio = new Scanner(System.in);
        System.out.println("Ingresa el precio del produto: ");
        float precio1 = precio.nextFloat();

        float resultado = precioIva(precio1);
        System.out.println("El precio del producto es: " + resultado);

    }
    static float precioIva (float precio){
        return precio *1.19f;
    }
}
