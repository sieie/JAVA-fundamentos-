// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

// Incrementar el valor de la variable en uno cada vez que se ejecute.

// Mostrarlo por pantalla cada vez que se ejecute.

// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

// Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

package ejercicio_2;

public class Main {

    public static void main(String[] args) {
        //if, else if, else
        int numeroIf = 5;

        if(numeroIf > 0){
            System.out.println("El número es positivo.");
        }
        
        else if(numeroIf < 0){
            System.out.println("El número es negativo.");
        }
        
        else{
            System.out.println("El número es cero.");
        }

        //while
        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        //do while
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);

        //for
        for(int numeroFor =0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //switch
        String estacion = "otoño";
        switch(estacion){
            case "invierno":
                System.out.println("Actualmente estamos en invierno.");
                break;
            case "primavera":
                System.out.println("Actualmente estamos en primavera.");
                break;
            case "verano":
                System.out.println("Actualmente estamos en verano.");
                break;
            case "otoño":
                System.out.println("Actualmente estamos en otoño.");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}
