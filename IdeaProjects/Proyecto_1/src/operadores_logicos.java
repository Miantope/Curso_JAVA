public class operadores_logicos {
    public static void main(String[] args){
        boolean a = true, b = false;

        //Operador AND (Y) verdadero si ambas son verdaderas
        System.out.println(a && b);

        //Operador OR (o) verdadero si alguna es verdadera
        System.out.println(a || b);

        //Operador NOT (no)
        System.out.println(!a);

        //Operador XOR lógico solo alguna debe ser verdadera pero no ambas
        System.out.println(a ^ b);
    }
}
