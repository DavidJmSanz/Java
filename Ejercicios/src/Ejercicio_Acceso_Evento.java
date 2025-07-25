public class Ejercicio_Acceso_Evento {
    public static void main(String[] args) {
        int edad =10;
        boolean tieneInvitacion= false;
        boolean vestimentaFormal= false;

        if (tieneInvitacion == true){
            if (edad >= 18){
                if (vestimentaFormal == true){
                    System.out.println("Bienvenido al Evento!");
                }else {
                    System.out.println("no trae vestimenta formal");
                }
            }else {
                System.out.println("no es mayor de edad");
            }
        }else {
            System.out.println("no tiene invitacion");
        }
    }
}
