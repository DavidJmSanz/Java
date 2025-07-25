public class Ejercicio_Calificacion_Letra {
    public static void main(String[] args) {
        char calificacion = 'F';

        switch (calificacion){
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bueno");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Deficiente");
                break;
            case 'F':
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificacion Invalida");
        }
    }
}
