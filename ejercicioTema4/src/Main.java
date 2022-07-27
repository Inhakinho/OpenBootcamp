
public class Main {

    public static void main(String[] args) {
    /*Usando un if, crear una condición que compare si la variable
    numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("El numeroIf es Positivo\n\n");
        } else if (numeroIf == 0) {
            System.out.println("El numeroIf es 0\n\n");
        } else {
            System.out.println("El numeroIf es Negativo\n\n");
        }


    /*Crea un bucle While, este bucle tendrá que tener como condición que la variable
    numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
        System.out.println("\n");//dejar espacios entre ejercicios
    /*Para el bucle Do While, deberás crear la misma estructura que en el While,
    pero solo se debe ejecutar una vez.*/
        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
        while (numeroWhile < 3);
        System.out.println("\n");//dejar espacios entre ejercicios

    /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
    y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1
    su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/

        int numeroFor = 0;

        for (numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }
        System.out.println("\n");//dejar espacios entre ejercicios

    /*Por último, para el Switch, deberás crear la variable estacion, y distintos case
    para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se
    deberá mandar un mensaje por consola informando de la estación en la que está.
    También habrá que poner un default para cuando el valor de la variable no sea una estación.*/

        String estacion = "Verano";

        switch(estacion){

            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No es ninguna estacion");
        }


    }



}