import java.util.Scanner;

public class Operador_Ternario {
    public static void main(String[] args) {
        double calificacion;
        String NotaFinal;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Digite la Nota del estudiante");
        calificacion = Teclado.nextDouble();
        NotaFinal = calificacion>=6 ? "Aprovo" : "Perdio";
        System.out.println("El estudiante "+ NotaFinal);
    }
}
