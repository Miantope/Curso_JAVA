package Arreglos;

public class matrices {
    public static void main() {
        int[][] numeros = new int[3][3];

        //Llenar fila 1 de la matriz

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;

        //Llenar fila 2 de la matriz

        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;

        //Llenar fila 3 de la matriz

        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

        //ver elementos con for
        int i,j;
        for(i = 0; i < 3;i++){
            for(j = 0; j < 3;j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(" ");
        }





    }
}
