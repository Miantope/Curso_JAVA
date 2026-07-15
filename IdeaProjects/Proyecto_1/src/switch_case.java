import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){

        int DiaSemana;
        Scanner entrada = new Scanner(System.in);

        //ingresando datos
        System.out.println("Ingrese el día a consultar: ");
        DiaSemana = entrada.nextInt();

        switch(DiaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero incorrecto, saliendo del sistema");
                break;

        }
    }
}
