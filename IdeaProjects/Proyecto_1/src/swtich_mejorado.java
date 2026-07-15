import java.util.Scanner;
public class swtich_mejorado{
    public static void main(String[] args){
        int DiaSemana;
        Scanner entrada = new Scanner(System.in);

        //ingresando datos
        System.out.println("Ingrese el día a consultar: ");
        DiaSemana = entrada.nextInt();

        switch(DiaSemana){
            case 1 -> System.out.println("Domingo");

            case 2 -> System.out.println("Lunes");

            case 3 -> System.out.println("Martes");

            case 4 -> System.out.println("Miercoles");

            case 5 -> System.out.println("Jueves");

            case 6 -> System.out.println("Viernes");

            case 7 -> System.out.println("Sabado");

            default -> System.out.println("Numero incorrecto, saliendo del sistema");


        }
    }
}
