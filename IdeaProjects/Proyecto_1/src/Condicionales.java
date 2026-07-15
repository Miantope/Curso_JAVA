import javax.swing.*;

public class Condicionales {
    public static void main(String[] args){
        //Condicional IF
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
        String edad2 = JOptionPane.showInputDialog(null, "Ingresa tu edad: ");
        edad = Integer.parseInt(edad2);

        //analizando datos
        if(edad < 12){
            JOptionPane.showMessageDialog(null,"Eres un niño(a)");
        }else if(edad > 12 && edad < 17){
            JOptionPane.showMessageDialog(null, "Eres un adolecente");
        }else{
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        }

    }
}
