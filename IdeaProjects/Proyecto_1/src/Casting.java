public class Casting {
    public static void main(String[] args){
        //De texto a entero
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Numero entero: " + numeroEntero);

        //Entero a texto
        int numeroEn = 456;
        String enteroTexto = String.valueOf(numeroEn);
        System.out.println("Texto es: " + enteroTexto);

        //doble a entero
        double numeroDoble = 45.50;
        int entero = (int)numeroDoble;
        System.out.println("Numero entero: " + entero);

        //entero a double

        int entero2 = 789;
        double enteroDoble = (double) entero2;
        System.out.println("El double es: " + enteroDoble);
    }
}
