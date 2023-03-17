// Crea una clase Persona con las siguientes variables:

// La edad

// El nombre

// El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
package ejercicio_4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 23;
        cliente.telefono = 993018610;
        cliente.nombre = "Edgar";
        cliente.credito = 1000.75;
        System.out.println("Cliente " + cliente.nombre + ", tiene una edad de " + cliente.edad + " su número de contacto es:" + cliente.telefono + " posee un credito disponible de $" + cliente.credito);

        trabajador.nombre = "Daniel";
        trabajador.edad = 27;
        trabajador.telefono = 998876453;
        trabajador.salario = 1800.27;
        System.out.println(trabajador.nombre + ", tiene " + trabajador.edad + " años, su número de contacto es: " + trabajador.telefono + " y su salario es de $" + trabajador.salario);
    }
}


class Persona {
    String nombre;
    int edad, telefono;

}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}