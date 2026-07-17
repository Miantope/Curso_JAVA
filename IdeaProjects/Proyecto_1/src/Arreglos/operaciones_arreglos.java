package Arreglos;

public class operaciones_arreglos {
    public static void main(String[] args) {

        int ventas1[] = {500, 600, 400, 100, 650};
        int ventas2[] = {600, 800, 500, 350, 900};
        int resultados[] = new int[ventas1.length];
        int i, suma = 0;
        System.out.println("Suma de valores: ");
        for(i = 0; i< ventas1.length;i++){
            resultados[i] = ventas1[i] + ventas2[i];
            suma = suma + resultados[i];
            System.out.println("La suma de los Arreglos.arrays es: " + resultados[i]);
        }
        System.out.println("La suma total es: " + suma);

        System.out.println(" ");

        System.out.println("Resta de valores: ");
        for(i = 0; i< ventas1.length;i++){
            resultados[i] = ventas1[i] - ventas2[i];
            suma = suma + resultados[i];
            System.out.println("La suma de los Arreglos.arrays es: " + resultados[i]);
        }
        System.out.println("La suma total es: " + suma);

        System.out.println(" ");

        System.out.println("Multiplicación de valores: ");
        for(i = 0; i< ventas1.length;i++){
            resultados[i] = ventas1[i] * ventas2[i];
            suma = suma + resultados[i];
            System.out.println("La suma de los Arreglos.arrays es: " + resultados[i]);
        }
        System.out.println("La suma total es: " + suma);
    }
}
