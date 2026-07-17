package Arreglos;

import java.util.Scanner;

public class ejercicio_arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros=new int[5];
        //llenado de array
        int i;
        int mayor = 0;
        for(i = 0; i < 5;i++){
            System.out.println("Ingrese valor " + i + " : ");
            numeros[i] = entrada.nextInt();
            if(numeros[i] > mayor){
                mayor = numeros[i];

            }
        }
        System.out.println("El valor mayor ingresado fue: " + mayor);




    }
}
