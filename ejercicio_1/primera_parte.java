// Primera parte:
// Crear una función con tres parámetros que sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.

package ejercicio_1;


public class primera_parte {
    public static void main(String[] args) {
        int resultado = suma(7, 6, 7);
        System.out.println(resultado);
        
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

