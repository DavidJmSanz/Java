public class Ejercicio_Intercambio_Variables {
    public static void main(String[] args) {
        int num1, num2,memoria;
        num1 = 35;
        num2 = 20;
        memoria = 0;
        System.out.println("num1 era : "+ num1);
        System.out.println("num2 era : "+ num2);
        //logica
        memoria = num1;
        num1 = num2;
        num2 = memoria;
        //impresion
        System.out.println("num1 es : "+ num1);
        System.out.println("num2 es : "+ num2);
    }
}
