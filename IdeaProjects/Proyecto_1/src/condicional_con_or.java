public class condicional_con_or {
    public static void main(String[] args){
        boolean Domingo = true;
        boolean Vacaciones = false;
        boolean Licencia = true;

        //Ingresando datos

        if(Domingo == true || Vacaciones == true || Licencia == true){
            System.out.println("Acceso denegado a la empresa");
        }else{
            System.out.println("Bienvenido");
        }
    }
}
