import java.util.Scanner;

public class Operadores_Aritmeticos {
    public static void main(String[] args){
        int valor1, valor2, resultado;

        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese valor 1: ");
        valor1 = entrada.nextInt();

        System.out.println("Ingrese valor 2: ");
        valor2 = entrada.nextInt();

        //Operador suma
        resultado = valor1 + valor2;
        System.out.println("Suma: " + resultado);
        System.out.println(valor1 + valor2);

        //Operador resta
        resultado = valor1 - valor2;
        System.out.println("Resta: " + resultado);

        //Operador resta
        resultado = valor1 * valor2;
        System.out.println("Multilicación: " + resultado);

        //Operador division
        resultado = valor1 / valor2;
        System.out.println("División: " + resultado);

        //Operador division
        resultado = valor1 % valor2;
        System.out.println("Residuo: " + resultado);
    }
}
