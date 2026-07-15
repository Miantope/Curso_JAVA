import javax.swing.*;

public class for_ejercicios {
    static void main(String[] args) {

        boolean validar = false;
        for(int i = 0; !validar ;i++){
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email: ");
            if(email.contains("@") && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null,"Email ingresado correctamente");
                validar = true;
                break;
            }else if(!email.contains("@")){
                JOptionPane.showMessageDialog(null,"Intenta con un correo valido que contenga @");
            }else{
                JOptionPane.showMessageDialog(null, "email no valido, debe tener la terminación .com");
            }
        }
    }
}
