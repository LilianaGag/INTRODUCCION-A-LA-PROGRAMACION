//Llamar a la función en el main y darle valores. Función suma

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        var resultado = suma(a = 56, b = 32, c = 3);
        System.out.println(resultado);

        /*Crear el objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto. */

        coche micoche = new coche();
        micoche.añadirpuertas();
        System.out.println(micoche.puertas);
    }
    //Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
/*Crear una clase llamada coche, con una variable numérica que almacene el número de puertas que tiene.
y una función que incremente el número de puertas que tiene el coche. */
            class coche {
                public int puertas = 3;

                public void añadirpuertas(){
                    this.puertas++;
                }
        }