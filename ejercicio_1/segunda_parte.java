// Segunda parte:
// Crear una clase coche.
// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// Una función que incremente el número de puertas que tiene el coche.
// Crear un objeto miCoche en el main y añadirle una puerta.
// Mostrar el número de puertas que tiene el objeto.
package ejercicio_1;

public class segunda_parte {

}

class Coche {
    
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void agregarPuerta() {
        numPuertas++;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.agregarPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas");
    }
}
