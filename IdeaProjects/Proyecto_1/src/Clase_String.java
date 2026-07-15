import java.util.Scanner;

public class Clase_String {
    public static void main(String[] args){
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingresa la palabra 1: ");
        palabra1 = entrada.next();

        System.out.println("Ingresa la palabra 2");
        palabra2 = entrada.next();

        //comparar textos
        if(palabra1.equals(palabra2)){
            System.out.println(palabra1 + " es igual a: " + palabra2);
        }else{
            System.out.println(palabra1 + " no es igual a: " + palabra2);
        }
        //comparar textos sin tomar en cuenta mayusculas
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println(palabra1 + " es igual a: " + palabra2 + " sin tomar en cuenta las mayusculas");
        }else{
            System.out.println(palabra1 + " no es igual a: " + palabra2 + " sin tomar en cuenta las mayusculas");
        }

        //comparar cantidad de caracteres
        if(palabra1.compareTo(palabra2) == 0){
            System.out.println(palabra1 + " tiene las mismas letras que " + palabra2);
        }else{
            if(palabra1.compareTo(palabra2) > 0){
                System.out.println(palabra1 + " tiene más letras que " + palabra2);
            }else{
                System.out.println(palabra1 + " tiene menos letras que " + palabra2);
            }
        }

        //Saber primer caracter de una palabra

        char caracter = palabra1.charAt(0);
        System.out.println("El primer caracter de la palabara " + palabra1 + " es: " + caracter);

        System.out.println(palabra1.charAt(2));

    }
}
