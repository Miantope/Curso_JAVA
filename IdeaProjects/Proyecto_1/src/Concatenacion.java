public class Concatenacion {
    public static void main(String[] args){
        String nombre = "Homero";
        String apellido = "Simpson";
        int valor = 100;
        String palabra1 = "Aprendiendo", palabra2 = "JAVA";
        String saludo = palabra1 + " " + palabra2;
        System.out.println(nombre);
        System.out.println(apellido);

        System.out.println(nombre + " " + apellido);

        System.out.println("Nombre: " + nombre);

        System.out.println(nombre.concat("" + apellido));

        System.out.println(saludo);

        System.out.println(palabra1.concat(" " + palabra2));

    }
}
