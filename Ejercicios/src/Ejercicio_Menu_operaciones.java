public class Ejercicio_Menu_operaciones {
    public static void main(String[] args) {
        int a = 0;
        int b =5;
        int opcion = 4;

        switch (opcion){
            case 1:
                System.out.println("la suma es: "+(a+b));
                break;
            case 2:
                System.out.println("la resta es: "+(a-b));
                break;
            case 3:
                System.out.println("la multiplicacion es: "+ (a*b));
                break;
            case 4:
                if(b != 0){
                    System.out.println("la division es: "+ (a/b));
                }else {
                    System.out.println("no se puede dividir por 0");
                }
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
