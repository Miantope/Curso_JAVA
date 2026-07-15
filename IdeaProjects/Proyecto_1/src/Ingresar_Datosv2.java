import javax.swing.*;

public class Ingresar_Datosv2 {
    public static void main(String[] args) {
        String nombre;
        int edad;

        //Ingreso de datos
        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad: ");
        edad = Integer.parseInt(edad2);

        //Mostrar datos

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + "Edad: " + edad);


    }
}
