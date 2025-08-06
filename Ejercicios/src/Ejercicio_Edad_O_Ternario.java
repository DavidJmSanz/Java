import java.util.Scanner;

public class Ejercicio_Edad_O_Ternario {
    public static void main(String[] args) {
        int edad;
        String categoria;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la edad de la persona");
        edad = teclado.nextInt();
        categoria = edad>=18 ? "Mayor de edad" : "Menor de edad";
        System.out.println("la persona es: "+categoria);
    }
}
