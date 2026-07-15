import java.util.Scanner;

public class clase_math {
    static void main(String[] args) {
        int valor;
        var base = 2;
        var potencia = 3;
        Scanner entrada = new Scanner(System.in);

        //raiz cuadrada
        System.out.println("Ingresa el numero a calcular: ");
        valor = entrada.nextInt();
        System.out.println("Raiz de " + valor + " = " + Math.sqrt(valor));

        //Potencia
        System.out.println("Potencia de " + base + " elevado a " + potencia + " es: " + Math.pow(base,potencia));

        //valor absoluto
        var absoluto = -2.5;
        System.out.println("El valor absoluto de " + absoluto + " es: " + Math.abs(absoluto));

        //identificar mayor valor
        var numero1 = 50.2;
        var numero2 = 3;
        System.out.println("El mayor valor es: " + Math.max(numero1,numero2));
        System.out.println("El menor valor es: " + Math.min(numero1,numero2));

        //redondear un valor
        var total = 5.5678;
        System.out.println("El valor " + total + " redondeado es igual a: " + Math.round(total));

        //redondear hacia abajo más cercano
        System.out.println("El valor " + total + " redondeado hacía abajo es igual a: " + "\n"
                                                    + Math.floor(total));

        //redondear hacia arriba más cercano
        System.out.println("El valor " + total + " redondeado hacía abajo es igual a: " + "\n"
                + Math.ceil(total));

        //número pseudoaleatorio
        var aleatorio = Math.random();
        System.out.println("El valor aleatorio es: " + aleatorio);

        //número pseudoaleatorio en un rango
        var aleatorio2 = Math.random() * 10;
        System.out.println("El valor aleatorio es: " + aleatorio2);

        //número pseudoaleatorio en un rango solo entero
        var aleatorio3 = Math.round(Math.random() * 10);
        System.out.println("El valor aleatorio es: " + aleatorio3);

        //funcion PI
        System.out.println("El valor de PI es: " + Math.PI);

        //seno de un angulo
        System.out.println("El seno de un angulo de 90 grados es: " + Math.sin(90));

        //coseno de un angulo
        System.out.println("El coseno de un angulo de 180 grados es: " + Math.cos(180));

        //tangente de un angulo
        System.out.println("La tangente de un angulo de 90 grados es: " + Math.tan(90));

        //logaritmo natural
        var loga = 100;
        System.out.println("El logaritmo del numero " + loga + " es: " + Math.log(loga));
    }
}
