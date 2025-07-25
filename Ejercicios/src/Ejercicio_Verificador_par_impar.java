public class Ejercicio_Verificador_par_impar {
    public static void main(String[] args) {
        int numero =5;
        int operacion= numero % 2;

        System.out.println(operacion);
        if (numero % 2 != 1){
            System.out.println("el numero "+ numero + " es impar");
        } else if (numero == 0) {
            System.out.println("el numero es 0, cambia el numero");
        }else {
            System.out.println("el numero "+ numero + " es par");
        }
    }
    }

