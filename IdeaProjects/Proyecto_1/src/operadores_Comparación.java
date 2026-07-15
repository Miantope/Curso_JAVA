public class operadores_Comparación {
    public static void main(String[] args){
        int valor1 = 90, valor2 = 50;

        var resultado = valor1 == valor2;
        System.out.println(valor1 + " ¿Es igual a "+ valor2 + "?: " + resultado);
        //igualdad
        System.out.println(valor1 == valor2);

        //diferente a
        System.out.println(valor1 != valor2);

        //mayor que
        System.out.println(valor1 > valor2);

        //menor que
        System.out.println(valor1 < valor2);

        //menor o igual que
        System.out.println(valor1 <= valor2);

        //mayor o igual que
        System.out.println(valor1 >= valor2);
    }
}
