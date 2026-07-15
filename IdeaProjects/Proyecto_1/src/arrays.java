import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int i;
        //creación de un array
         int [] numeros = new int[5];

         //inicializar un array
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 6;
        numeros[4] = 5;

        for(i = 0;i<5;i++){
            System.out.println("Los valores del array son: " + numeros[i]);
        }

        //otra forma
        int[] valores = {234, 345, 123};
        for(i=0;i<3;i++){
            System.out.println("Los valores del array son: " + valores[i]);
        }

        //Array String
        String[] producto= new String[5];
        producto[0] = "Peras";
        producto[1] = "Manzanas";
        producto[2] = "Uvas";
        producto[3] = "Fresas";
        producto[4] = "Melones";

        //ordena alfabeticamente
        Arrays.sort(producto);

        for(i = 0; i < 5; i++){
            System.out.println("Producto " + (i + 1) + " es: " + producto[i]);
        }


    }
}
