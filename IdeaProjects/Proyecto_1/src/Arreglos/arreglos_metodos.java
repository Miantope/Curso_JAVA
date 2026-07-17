package Arreglos;

import java.util.Arrays;

public class arreglos_metodos {
    public static void main(String[] args) {
        int[] numeros = {10,6,3,4,5,7,4,8};
        String[] letras = {"b", "t", "a", "y","c"};

        //ver valores como texto
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array original: " + Arrays.toString(letras));


        //organizar un array de enteros
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        Arrays.sort(letras);
        System.out.println("Array ordenado: " + Arrays.toString(letras));

        //comparar dos elementos

        int[] numeros1 = {1,0,3};
        int[] numeros2 = {1,2,3};

        boolean iguales = Arrays.equals(numeros1,numeros2);
        System.out.println("Son iguales: " + iguales);

        //llenar un array automaticamente
        int[] llenar = new int[5];
        Arrays.fill(llenar,1);
        System.out.println("Llenado: " + Arrays.toString(llenar));

        //copiar un array

        int[] original = {1,2,3};
        int[] copia = Arrays.copyOf(original, 5);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copia: " + Arrays.toString(copia));






    }
}
