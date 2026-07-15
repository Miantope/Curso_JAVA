public class oper_Incremento {
    public static void main(String[] args) {

        int valor1 = 5;
        System.out.println("Valor original: " + valor1);
        //Incrementando valor1 postfijo
        valor1++;
        System.out.println("valor incrementado: " + valor1);
        //Incrementando valor1 pretfijo
        ++valor1;
        System.out.println("Valor incrementado: " + valor1);

        valor1+=2;
        System.out.println("Valor incrementado en 2: " + valor1);




        int valor2 = 10;
        System.out.println("Valor original: " + valor2);
        //Decremento valor1 postfijo
        valor2--;
        System.out.println("Valor decremento: " + valor2);
        //Decremento valor1 prefijo
        --valor2;
        System.out.println("Valor decremento: " + valor2);
        valor2-=3;
        System.out.println("Valor decremento: " + valor2);


        int valor3 = 20;
        System.out.println("Valor original: " + valor3);
        //operador incremento fijo (multiplicación)
        valor3 *= 9;
        System.out.println("Valor original: " + valor3);
        //operador incremento fijo (división)
        valor3 /= 2;
        System.out.println("Valor original: " + valor3);

    }
}
