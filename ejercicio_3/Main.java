// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.


package ejercicio_3;


public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Edgar");
        System.out.println("Mi nombre es "+ persona.getNombre());
        
        persona.setEdad(23);
        System.out.println("Actualmente tengo "+ persona.getEdad()+" años");

        persona.setTelefono(993018610);
        System.out.println("Mi teléfono es "+ persona.getTelefono());
    }

}

class Persona {
    private String nombre;
    private int edad, telefono; 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}