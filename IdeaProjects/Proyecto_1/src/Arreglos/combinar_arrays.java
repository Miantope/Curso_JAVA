package Arreglos;

public class combinar_arrays {
    public static void main(String[] args) {
        String[] producto= {
                "Peras",
                "Manzanas",
                "Uvas",
                "Fresas",
                "Melones"};


        double[] precios = {
                50,
                20.3,
                9.30,
                12.3,
                8.2};

        int i;
        for(i = 0; i < producto.length;i++){
            if(precios[i] < 10.0){
                System.out.println(producto[i] +  ":$ " + precios[i] + " No paga impuestos");
            }else{
                System.out.println(producto[i] +  ":$ " + precios[i] + " Si paga impuestos");
            }

        }



    }
}
